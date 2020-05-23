package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Hyperlink dialog.
  */
trait OpenInsertHyperlinkDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenInsertHyperlinkDialogCommand command.
    */
  def execute(): Boolean
}

object OpenInsertHyperlinkDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenInsertHyperlinkDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenInsertHyperlinkDialogCommand]
  }
}

