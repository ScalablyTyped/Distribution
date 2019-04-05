package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTableRowsRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var insertBelow: js.UndefOr[scala.Boolean] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var tableObjectId: js.UndefOr[java.lang.String] = js.undefined
}

object InsertTableRowsRequest {
  @scala.inline
  def apply(
    cellLocation: TableCellLocation = null,
    insertBelow: js.UndefOr[scala.Boolean] = js.undefined,
    number: scala.Int | scala.Double = null,
    tableObjectId: java.lang.String = null
  ): InsertTableRowsRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (!js.isUndefined(insertBelow)) __obj.updateDynamic("insertBelow")(insertBelow)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId)
    __obj.asInstanceOf[InsertTableRowsRequest]
  }
}

