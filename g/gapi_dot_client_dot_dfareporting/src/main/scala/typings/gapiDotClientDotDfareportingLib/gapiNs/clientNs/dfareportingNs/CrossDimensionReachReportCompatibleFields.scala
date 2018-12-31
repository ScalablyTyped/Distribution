package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossDimensionReachReportCompatibleFields extends js.Object {
  /** Dimensions which are compatible to be selected in the "breakdown" section of the report. */
  var breakdown: js.UndefOr[js.Array[Dimension]] = js.undefined
  /** Dimensions which are compatible to be selected in the "dimensionFilters" section of the report. */
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.undefined
  /** The kind of resource this is, in this case dfareporting#crossDimensionReachReportCompatibleFields. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  /** Metrics which are compatible to be selected in the "overlapMetricNames" section of the report. */
  var overlapMetrics: js.UndefOr[js.Array[Metric]] = js.undefined
}

