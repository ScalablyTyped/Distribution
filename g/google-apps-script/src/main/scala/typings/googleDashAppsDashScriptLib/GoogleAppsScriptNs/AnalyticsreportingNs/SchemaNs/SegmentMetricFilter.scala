package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentMetricFilter extends js.Object {
  var comparisonValue: js.UndefOr[java.lang.String] = js.undefined
  var maxComparisonValue: js.UndefOr[java.lang.String] = js.undefined
  var metricName: js.UndefOr[java.lang.String] = js.undefined
  var operator: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object SegmentMetricFilter {
  @scala.inline
  def apply(
    comparisonValue: java.lang.String = null,
    maxComparisonValue: java.lang.String = null,
    metricName: java.lang.String = null,
    operator: java.lang.String = null,
    scope: java.lang.String = null
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

