package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to delete the selected table cells with a horizontal shift.
  */
trait DeleteTableCellsWithShiftHorizontallyCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the DeleteTableCellsWithShiftHorizontallyCommand command.
    */
  def execute(): Boolean
}

object DeleteTableCellsWithShiftHorizontallyCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteTableCellsWithShiftHorizontallyCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteTableCellsWithShiftHorizontallyCommand]
  }
}

