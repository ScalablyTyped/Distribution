package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's alignment position.
  */
trait ChangeFloatingObjectAlignmentPositionCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectAlignmentPositionCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A FloatingObjectAlignmentPositionSettings object specifying alignment position settings.
    */
  def execute(settings: FloatingObjectAlignmentPositionSettings): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectAlignmentPositionCommand {
  @scala.inline
  def apply(
    execute: js.Function1[FloatingObjectAlignmentPositionSettings, scala.Boolean],
    getState: js.Function0[js.Any]
  ): ChangeFloatingObjectAlignmentPositionCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[ChangeFloatingObjectAlignmentPositionCommand]
  }
}

