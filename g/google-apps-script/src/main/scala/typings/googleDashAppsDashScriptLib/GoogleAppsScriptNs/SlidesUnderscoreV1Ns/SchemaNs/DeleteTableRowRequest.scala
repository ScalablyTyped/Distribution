package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTableRowRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var tableObjectId: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteTableRowRequest {
  @scala.inline
  def apply(cellLocation: TableCellLocation = null, tableObjectId: java.lang.String = null): DeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId)
    __obj.asInstanceOf[DeleteTableRowRequest]
  }
}

