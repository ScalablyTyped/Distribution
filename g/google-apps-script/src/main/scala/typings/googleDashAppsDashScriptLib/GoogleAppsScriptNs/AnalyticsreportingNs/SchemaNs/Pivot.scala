package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pivot extends js.Object {
  var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.undefined
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  var maxGroupCount: js.UndefOr[scala.Double] = js.undefined
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  var startGroup: js.UndefOr[scala.Double] = js.undefined
}

object Pivot {
  @scala.inline
  def apply(
    dimensionFilterClauses: js.Array[DimensionFilterClause] = null,
    dimensions: js.Array[Dimension] = null,
    maxGroupCount: scala.Int | scala.Double = null,
    metrics: js.Array[Metric] = null,
    startGroup: scala.Int | scala.Double = null
  ): Pivot = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilterClauses != null) __obj.updateDynamic("dimensionFilterClauses")(dimensionFilterClauses)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (maxGroupCount != null) __obj.updateDynamic("maxGroupCount")(maxGroupCount.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (startGroup != null) __obj.updateDynamic("startGroup")(startGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pivot]
  }
}

