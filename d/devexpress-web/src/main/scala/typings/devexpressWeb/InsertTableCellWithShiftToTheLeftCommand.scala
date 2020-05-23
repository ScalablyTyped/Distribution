package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert table cells with a horizontal shift into the selected table.
  */
trait InsertTableCellWithShiftToTheLeftCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableCellWithShiftToTheLeftCommand command.
    */
  def execute(): Boolean
}

object InsertTableCellWithShiftToTheLeftCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableCellWithShiftToTheLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableCellWithShiftToTheLeftCommand]
  }
}

