package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Insert Table dialog.
  */
trait OpenInsertTableDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenInsertTableDialogCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

object OpenInsertTableDialogCommand {
  @scala.inline
  def apply(execute: js.Function0[scala.Boolean], getState: js.Function0[SimpleCommandState]): OpenInsertTableDialogCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[OpenInsertTableDialogCommand]
  }
}

