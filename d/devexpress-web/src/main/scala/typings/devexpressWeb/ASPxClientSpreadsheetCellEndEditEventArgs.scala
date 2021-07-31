package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.CellEndEdit event.
  */
trait ASPxClientSpreadsheetCellEndEditEventArgs
  extends StObject
     with ASPxClientSpreadsheetCellBeginEditEventArgs {
  
  /**
    * Gets or sets the text stored within the active cell's editor.
    */
  var editorText: String
}
object ASPxClientSpreadsheetCellEndEditEventArgs {
  
  @scala.inline
  def apply(
    cancel: Boolean,
    columnIndex: Double,
    displayText: String,
    editorText: String,
    formula: String,
    rowIndex: Double,
    sheetName: String,
    value: String
  ): ASPxClientSpreadsheetCellEndEditEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], displayText = displayText.asInstanceOf[js.Any], editorText = editorText.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetCellEndEditEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientSpreadsheetCellEndEditEventArgsMutableBuilder[Self <: ASPxClientSpreadsheetCellEndEditEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditorText(value: String): Self = StObject.set(x, "editorText", value.asInstanceOf[js.Any])
  }
}
