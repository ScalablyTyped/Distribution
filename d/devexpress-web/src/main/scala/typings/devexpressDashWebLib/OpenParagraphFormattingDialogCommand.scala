package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Paragraph dialog allowing end-users to set paragraph formatting.
  */
trait OpenParagraphFormattingDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenParagraphFormattingDialogCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

object OpenParagraphFormattingDialogCommand {
  @scala.inline
  def apply(execute: js.Function0[scala.Boolean], getState: js.Function0[SimpleCommandState]): OpenParagraphFormattingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[OpenParagraphFormattingDialogCommand]
  }
}

