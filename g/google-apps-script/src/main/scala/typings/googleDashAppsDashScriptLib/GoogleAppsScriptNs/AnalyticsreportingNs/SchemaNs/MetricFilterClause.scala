package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricFilterClause extends js.Object {
  var filters: js.UndefOr[js.Array[MetricFilter]] = js.undefined
  var operator: js.UndefOr[java.lang.String] = js.undefined
}

object MetricFilterClause {
  @scala.inline
  def apply(filters: js.Array[MetricFilter] = null, operator: java.lang.String = null): MetricFilterClause = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    __obj.asInstanceOf[MetricFilterClause]
  }
}

