package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricFilterClause extends js.Object {
  var filters: js.UndefOr[js.Array[MetricFilter]] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
}

object MetricFilterClause {
  @scala.inline
  def apply(filters: js.Array[MetricFilter] = null, operator: String = null): MetricFilterClause = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricFilterClause]
  }
}

