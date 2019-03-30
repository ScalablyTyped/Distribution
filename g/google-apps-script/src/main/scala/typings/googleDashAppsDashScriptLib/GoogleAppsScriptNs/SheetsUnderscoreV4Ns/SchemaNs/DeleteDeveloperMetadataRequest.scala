package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeveloperMetadataRequest extends js.Object {
  var dataFilter: js.UndefOr[DataFilter] = js.undefined
}

object DeleteDeveloperMetadataRequest {
  @scala.inline
  def apply(dataFilter: DataFilter = null): DeleteDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter)
    __obj.asInstanceOf[DeleteDeveloperMetadataRequest]
  }
}

