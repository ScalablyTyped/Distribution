package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchClearValuesByDataFilterRequest extends js.Object {
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
}

object BatchClearValuesByDataFilterRequest {
  @scala.inline
  def apply(dataFilters: js.Array[DataFilter] = null): BatchClearValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters)
    __obj.asInstanceOf[BatchClearValuesByDataFilterRequest]
  }
}

