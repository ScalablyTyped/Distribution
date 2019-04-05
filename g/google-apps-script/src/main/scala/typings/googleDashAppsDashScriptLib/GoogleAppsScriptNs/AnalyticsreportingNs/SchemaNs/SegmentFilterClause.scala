package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentFilterClause extends js.Object {
  var dimensionFilter: js.UndefOr[SegmentDimensionFilter] = js.undefined
  var metricFilter: js.UndefOr[SegmentMetricFilter] = js.undefined
  var not: js.UndefOr[scala.Boolean] = js.undefined
}

object SegmentFilterClause {
  @scala.inline
  def apply(
    dimensionFilter: SegmentDimensionFilter = null,
    metricFilter: SegmentMetricFilter = null,
    not: js.UndefOr[scala.Boolean] = js.undefined
  ): SegmentFilterClause = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilter != null) __obj.updateDynamic("dimensionFilter")(dimensionFilter)
    if (metricFilter != null) __obj.updateDynamic("metricFilter")(metricFilter)
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not)
    __obj.asInstanceOf[SegmentFilterClause]
  }
}

