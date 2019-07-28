package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to update the field's result.
  */
@js.native
trait UpdateFieldCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the UpdateFieldCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): Boolean = js.native
  /**
    * Executes the UpdateFieldCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param callback A callback function that is performed when updating of all fields in the selection is completed.
    */
  def execute(callback: js.Function): Boolean = js.native
}

