package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowData extends js.Object {
  var values: js.UndefOr[js.Array[CellData]] = js.undefined
}

object RowData {
  @scala.inline
  def apply(values: js.Array[CellData] = null): RowData = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[RowData]
  }
}

