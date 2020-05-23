package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTableRowsRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var insertBelow: js.UndefOr[Boolean] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var tableObjectId: js.UndefOr[String] = js.undefined
}

object InsertTableRowsRequest {
  @scala.inline
  def apply(
    cellLocation: TableCellLocation = null,
    insertBelow: js.UndefOr[Boolean] = js.undefined,
    number: js.UndefOr[Double] = js.undefined,
    tableObjectId: String = null
  ): InsertTableRowsRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(insertBelow)) __obj.updateDynamic("insertBelow")(insertBelow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertTableRowsRequest]
  }
}

