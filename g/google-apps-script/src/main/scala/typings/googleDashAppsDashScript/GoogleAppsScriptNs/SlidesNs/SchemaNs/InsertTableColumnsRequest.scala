package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTableColumnsRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var insertRight: js.UndefOr[Boolean] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
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
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (!js.isUndefined(insertRight)) __obj.updateDynamic("insertRight")(insertRight)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId)
    __obj.asInstanceOf[InsertTableColumnsRequest]
  }
}

