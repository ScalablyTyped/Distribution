package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Bookmark dialog.
  */
trait OpenInsertBookmarkDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenInsertBookmarkDialogCommand command.
    */
  def execute(): Boolean
}

object OpenInsertBookmarkDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenInsertBookmarkDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenInsertBookmarkDialogCommand]
  }
}

