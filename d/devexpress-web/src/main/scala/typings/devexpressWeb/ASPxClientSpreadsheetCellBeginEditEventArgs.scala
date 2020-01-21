package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.CellBeginEdit event.
  */
@JSGlobal("ASPxClientSpreadsheetCellBeginEditEventArgs")
@js.native
class ASPxClientSpreadsheetCellBeginEditEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetCellBeginEditEventArgs object. For internal use only.
    * @param columnIndex Gets the active cell's column index.
    * @param rowIndex Gets the active cell's row index.
    * @param formula Gets the active cell's formula.
    * @param value Gets the active cell's current value.
    * @param sheetName Gets the current worksheet's name.
    */
  def this(columnIndex: Double, rowIndex: Double, formula: String, value: String, sheetName: String) = this()
  /**
    * Gets the active cell's column index.
    */
  var columnIndex: Double = js.native
  /**
    * Gets the active cell's formula.
    */
  var formula: String = js.native
  /**
    * Gets the active cell's row index.
    */
  var rowIndex: Double = js.native
  /**
    * Gets the current worksheet's name.
    */
  var sheetName: String = js.native
  /**
    * Gets the active cell's current value.
    */
  var value: String = js.native
}

