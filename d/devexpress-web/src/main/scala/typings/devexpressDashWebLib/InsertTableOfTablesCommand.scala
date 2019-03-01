package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to create a table of tables.
  */
trait InsertTableOfTablesCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableOfTablesCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

object InsertTableOfTablesCommand {
  @scala.inline
  def apply(execute: js.Function0[scala.Boolean], getState: js.Function0[SimpleCommandState]): InsertTableOfTablesCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[InsertTableOfTablesCommand]
  }
}

