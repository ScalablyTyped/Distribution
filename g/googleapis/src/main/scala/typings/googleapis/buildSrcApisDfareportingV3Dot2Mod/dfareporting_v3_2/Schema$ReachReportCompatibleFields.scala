package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents fields that are compatible to be selected for a report of type
  * &quot;REACH&quot;.
  */
@js.native
trait Schema$ReachReportCompatibleFields extends js.Object {
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;dimensionFilters&quot; section of the report.
    */
  var dimensionFilters: js.UndefOr[js.Array[Schema$Dimension]] = js.native
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;dimensions&quot; section of the report.
    */
  var dimensions: js.UndefOr[js.Array[Schema$Dimension]] = js.native
  /**
    * The kind of resource this is, in this case
    * dfareporting#reachReportCompatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metrics which are compatible to be selected in the
    * &quot;metricNames&quot; section of the report.
    */
  var metrics: js.UndefOr[js.Array[Schema$Metric]] = js.native
  /**
    * Metrics which are compatible to be selected as activity metrics to pivot
    * on in the &quot;activities&quot; section of the report.
    */
  var pivotedActivityMetrics: js.UndefOr[js.Array[Schema$Metric]] = js.native
  /**
    * Metrics which are compatible to be selected in the
    * &quot;reachByFrequencyMetricNames&quot; section of the report.
    */
  var reachByFrequencyMetrics: js.UndefOr[js.Array[Schema$Metric]] = js.native
}

object Schema$ReachReportCompatibleFields {
  @scala.inline
  def apply(
    dimensionFilters: js.Array[Schema$Dimension] = null,
    dimensions: js.Array[Schema$Dimension] = null,
    kind: String = null,
    metrics: js.Array[Schema$Metric] = null,
    pivotedActivityMetrics: js.Array[Schema$Metric] = null,
    reachByFrequencyMetrics: js.Array[Schema$Metric] = null
  ): Schema$ReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (pivotedActivityMetrics != null) __obj.updateDynamic("pivotedActivityMetrics")(pivotedActivityMetrics.asInstanceOf[js.Any])
    if (reachByFrequencyMetrics != null) __obj.updateDynamic("reachByFrequencyMetrics")(reachByFrequencyMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReachReportCompatibleFields]
  }
}

