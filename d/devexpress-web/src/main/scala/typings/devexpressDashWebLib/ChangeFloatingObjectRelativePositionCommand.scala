package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's relative position.
  */
trait ChangeFloatingObjectRelativePositionCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectRelativePositionCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A FloatingObjectRelativePositionSettings object specifying relative positioin settings.
    */
  def execute(settings: FloatingObjectRelativePositionSettings): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectRelativePositionCommand {
  @scala.inline
  def apply(
    execute: js.Function1[FloatingObjectRelativePositionSettings, scala.Boolean],
    getState: js.Function0[js.Any]
  ): ChangeFloatingObjectRelativePositionCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[ChangeFloatingObjectRelativePositionCommand]
  }
}

