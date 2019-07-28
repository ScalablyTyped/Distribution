package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to rotate a floating object.
  */
trait ChangeFloatingObjectRotationCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectRotationCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param rotation An integer value specifying the angle of rotation.
    */
  def execute(rotation: Double): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectRotationCommand {
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => js.Any): ChangeFloatingObjectRotationCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeFloatingObjectRotationCommand]
  }
}

