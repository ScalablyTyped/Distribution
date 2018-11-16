package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to display the selected field's field codes.
 */
@js.native
trait ShowFieldCodesCommand extends CommandWithSimpleStateBase {
  /**
       * Executes the ShowFieldCodesCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       */
  def execute(): scala.Boolean = js.native
  /**
       * Executes the ShowFieldCodesCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param showFieldCodes true to display field codes, false to hide field codes.
       */
  def execute(showFieldCodes: scala.Boolean): scala.Boolean = js.native
}

