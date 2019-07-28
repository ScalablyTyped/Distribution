package typings.devexpressDashWeb

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
  var activeCellColumnIndex: Double
  /**
    * Gets the row index of the active cell.
    * Value: An integer value specifying the active cell row index.
    */
  var activeCellRowIndex: Double
  /**
    * Gets the index of the selection's bottom row.
    * Value: An integer value specifying the index of the bottom row within the selection.
    */
  var bottomRowIndex: Double
  /**
    * Gets the index of the selection's left column.
    * Value: An integer value specifying the index of the left column within the selection.
    */
  var leftColumnIndex: Double
  /**
    * Gets the index of the selection's right column.
    * Value: An integer value specifying the index of the right column within the selection.
    */
  var rightColumnIndex: Double
  /**
    * Gets the index of the selection's top row.
    * Value: An integer value specifying the index of the top row within the selection.
    */
  var topRowIndex: Double
}

object ASPxClientSpreadsheetSelection {
  @scala.inline
  def apply(
    activeCellColumnIndex: Double,
    activeCellRowIndex: Double,
    bottomRowIndex: Double,
    leftColumnIndex: Double,
    rightColumnIndex: Double,
    topRowIndex: Double
  ): ASPxClientSpreadsheetSelection = {
    val __obj = js.Dynamic.literal(activeCellColumnIndex = activeCellColumnIndex, activeCellRowIndex = activeCellRowIndex, bottomRowIndex = bottomRowIndex, leftColumnIndex = leftColumnIndex, rightColumnIndex = rightColumnIndex, topRowIndex = topRowIndex)
  
    __obj.asInstanceOf[ASPxClientSpreadsheetSelection]
  }
}

