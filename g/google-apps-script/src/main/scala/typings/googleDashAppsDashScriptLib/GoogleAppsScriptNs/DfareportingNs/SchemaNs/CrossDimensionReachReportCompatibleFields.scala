package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossDimensionReachReportCompatibleFields extends js.Object {
  var breakdown: js.UndefOr[js.Array[Dimension]] = js.undefined
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  var overlapMetrics: js.UndefOr[js.Array[Metric]] = js.undefined
}

object CrossDimensionReachReportCompatibleFields {
  @scala.inline
  def apply(
    breakdown: js.Array[Dimension] = null,
    dimensionFilters: js.Array[Dimension] = null,
    kind: java.lang.String = null,
    metrics: js.Array[Metric] = null,
    overlapMetrics: js.Array[Metric] = null
  ): CrossDimensionReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (breakdown != null) __obj.updateDynamic("breakdown")(breakdown)
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (overlapMetrics != null) __obj.updateDynamic("overlapMetrics")(overlapMetrics)
    __obj.asInstanceOf[CrossDimensionReachReportCompatibleFields]
  }
}

