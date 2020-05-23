package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Font dialog allowing end-users to change the font, size and style of the selected text.
  */
trait OpenFontFormattingDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenFontFormattingDialogCommand command.
    */
  def execute(): Boolean
}

object OpenFontFormattingDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenFontFormattingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenFontFormattingDialogCommand]
  }
}

