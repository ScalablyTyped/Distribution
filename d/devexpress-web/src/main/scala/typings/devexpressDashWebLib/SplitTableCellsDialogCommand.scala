package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Split Cells dialog.
  */
trait SplitTableCellsDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the SplitTableCellsDialogCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

object SplitTableCellsDialogCommand {
  @scala.inline
  def apply(execute: js.Function0[scala.Boolean], getState: js.Function0[SimpleCommandState]): SplitTableCellsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[SplitTableCellsDialogCommand]
  }
}

