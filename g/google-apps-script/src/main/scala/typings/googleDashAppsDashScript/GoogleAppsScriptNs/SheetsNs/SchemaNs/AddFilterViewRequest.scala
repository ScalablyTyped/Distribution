package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddFilterViewRequest extends js.Object {
  var filter: js.UndefOr[FilterView] = js.undefined
}

object AddFilterViewRequest {
  @scala.inline
  def apply(filter: FilterView = null): AddFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[AddFilterViewRequest]
  }
}

