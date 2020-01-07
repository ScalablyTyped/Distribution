package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter Clause to be used in a segment definition, can be wither a metric or
  * a dimension filter.
  */
@js.native
trait Schema$SegmentFilterClause extends js.Object {
  /**
    * Dimension Filter for the segment definition.
    */
  var dimensionFilter: js.UndefOr[Schema$SegmentDimensionFilter] = js.native
  /**
    * Metric Filter for the segment definition.
    */
  var metricFilter: js.UndefOr[Schema$SegmentMetricFilter] = js.native
  /**
    * Matches the complement (`!`) of the filter.
    */
  var not: js.UndefOr[Boolean] = js.native
}

object Schema$SegmentFilterClause {
  @scala.inline
  def apply(
    dimensionFilter: Schema$SegmentDimensionFilter = null,
    metricFilter: Schema$SegmentMetricFilter = null,
    not: js.UndefOr[Boolean] = js.undefined
  ): Schema$SegmentFilterClause = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilter != null) __obj.updateDynamic("dimensionFilter")(dimensionFilter.asInstanceOf[js.Any])
    if (metricFilter != null) __obj.updateDynamic("metricFilter")(metricFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SegmentFilterClause]
  }
}

