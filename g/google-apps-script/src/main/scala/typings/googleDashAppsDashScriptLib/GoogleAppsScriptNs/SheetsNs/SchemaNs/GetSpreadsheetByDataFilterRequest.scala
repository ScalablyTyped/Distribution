package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSpreadsheetByDataFilterRequest extends js.Object {
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  var includeGridData: js.UndefOr[scala.Boolean] = js.undefined
}

object GetSpreadsheetByDataFilterRequest {
  @scala.inline
  def apply(
    dataFilters: js.Array[DataFilter] = null,
    includeGridData: js.UndefOr[scala.Boolean] = js.undefined
  ): GetSpreadsheetByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters)
    if (!js.isUndefined(includeGridData)) __obj.updateDynamic("includeGridData")(includeGridData)
    __obj.asInstanceOf[GetSpreadsheetByDataFilterRequest]
  }
}

