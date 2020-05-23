package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to set the page size.
  */
trait SetPageSizeDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the SetPageSizeDialogCommand command.
    */
  def execute(): Boolean
}

object SetPageSizeDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): SetPageSizeDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SetPageSizeDialogCommand]
  }
}

