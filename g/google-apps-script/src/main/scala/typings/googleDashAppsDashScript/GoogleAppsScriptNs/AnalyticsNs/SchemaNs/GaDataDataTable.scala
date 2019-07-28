package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaDataDataTable extends js.Object {
  var cols: js.UndefOr[js.Array[GaDataDataTableCols]] = js.undefined
  var rows: js.UndefOr[js.Array[GaDataDataTableRows]] = js.undefined
}

object GaDataDataTable {
  @scala.inline
  def apply(cols: js.Array[GaDataDataTableCols] = null, rows: js.Array[GaDataDataTableRows] = null): GaDataDataTable = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[GaDataDataTable]
  }
}

