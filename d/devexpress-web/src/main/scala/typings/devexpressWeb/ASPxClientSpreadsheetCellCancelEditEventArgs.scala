package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.CellCancelEdit event.
  */
trait ASPxClientSpreadsheetCellCancelEditEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the active cell's column index.
    */
  var columnIndex: Double
  /**
    * Gets the active cell's formula.
    */
  var formula: String
  /**
    * Gets the active cell's row index.
    */
  var rowIndex: Double
  /**
    * Gets the current worksheet's name.
    */
  var sheetName: String
  /**
    * Gets the active cell's current value.
    */
  var value: String
}

object ASPxClientSpreadsheetCellCancelEditEventArgs {
  @scala.inline
  def apply(columnIndex: Double, formula: String, rowIndex: Double, sheetName: String, value: String): ASPxClientSpreadsheetCellCancelEditEventArgs = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetCellCancelEditEventArgs]
  }
}

