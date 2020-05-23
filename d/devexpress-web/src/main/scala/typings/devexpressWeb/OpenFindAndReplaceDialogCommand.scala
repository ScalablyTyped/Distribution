package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Find and Replace dialog.
  */
trait OpenFindAndReplaceDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenFindAndReplaceDialogCommand command.
    */
  def execute(): Boolean
}

object OpenFindAndReplaceDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenFindAndReplaceDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenFindAndReplaceDialogCommand]
  }
}

