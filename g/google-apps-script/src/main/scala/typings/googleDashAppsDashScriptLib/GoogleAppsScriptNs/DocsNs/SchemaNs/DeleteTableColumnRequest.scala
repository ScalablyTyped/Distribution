package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTableColumnRequest extends js.Object {
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.undefined
}

object DeleteTableColumnRequest {
  @scala.inline
  def apply(tableCellLocation: TableCellLocation = null): DeleteTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    if (tableCellLocation != null) __obj.updateDynamic("tableCellLocation")(tableCellLocation)
    __obj.asInstanceOf[DeleteTableColumnRequest]
  }
}

