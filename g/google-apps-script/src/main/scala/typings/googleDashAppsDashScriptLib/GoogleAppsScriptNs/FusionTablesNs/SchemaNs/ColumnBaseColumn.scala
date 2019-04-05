package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnBaseColumn extends js.Object {
  var columnId: js.UndefOr[scala.Double] = js.undefined
  var tableIndex: js.UndefOr[scala.Double] = js.undefined
}

object ColumnBaseColumn {
  @scala.inline
  def apply(columnId: scala.Int | scala.Double = null, tableIndex: scala.Int | scala.Double = null): ColumnBaseColumn = {
    val __obj = js.Dynamic.literal()
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (tableIndex != null) __obj.updateDynamic("tableIndex")(tableIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnBaseColumn]
  }
}

