package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddFilterViewResponse extends js.Object {
  var filter: js.UndefOr[FilterView] = js.undefined
}

object AddFilterViewResponse {
  @scala.inline
  def apply(filter: FilterView = null): AddFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[AddFilterViewResponse]
  }
}

