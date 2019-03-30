package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportCompatibleFields extends js.Object {
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.undefined
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  var pivotedActivityMetrics: js.UndefOr[js.Array[Metric]] = js.undefined
}

object ReportCompatibleFields {
  @scala.inline
  def apply(
    dimensionFilters: js.Array[Dimension] = null,
    dimensions: js.Array[Dimension] = null,
    kind: java.lang.String = null,
    metrics: js.Array[Metric] = null,
    pivotedActivityMetrics: js.Array[Metric] = null
  ): ReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (pivotedActivityMetrics != null) __obj.updateDynamic("pivotedActivityMetrics")(pivotedActivityMetrics)
    __obj.asInstanceOf[ReportCompatibleFields]
  }
}

