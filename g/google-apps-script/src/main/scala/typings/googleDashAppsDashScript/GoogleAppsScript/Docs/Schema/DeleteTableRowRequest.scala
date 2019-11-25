package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTableRowRequest extends js.Object {
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.undefined
}

object DeleteTableRowRequest {
  @scala.inline
  def apply(tableCellLocation: TableCellLocation = null): DeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    if (tableCellLocation != null) __obj.updateDynamic("tableCellLocation")(tableCellLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTableRowRequest]
  }
}

