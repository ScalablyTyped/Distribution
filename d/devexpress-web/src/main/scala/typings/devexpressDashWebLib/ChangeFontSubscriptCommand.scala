package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to change the subscript formatting of characters in the selected range.
 */
@js.native
trait ChangeFontSubscriptCommand extends CommandWithBooleanStateBase {
  /**
       * Executes the ChangeFontSubscriptCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       */
  def execute(): scala.Boolean = js.native
  /**
       * Executes the ChangeFontSubscriptCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param fontSubscript true to apply subscript formatting to the text, false to remove subscript formatting.
       */
  def execute(fontSubscript: scala.Boolean): scala.Boolean = js.native
}

