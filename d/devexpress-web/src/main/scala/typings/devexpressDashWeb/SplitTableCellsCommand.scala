package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to split the selected table cells based on the specified options.
  */
trait SplitTableCellsCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the SplitTableCellsCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param rowCount An integer value specifying a number of rows in the split table cells.
    * @param columnCount An integer value specifying a number of columns in the split table cells.
    * @param mergeBeforeSplit true to merge the selected cells before the splitting; otherwise, false.
    */
  def execute(rowCount: Double, columnCount: Double, mergeBeforeSplit: Boolean): Boolean
}

object SplitTableCellsCommand {
  @scala.inline
  def apply(execute: (Double, Double, Boolean) => Boolean, getState: () => SimpleCommandState): SplitTableCellsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[SplitTableCellsCommand]
  }
}

