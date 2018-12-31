package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the selection in the Spreadsheet.
  */
trait ASPxClientSpreadsheetSelection extends js.Object {
  /**
    * Gets the column index of the active cell.
    * Value: An integer value specifying the active cell column index.
    */
  var activeCellColumnIndex: scala.Double
  /**
    * Gets the row index of the active cell.
    * Value: An integer value specifying the active cell row index.
    */
  var activeCellRowIndex: scala.Double
  /**
    * Gets the index of the selection's bottom row.
    * Value: An integer value specifying the index of the bottom row within the selection.
    */
  var bottomRowIndex: scala.Double
  /**
    * Gets the index of the selection's left column.
    * Value: An integer value specifying the index of the left column within the selection.
    */
  var leftColumnIndex: scala.Double
  /**
    * Gets the index of the selection's right column.
    * Value: An integer value specifying the index of the right column within the selection.
    */
  var rightColumnIndex: scala.Double
  /**
    * Gets the index of the selection's top row.
    * Value: An integer value specifying the index of the top row within the selection.
    */
  var topRowIndex: scala.Double
}

