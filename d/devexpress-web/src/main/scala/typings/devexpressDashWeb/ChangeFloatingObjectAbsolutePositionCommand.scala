package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change a floating object's absolute position.
  */
trait ChangeFloatingObjectAbsolutePositionCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectAbsolutePositionCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A FloatingObjectAbsolutePositionSettings object specifying object position settings.
    */
  def execute(settings: FloatingObjectAbsolutePositionSettings): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectAbsolutePositionCommand {
  @scala.inline
  def apply(execute: FloatingObjectAbsolutePositionSettings => Boolean, getState: () => js.Any): ChangeFloatingObjectAbsolutePositionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeFloatingObjectAbsolutePositionCommand]
  }
}

