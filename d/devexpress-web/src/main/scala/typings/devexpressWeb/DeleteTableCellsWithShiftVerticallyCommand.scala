package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to delete the selected table cells with a vertical shift.
  */
trait DeleteTableCellsWithShiftVerticallyCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the DeleteTableCellsWithShiftVerticallyCommand command.
    */
  def execute(): Boolean
}

object DeleteTableCellsWithShiftVerticallyCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteTableCellsWithShiftVerticallyCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteTableCellsWithShiftVerticallyCommand]
  }
}

