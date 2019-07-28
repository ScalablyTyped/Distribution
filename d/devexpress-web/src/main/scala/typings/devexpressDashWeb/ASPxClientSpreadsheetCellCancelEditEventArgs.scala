package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CellCancelEdit event.
  */
trait ASPxClientSpreadsheetCellCancelEditEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the active cell's column index.
    * Value: An integer value specifying the zero-based column index.
    */
  var columnIndex: Double
  /**
    * Gets the active cell's formula.
    * Value: A string value specifying the formula.
    */
  var formula: String
  /**
    * Gets the active cell's row index.
    * Value: An integer value specifying the zero-based row index.
    */
  var rowIndex: Double
  /**
    * Gets the current worksheet's name.
    * Value: A string value specifying the current worksheet's name.
    */
  var sheetName: String
  /**
    * Gets the active cell's current value.
    * Value: A string value specifying the cell's value
    */
  var value: String
}

object ASPxClientSpreadsheetCellCancelEditEventArgs {
  @scala.inline
  def apply(columnIndex: Double, formula: String, rowIndex: Double, sheetName: String, value: String): ASPxClientSpreadsheetCellCancelEditEventArgs = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex, formula = formula, rowIndex = rowIndex, sheetName = sheetName, value = value)
  
    __obj.asInstanceOf[ASPxClientSpreadsheetCellCancelEditEventArgs]
  }
}

