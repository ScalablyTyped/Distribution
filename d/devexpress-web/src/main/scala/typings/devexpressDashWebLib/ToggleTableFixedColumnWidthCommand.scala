package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to disable automatic adjusting of the selected table.
  */
trait ToggleTableFixedColumnWidthCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the ToggleTableFixedColumnWidthCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

object ToggleTableFixedColumnWidthCommand {
  @scala.inline
  def apply(execute: js.Function0[scala.Boolean], getState: js.Function0[SimpleCommandState]): ToggleTableFixedColumnWidthCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[ToggleTableFixedColumnWidthCommand]
  }
}

