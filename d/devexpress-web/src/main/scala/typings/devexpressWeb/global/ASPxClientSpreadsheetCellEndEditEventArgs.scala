package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.CellEndEdit event.
  */
@JSGlobal("ASPxClientSpreadsheetCellEndEditEventArgs")
@js.native
class ASPxClientSpreadsheetCellEndEditEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientSpreadsheetCellEndEditEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetCellEndEditEventArgs class with specified settings.
    * @param columnIndex The active cell's column index.
    * @param rowIndex The active cell's row index.
    * @param formula The active cell's formula.
    * @param value The active cell's current value.
    * @param displayText The text displayed in the active cell.
    * @param sheetName The current worksheet's name.
    * @param editorText The text stored in the active cell's editor.
    */
  def this(
    columnIndex: Double,
    rowIndex: Double,
    formula: String,
    value: String,
    displayText: String,
    sheetName: String,
    editorText: String
  ) = this()
}
