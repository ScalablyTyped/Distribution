package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.CellBeginEdit event.
  */
trait ASPxClientSpreadsheetCellBeginEditEventArgs extends ASPxClientCancelEventArgs {
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

object ASPxClientSpreadsheetCellBeginEditEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    columnIndex: Double,
    formula: String,
    rowIndex: Double,
    sheetName: String,
    value: String
  ): ASPxClientSpreadsheetCellBeginEditEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetCellBeginEditEventArgs]
  }
}

