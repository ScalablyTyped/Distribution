package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents fields that are compatible to be selected for a report of type
  * &quot;CROSS_DIMENSION_REACH&quot;.
  */
@js.native
trait Schema$CrossDimensionReachReportCompatibleFields extends js.Object {
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;breakdown&quot; section of the report.
    */
  var breakdown: js.UndefOr[js.Array[Schema$Dimension]] = js.native
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;dimensionFilters&quot; section of the report.
    */
  var dimensionFilters: js.UndefOr[js.Array[Schema$Dimension]] = js.native
  /**
    * The kind of resource this is, in this case
    * dfareporting#crossDimensionReachReportCompatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metrics which are compatible to be selected in the
    * &quot;metricNames&quot; section of the report.
    */
  var metrics: js.UndefOr[js.Array[Schema$Metric]] = js.native
  /**
    * Metrics which are compatible to be selected in the
    * &quot;overlapMetricNames&quot; section of the report.
    */
  var overlapMetrics: js.UndefOr[js.Array[Schema$Metric]] = js.native
}

object Schema$CrossDimensionReachReportCompatibleFields {
  @scala.inline
  def apply(
    breakdown: js.Array[Schema$Dimension] = null,
    dimensionFilters: js.Array[Schema$Dimension] = null,
    kind: String = null,
    metrics: js.Array[Schema$Metric] = null,
    overlapMetrics: js.Array[Schema$Metric] = null
  ): Schema$CrossDimensionReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (breakdown != null) __obj.updateDynamic("breakdown")(breakdown.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (overlapMetrics != null) __obj.updateDynamic("overlapMetrics")(overlapMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CrossDimensionReachReportCompatibleFields]
  }
}

