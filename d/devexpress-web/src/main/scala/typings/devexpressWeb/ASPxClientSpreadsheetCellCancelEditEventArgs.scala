package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.CellCancelEdit event.
  */
@js.native
trait ASPxClientSpreadsheetCellCancelEditEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the active cell's column index.
    */
  var columnIndex: Double = js.native
  
  /**
    * Specifies the text displayed in the processed cell.
    */
  var displayText: String = js.native
  
  /**
    * Gets the active cell's formula.
    */
  var formula: String = js.native
  
  /**
    * Gets the active cell's row index.
    */
  var rowIndex: Double = js.native
  
  /**
    * Gets the current worksheet's name.
    */
  var sheetName: String = js.native
  
  /**
    * Gets the active cell's current value.
    */
  var value: String = js.native
}
object ASPxClientSpreadsheetCellCancelEditEventArgs {
  
  @scala.inline
  def apply(
    columnIndex: Double,
    displayText: String,
    formula: String,
    rowIndex: Double,
    sheetName: String,
    value: String
  ): ASPxClientSpreadsheetCellCancelEditEventArgs = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], displayText = displayText.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetCellCancelEditEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientSpreadsheetCellCancelEditEventArgsMutableBuilder[Self <: ASPxClientSpreadsheetCellCancelEditEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
