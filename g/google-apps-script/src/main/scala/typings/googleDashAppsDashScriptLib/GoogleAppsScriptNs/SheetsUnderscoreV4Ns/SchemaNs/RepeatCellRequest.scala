package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatCellRequest extends js.Object {
  var cell: js.UndefOr[CellData] = js.undefined
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
}

object RepeatCellRequest {
  @scala.inline
  def apply(cell: CellData = null, fields: java.lang.String = null, range: GridRange = null): RepeatCellRequest = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[RepeatCellRequest]
  }
}

