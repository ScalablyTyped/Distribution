package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

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
    maxGroupCount: js.UndefOr[Double] = js.undefined,
    metrics: js.Array[Metric] = null,
    startGroup: js.UndefOr[Double] = js.undefined
  ): Pivot = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilterClauses != null) __obj.updateDynamic("dimensionFilterClauses")(dimensionFilterClauses.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (!js.isUndefined(maxGroupCount)) __obj.updateDynamic("maxGroupCount")(maxGroupCount.get.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (!js.isUndefined(startGroup)) __obj.updateDynamic("startGroup")(startGroup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pivot]
  }
}

