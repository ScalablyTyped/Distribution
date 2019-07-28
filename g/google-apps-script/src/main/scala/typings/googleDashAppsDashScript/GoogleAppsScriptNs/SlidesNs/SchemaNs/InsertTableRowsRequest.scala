package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

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

