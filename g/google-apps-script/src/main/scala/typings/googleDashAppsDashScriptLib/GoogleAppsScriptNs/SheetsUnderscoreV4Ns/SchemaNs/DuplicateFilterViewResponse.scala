package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateFilterViewResponse extends js.Object {
  var filter: js.UndefOr[FilterView] = js.undefined
}

object DuplicateFilterViewResponse {
  @scala.inline
  def apply(filter: FilterView = null): DuplicateFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[DuplicateFilterViewResponse]
  }
}

