package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CellEndEdit event.
  */
trait ASPxClientSpreadsheetCellEndEditEventArgs extends ASPxClientSpreadsheetCellBeginEditEventArgs {
  /**
    * Gets or sets the text stored within the active cell's editor.
    * Value: A string value that specifies the editor's text.
    */
  var editorText: String
}

object ASPxClientSpreadsheetCellEndEditEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    columnIndex: Double,
    editorText: String,
    formula: String,
    rowIndex: Double,
    sheetName: String,
    value: String
  ): ASPxClientSpreadsheetCellEndEditEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, columnIndex = columnIndex, editorText = editorText, formula = formula, rowIndex = rowIndex, sheetName = sheetName, value = value)
  
    __obj.asInstanceOf[ASPxClientSpreadsheetCellEndEditEventArgs]
  }
}

