package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to change the strikeout formatting of characters in a selected range.
 */
@js.native
trait ChangeFontStrikeoutCommand extends CommandWithBooleanStateBase {
  /**
       * Executes the ChangeFontStrikeoutCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       */
  def execute(): scala.Boolean = js.native
  /**
       * Executes the ChangeFontStrikeoutCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param fontStrikeout true to apply strikeout formatting to the text, false to remove strikeout formatting.
       */
  def execute(fontStrikeout: scala.Boolean): scala.Boolean = js.native
}

