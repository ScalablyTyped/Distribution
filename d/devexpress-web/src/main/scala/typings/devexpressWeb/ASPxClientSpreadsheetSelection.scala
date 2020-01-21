package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the selection in the Spreadsheet.
  */
@JSGlobal("ASPxClientSpreadsheetSelection")
@js.native
class ASPxClientSpreadsheetSelection () extends js.Object {
  /**
    * Gets the column index of the active cell.
    */
  var activeCellColumnIndex: Double = js.native
  /**
    * Gets the row index of the active cell.
    */
  var activeCellRowIndex: Double = js.native
  /**
    * Gets the index of the selection's bottom row.
    */
  var bottomRowIndex: Double = js.native
  /**
    * Gets the index of the selection's left column.
    */
  var leftColumnIndex: Double = js.native
  /**
    * Gets the index of the selection's right column.
    */
  var rightColumnIndex: Double = js.native
  /**
    * Gets the index of the selection's top row.
    */
  var topRowIndex: Double = js.native
}

