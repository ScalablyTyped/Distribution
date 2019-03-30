package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFilterViewRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[FilterView] = js.undefined
}

object UpdateFilterViewRequest {
  @scala.inline
  def apply(fields: java.lang.String = null, filter: FilterView = null): UpdateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[UpdateFilterViewRequest]
  }
}

