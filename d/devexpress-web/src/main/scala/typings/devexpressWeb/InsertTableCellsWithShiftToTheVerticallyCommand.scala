package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert table cells with a vertical shift into the selected table.
  */
trait InsertTableCellsWithShiftToTheVerticallyCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableCellsWithShiftToTheVerticallyCommand command.
    */
  def execute(): Boolean
}

object InsertTableCellsWithShiftToTheVerticallyCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableCellsWithShiftToTheVerticallyCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableCellsWithShiftToTheVerticallyCommand]
  }
}

