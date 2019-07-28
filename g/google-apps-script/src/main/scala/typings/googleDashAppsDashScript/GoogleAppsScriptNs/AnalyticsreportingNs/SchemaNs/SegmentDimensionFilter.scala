package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentDimensionFilter extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var dimensionName: js.UndefOr[String] = js.undefined
  var expressions: js.UndefOr[js.Array[String]] = js.undefined
  var maxComparisonValue: js.UndefOr[String] = js.undefined
  var minComparisonValue: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
}

object SegmentDimensionFilter {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    dimensionName: String = null,
    expressions: js.Array[String] = null,
    maxComparisonValue: String = null,
    minComparisonValue: String = null,
    operator: String = null
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

