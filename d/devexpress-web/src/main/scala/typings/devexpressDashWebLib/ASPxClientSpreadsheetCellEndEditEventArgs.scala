package typings
package devexpressDashWebLib

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
  var editorText: java.lang.String
}

object ASPxClientSpreadsheetCellEndEditEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    columnIndex: scala.Double,
    editorText: java.lang.String,
    formula: java.lang.String,
    rowIndex: scala.Double,
    sheetName: java.lang.String,
    value: java.lang.String
  ): ASPxClientSpreadsheetCellEndEditEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, columnIndex = columnIndex, editorText = editorText, formula = formula, rowIndex = rowIndex, sheetName = sheetName, value = value)
  
    __obj.asInstanceOf[ASPxClientSpreadsheetCellEndEditEventArgs]
  }
}

