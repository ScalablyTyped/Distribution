package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to split the selected table cells based on the specified options.
  */
trait SplitTableCellsCommand extends StObject {
  
  /**
    * Executes the SplitTableCellsCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param rowCount An integer value specifying a number of rows in the split table cells.
    * @param columnCount An integer value specifying a number of columns in the split table cells.
    * @param mergeBeforeSplit true to merge the selected cells before the splitting; otherwise, false.
    */
  def execute(rowCount: Double, columnCount: Double, mergeBeforeSplit: Boolean): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}
object SplitTableCellsCommand {
  
  @scala.inline
  def apply(execute: (Double, Double, Boolean) => Boolean, getState: () => SimpleCommandState): SplitTableCellsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SplitTableCellsCommand]
  }
  
  @scala.inline
  implicit class SplitTableCellsCommandMutableBuilder[Self <: SplitTableCellsCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: (Double, Double, Boolean) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetState(value: () => SimpleCommandState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
