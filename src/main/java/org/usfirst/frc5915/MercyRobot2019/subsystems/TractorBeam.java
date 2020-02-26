/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5915.MercyRobot2019.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Talon;

/**
 * Add your docs here.
 */
public class TractorBeam extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private Talon lift;

  public TractorBeam() {
    lift = new Talon(7);
    addChild("lift", lift);
    lift.setInverted(false);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void forward() {
    lift.setSpeed(0.2);
  }

  public void backward() {
    lift.setSpeed(-0.2);
  }

  public void stop() {
    lift.setSpeed(0.0);
  }

}
