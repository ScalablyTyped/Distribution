package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

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
    number: js.UndefOr[Double] = js.undefined,
    tableObjectId: String = null
  ): InsertTableColumnsRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(insertRight)) __obj.updateDynamic("insertRight")(insertRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertTableColumnsRequest]
  }
}

