package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterializedViewDefinition extends js.Object {
  var lastRefreshTime: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
}

object MaterializedViewDefinition {
  @scala.inline
  def apply(lastRefreshTime: java.lang.String = null, query: java.lang.String = null): MaterializedViewDefinition = {
    val __obj = js.Dynamic.literal()
    if (lastRefreshTime != null) __obj.updateDynamic("lastRefreshTime")(lastRefreshTime)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[MaterializedViewDefinition]
  }
}

