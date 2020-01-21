package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentFilterClause extends js.Object {
  /** Dimension Filter for the segment definition. */
  var dimensionFilter: js.UndefOr[SegmentDimensionFilter] = js.undefined
  /** Metric Filter for the segment definition. */
  var metricFilter: js.UndefOr[SegmentMetricFilter] = js.undefined
  /** Matches the complement (`!`) of the filter. */
  var not: js.UndefOr[Boolean] = js.undefined
}

object SegmentFilterClause {
  @scala.inline
  def apply(
    dimensionFilter: SegmentDimensionFilter = null,
    metricFilter: SegmentMetricFilter = null,
    not: js.UndefOr[Boolean] = js.undefined
  ): SegmentFilterClause = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilter != null) __obj.updateDynamic("dimensionFilter")(dimensionFilter.asInstanceOf[js.Any])
    if (metricFilter != null) __obj.updateDynamic("metricFilter")(metricFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentFilterClause]
  }
}

