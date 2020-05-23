package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.CellEndEdit event.
  */
trait ASPxClientSpreadsheetCellEndEditEventArgs extends ASPxClientSpreadsheetCellBeginEditEventArgs {
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
    editorText: String,
    formula: String,
    rowIndex: Double,
    sheetName: String,
    value: String
  ): ASPxClientSpreadsheetCellEndEditEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], editorText = editorText.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetCellEndEditEventArgs]
  }
}

