package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the superscript formatting of characters in a selected range.
  */
@js.native
trait ChangeFontSuperscriptCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ChangeFontSuperscriptCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean = js.native
  /**
    * Executes the ChangeFontSuperscriptCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param fontSuperscript true to apply superscript formatting to the text, false to remove superscript formatting.
    */
  def execute(fontSuperscript: scala.Boolean): scala.Boolean = js.native
}

