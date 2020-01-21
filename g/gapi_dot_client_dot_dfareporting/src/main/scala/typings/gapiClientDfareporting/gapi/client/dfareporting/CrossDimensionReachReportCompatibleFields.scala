package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossDimensionReachReportCompatibleFields extends js.Object {
  /** Dimensions which are compatible to be selected in the "breakdown" section of the report. */
  var breakdown: js.UndefOr[js.Array[Dimension]] = js.undefined
  /** Dimensions which are compatible to be selected in the "dimensionFilters" section of the report. */
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.undefined
  /** The kind of resource this is, in this case dfareporting#crossDimensionReachReportCompatibleFields. */
  var kind: js.UndefOr[String] = js.undefined
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  /** Metrics which are compatible to be selected in the "overlapMetricNames" section of the report. */
  var overlapMetrics: js.UndefOr[js.Array[Metric]] = js.undefined
}

object CrossDimensionReachReportCompatibleFields {
  @scala.inline
  def apply(
    breakdown: js.Array[Dimension] = null,
    dimensionFilters: js.Array[Dimension] = null,
    kind: String = null,
    metrics: js.Array[Metric] = null,
    overlapMetrics: js.Array[Metric] = null
  ): CrossDimensionReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (breakdown != null) __obj.updateDynamic("breakdown")(breakdown.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (overlapMetrics != null) __obj.updateDynamic("overlapMetrics")(overlapMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossDimensionReachReportCompatibleFields]
  }
}

