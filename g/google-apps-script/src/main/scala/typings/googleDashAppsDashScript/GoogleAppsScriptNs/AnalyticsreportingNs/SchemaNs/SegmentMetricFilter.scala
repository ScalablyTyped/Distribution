package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentMetricFilter extends js.Object {
  var comparisonValue: js.UndefOr[String] = js.undefined
  var maxComparisonValue: js.UndefOr[String] = js.undefined
  var metricName: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
}

object SegmentMetricFilter {
  @scala.inline
  def apply(
    comparisonValue: String = null,
    maxComparisonValue: String = null,
    metricName: String = null,
    operator: String = null,
    scope: String = null
  ): SegmentMetricFilter = {
    val __obj = js.Dynamic.literal()
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue)
    if (maxComparisonValue != null) __obj.updateDynamic("maxComparisonValue")(maxComparisonValue)
    if (metricName != null) __obj.updateDynamic("metricName")(metricName)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[SegmentMetricFilter]
  }
}

