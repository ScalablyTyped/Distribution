package typings
package devexpressDashWebLib

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
  var columnIndex: scala.Double
  /**
    * Gets the active cell's formula.
    * Value: A string value specifying the formula.
    */
  var formula: java.lang.String
  /**
    * Gets the active cell's row index.
    * Value: An integer value specifying the zero-based row index.
    */
  var rowIndex: scala.Double
  /**
    * Gets the current worksheet's name.
    * Value: A string value specifying the current worksheet's name.
    */
  var sheetName: java.lang.String
  /**
    * Gets the active cell's current value.
    * Value: A string value specifying the cell's value
    */
  var value: java.lang.String
}

object ASPxClientSpreadsheetCellCancelEditEventArgs {
  @scala.inline
  def apply(
    columnIndex: scala.Double,
    formula: java.lang.String,
    rowIndex: scala.Double,
    sheetName: java.lang.String,
    value: java.lang.String
  ): ASPxClientSpreadsheetCellCancelEditEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnIndex")(columnIndex)
    __obj.updateDynamic("formula")(formula)
    __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.updateDynamic("sheetName")(sheetName)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ASPxClientSpreadsheetCellCancelEditEventArgs]
  }
}

