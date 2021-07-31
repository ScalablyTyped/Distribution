package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to split the selected table cells based on the specified options.
  */
@JSGlobal("SplitTableCellsCommand")
@js.native
class SplitTableCellsCommand ()
  extends StObject
     with typings.devexpressWeb.SplitTableCellsCommand {
  
  /**
    * Executes the SplitTableCellsCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param rowCount An integer value specifying a number of rows in the split table cells.
    * @param columnCount An integer value specifying a number of columns in the split table cells.
    * @param mergeBeforeSplit true to merge the selected cells before the splitting; otherwise, false.
    */
  /* CompleteClass */
  override def execute(rowCount: Double, columnCount: Double, mergeBeforeSplit: Boolean): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
