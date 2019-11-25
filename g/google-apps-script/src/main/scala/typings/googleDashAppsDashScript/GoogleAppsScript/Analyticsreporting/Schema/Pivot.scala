package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pivot extends js.Object {
  var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.undefined
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  var maxGroupCount: js.UndefOr[Double] = js.undefined
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  var startGroup: js.UndefOr[Double] = js.undefined
}

object Pivot {
  @scala.inline
  def apply(
    dimensionFilterClauses: js.Array[DimensionFilterClause] = null,
    dimensions: js.Array[Dimension] = null,
    maxGroupCount: Int | Double = null,
    metrics: js.Array[Metric] = null,
    startGroup: Int | Double = null
  ): Pivot = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilterClauses != null) __obj.updateDynamic("dimensionFilterClauses")(dimensionFilterClauses.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (maxGroupCount != null) __obj.updateDynamic("maxGroupCount")(maxGroupCount.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (startGroup != null) __obj.updateDynamic("startGroup")(startGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pivot]
  }
}

