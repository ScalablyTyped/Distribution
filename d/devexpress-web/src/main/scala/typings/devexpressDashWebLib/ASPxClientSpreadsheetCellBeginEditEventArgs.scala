package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CellBeginEdit event.
  */
trait ASPxClientSpreadsheetCellBeginEditEventArgs extends ASPxClientCancelEventArgs {
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
    * Value: A string value specifying the cell's value.
    */
  var value: java.lang.String
}

