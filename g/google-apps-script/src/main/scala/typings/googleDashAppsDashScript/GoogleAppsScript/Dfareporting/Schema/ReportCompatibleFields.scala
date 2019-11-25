package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportCompatibleFields extends js.Object {
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.undefined
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  var pivotedActivityMetrics: js.UndefOr[js.Array[Metric]] = js.undefined
}

object ReportCompatibleFields {
  @scala.inline
  def apply(
    dimensionFilters: js.Array[Dimension] = null,
    dimensions: js.Array[Dimension] = null,
    kind: String = null,
    metrics: js.Array[Metric] = null,
    pivotedActivityMetrics: js.Array[Metric] = null
  ): ReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (pivotedActivityMetrics != null) __obj.updateDynamic("pivotedActivityMetrics")(pivotedActivityMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportCompatibleFields]
  }
}

