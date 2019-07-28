package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReachReportCompatibleFields extends js.Object {
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.undefined
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  var pivotedActivityMetrics: js.UndefOr[js.Array[Metric]] = js.undefined
  var reachByFrequencyMetrics: js.UndefOr[js.Array[Metric]] = js.undefined
}

object ReachReportCompatibleFields {
  @scala.inline
  def apply(
    dimensionFilters: js.Array[Dimension] = null,
    dimensions: js.Array[Dimension] = null,
    kind: String = null,
    metrics: js.Array[Metric] = null,
    pivotedActivityMetrics: js.Array[Metric] = null,
    reachByFrequencyMetrics: js.Array[Metric] = null
  ): ReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (pivotedActivityMetrics != null) __obj.updateDynamic("pivotedActivityMetrics")(pivotedActivityMetrics)
    if (reachByFrequencyMetrics != null) __obj.updateDynamic("reachByFrequencyMetrics")(reachByFrequencyMetrics)
    __obj.asInstanceOf[ReachReportCompatibleFields]
  }
}

