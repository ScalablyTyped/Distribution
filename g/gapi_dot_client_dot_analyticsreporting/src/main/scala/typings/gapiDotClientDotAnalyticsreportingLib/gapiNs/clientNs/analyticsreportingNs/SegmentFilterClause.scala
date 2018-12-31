package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentFilterClause extends js.Object {
  /** Dimension Filter for the segment definition. */
  var dimensionFilter: js.UndefOr[SegmentDimensionFilter] = js.undefined
  /** Metric Filter for the segment definition. */
  var metricFilter: js.UndefOr[SegmentMetricFilter] = js.undefined
  /** Matches the complement (`!`) of the filter. */
  var not: js.UndefOr[scala.Boolean] = js.undefined
}

