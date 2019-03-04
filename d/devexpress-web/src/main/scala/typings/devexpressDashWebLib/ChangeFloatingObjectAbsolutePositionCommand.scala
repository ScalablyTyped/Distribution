package typings
package devexpressDashWebLib

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
  def execute(settings: FloatingObjectAbsolutePositionSettings): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectAbsolutePositionCommand {
  @scala.inline
  def apply(
    execute: js.Function1[FloatingObjectAbsolutePositionSettings, scala.Boolean],
    getState: js.Function0[js.Any]
  ): ChangeFloatingObjectAbsolutePositionCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[ChangeFloatingObjectAbsolutePositionCommand]
  }
}

