package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Paragraph dialog allowing end-users to set paragraph formatting.
  */
trait OpenParagraphFormattingDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenParagraphFormattingDialogCommand command.
    */
  def execute(): Boolean
}

object OpenParagraphFormattingDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenParagraphFormattingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenParagraphFormattingDialogCommand]
  }
}

