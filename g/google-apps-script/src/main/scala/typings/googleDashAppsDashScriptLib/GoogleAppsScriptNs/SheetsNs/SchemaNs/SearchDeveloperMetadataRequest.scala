package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchDeveloperMetadataRequest extends js.Object {
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
}

object SearchDeveloperMetadataRequest {
  @scala.inline
  def apply(dataFilters: js.Array[DataFilter] = null): SearchDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters)
    __obj.asInstanceOf[SearchDeveloperMetadataRequest]
  }
}

