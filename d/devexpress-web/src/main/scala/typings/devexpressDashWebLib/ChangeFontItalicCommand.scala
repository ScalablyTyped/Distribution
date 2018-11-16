package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to change the italic formatting of characters in a selected range.
 */
@js.native
trait ChangeFontItalicCommand extends CommandWithBooleanStateBase {
  /**
       * Executes the ChangeFontItalicCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       */
  def execute(): scala.Boolean = js.native
  /**
       * Executes the ChangeFontItalicCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param fontItalic true to apply italic formatting to the text, false to remove italic formatting.
       */
  def execute(fontItalic: scala.Boolean): scala.Boolean = js.native
}

