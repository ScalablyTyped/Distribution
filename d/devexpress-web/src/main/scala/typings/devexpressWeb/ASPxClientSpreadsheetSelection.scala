package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the selection in the Spreadsheet.
  */
trait ASPxClientSpreadsheetSelection extends js.Object {
  /**
    * Gets the column index of the active cell.
    */
  var activeCellColumnIndex: Double
  /**
    * Gets the row index of the active cell.
    */
  var activeCellRowIndex: Double
  /**
    * Gets the index of the selection's bottom row.
    */
  var bottomRowIndex: Double
  /**
    * Gets the index of the selection's left column.
    */
  var leftColumnIndex: Double
  /**
    * Gets the index of the selection's right column.
    */
  var rightColumnIndex: Double
  /**
    * Gets the index of the selection's top row.
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
    val __obj = js.Dynamic.literal(activeCellColumnIndex = activeCellColumnIndex.asInstanceOf[js.Any], activeCellRowIndex = activeCellRowIndex.asInstanceOf[js.Any], bottomRowIndex = bottomRowIndex.asInstanceOf[js.Any], leftColumnIndex = leftColumnIndex.asInstanceOf[js.Any], rightColumnIndex = rightColumnIndex.asInstanceOf[js.Any], topRowIndex = topRowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetSelection]
  }
}

