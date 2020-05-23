package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Table Properties dialog.
  */
trait OpenTableFormattingDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenTableFormattingDialogCommand command.
    */
  def execute(): Boolean
}

object OpenTableFormattingDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenTableFormattingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenTableFormattingDialogCommand]
  }
}

