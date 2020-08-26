package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to split the selected table cells based on the specified options.
  */
@js.native
trait SplitTableCellsCommand extends js.Object {
  /**
    * Executes the SplitTableCellsCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param rowCount An integer value specifying a number of rows in the split table cells.
    * @param columnCount An integer value specifying a number of columns in the split table cells.
    * @param mergeBeforeSplit true to merge the selected cells before the splitting; otherwise, false.
    */
  def execute(rowCount: Double, columnCount: Double, mergeBeforeSplit: Boolean): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}

object SplitTableCellsCommand {
  @scala.inline
  def apply(execute: (Double, Double, Boolean) => Boolean, getState: () => SimpleCommandState): SplitTableCellsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SplitTableCellsCommand]
  }
  @scala.inline
  implicit class SplitTableCellsCommandOps[Self <: SplitTableCellsCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecute(value: (Double, Double, Boolean) => Boolean): Self = this.set("execute", js.Any.fromFunction3(value))
    @scala.inline
    def setGetState(value: () => SimpleCommandState): Self = this.set("getState", js.Any.fromFunction0(value))
  }
  
}

