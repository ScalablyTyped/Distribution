package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to update all fields in the selected range.
  */
@js.native
trait UpdateAllFieldsCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the UpdateAllFieldsCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean = js.native
  /**
    * Executes the UpdateAllFieldsCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param callback A callback function that is performed when updating of all fields in the document is completed.
    */
  def execute(callback: js.Function): scala.Boolean = js.native
}

