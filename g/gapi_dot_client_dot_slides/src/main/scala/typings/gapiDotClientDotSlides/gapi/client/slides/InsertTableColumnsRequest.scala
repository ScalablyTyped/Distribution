package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTableColumnsRequest extends js.Object {
  /**
    * The reference table cell location from which columns will be inserted.
    *
    * A new column will be inserted to the left (or right) of the column where
    * the reference cell is. If the reference cell is a merged cell, a new
    * column will be inserted to the left (or right) of the merged cell.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  /**
    * Whether to insert new columns to the right of the reference cell location.
    *
    * - `True`: insert to the right.
    * - `False`: insert to the left.
    */
  var insertRight: js.UndefOr[Boolean] = js.undefined
  /** The number of columns to be inserted. Maximum 20 per request. */
  var number: js.UndefOr[Double] = js.undefined
  /** The table to insert columns into. */
  var tableObjectId: js.UndefOr[String] = js.undefined
}

object InsertTableColumnsRequest {
  @scala.inline
  def apply(
    cellLocation: TableCellLocation = null,
    insertRight: js.UndefOr[Boolean] = js.undefined,
    number: Int | Double = null,
    tableObjectId: String = null
  ): InsertTableColumnsRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(insertRight)) __obj.updateDynamic("insertRight")(insertRight.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertTableColumnsRequest]
  }
}

