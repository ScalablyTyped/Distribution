package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTableRowsRequest extends js.Object {
  /**
    * The reference table cell location from which rows will be inserted.
    *
    * A new row will be inserted above (or below) the row where the reference
    * cell is. If the reference cell is a merged cell, a new row will be
    * inserted above (or below) the merged cell.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  /**
    * Whether to insert new rows below the reference cell location.
    *
    * - `True`: insert below the cell.
    * - `False`: insert above the cell.
    */
  var insertBelow: js.UndefOr[Boolean] = js.undefined
  /** The number of rows to be inserted. Maximum 20 per request. */
  var number: js.UndefOr[Double] = js.undefined
  /** The table to insert rows into. */
  var tableObjectId: js.UndefOr[String] = js.undefined
}

object InsertTableRowsRequest {
  @scala.inline
  def apply(
    cellLocation: TableCellLocation = null,
    insertBelow: js.UndefOr[Boolean] = js.undefined,
    number: Int | Double = null,
    tableObjectId: String = null
  ): InsertTableRowsRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (!js.isUndefined(insertBelow)) __obj.updateDynamic("insertBelow")(insertBelow)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId)
    __obj.asInstanceOf[InsertTableRowsRequest]
  }
}

