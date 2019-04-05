package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTableColumnRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var tableObjectId: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteTableColumnRequest {
  @scala.inline
  def apply(cellLocation: TableCellLocation = null, tableObjectId: java.lang.String = null): DeleteTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId)
    __obj.asInstanceOf[DeleteTableColumnRequest]
  }
}

