package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Delete Cells dialog.
  */
trait DeleteTableCellsDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the DeleteTableCellsDialogCommand command.
    */
  def execute(): Boolean
}

object DeleteTableCellsDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteTableCellsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteTableCellsDialogCommand]
  }
}

