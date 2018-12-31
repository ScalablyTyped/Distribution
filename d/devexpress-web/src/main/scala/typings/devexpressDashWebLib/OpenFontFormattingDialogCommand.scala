package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Font dialog allowing end-users to change the font, size and style of the selected text.
  */
trait OpenFontFormattingDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenFontFormattingDialogCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

