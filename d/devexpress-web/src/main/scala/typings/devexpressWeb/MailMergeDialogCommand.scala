package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gets a command to invoke the Export Range dialog to start a mail merge.
  */
trait MailMergeDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the MailMergeDialogCommand command.
    */
  def execute(): Boolean
}

object MailMergeDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): MailMergeDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MailMergeDialogCommand]
  }
}

