package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentDimensionFilter extends js.Object {
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var dimensionName: js.UndefOr[java.lang.String] = js.undefined
  var expressions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxComparisonValue: js.UndefOr[java.lang.String] = js.undefined
  var minComparisonValue: js.UndefOr[java.lang.String] = js.undefined
  var operator: js.UndefOr[java.lang.String] = js.undefined
}

object SegmentDimensionFilter {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    dimensionName: java.lang.String = null,
    expressions: js.Array[java.lang.String] = null,
    maxComparisonValue: java.lang.String = null,
    minComparisonValue: java.lang.String = null,
    operator: java.lang.String = null
  ): SegmentDimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (expressions != null) __obj.updateDynamic("expressions")(expressions)
    if (maxComparisonValue != null) __obj.updateDynamic("maxComparisonValue")(maxComparisonValue)
    if (minComparisonValue != null) __obj.updateDynamic("minComparisonValue")(minComparisonValue)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    __obj.asInstanceOf[SegmentDimensionFilter]
  }
}

