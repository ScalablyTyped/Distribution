package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to change the bold formatting of characters in a selected range.
 */
@js.native
trait ChangeFontBoldCommand extends CommandWithBooleanStateBase {
  /**
       * Executes the ChangeFontBoldCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       */
  def execute(): scala.Boolean = js.native
  /**
       * Executes the ChangeFontBoldCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param fontBold true to apply bold formatting to the text, false to remove bold formatting.
       */
  def execute(fontBold: scala.Boolean): scala.Boolean = js.native
}

