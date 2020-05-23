package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Bulleted and Numbering dialog.
  */
trait OpenNumberingListDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenNumberingListDialogCommand command.
    */
  def execute(): Boolean
}

object OpenNumberingListDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenNumberingListDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenNumberingListDialogCommand]
  }
}

