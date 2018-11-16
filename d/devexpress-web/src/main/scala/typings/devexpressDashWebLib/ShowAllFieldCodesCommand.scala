package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to display all field codes in place of the fields in the document.
 */
@js.native
trait ShowAllFieldCodesCommand extends CommandWithSimpleStateBase {
  /**
       * Executes the ShowAllFieldCodesCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       */
  def execute(): scala.Boolean = js.native
  /**
       * Executes the ShowAllFieldCodesCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param showFieldCodes true to display field codes, false to hide field codes.
       */
  def execute(showFieldCodes: scala.Boolean): scala.Boolean = js.native
}

