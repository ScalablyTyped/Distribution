package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTableColumnRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var tableObjectId: js.UndefOr[String] = js.undefined
}

object DeleteTableColumnRequest {
  @scala.inline
  def apply(cellLocation: TableCellLocation = null, tableObjectId: String = null): DeleteTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTableColumnRequest]
  }
}

