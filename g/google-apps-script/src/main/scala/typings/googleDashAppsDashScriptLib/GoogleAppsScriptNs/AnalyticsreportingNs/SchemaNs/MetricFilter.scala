package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricFilter extends js.Object {
  var comparisonValue: js.UndefOr[java.lang.String] = js.undefined
  var metricName: js.UndefOr[java.lang.String] = js.undefined
  var not: js.UndefOr[scala.Boolean] = js.undefined
  var operator: js.UndefOr[java.lang.String] = js.undefined
}

object MetricFilter {
  @scala.inline
  def apply(
    comparisonValue: java.lang.String = null,
    metricName: java.lang.String = null,
    not: js.UndefOr[scala.Boolean] = js.undefined,
    operator: java.lang.String = null
  ): MetricFilter = {
    val __obj = js.Dynamic.literal()
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue)
    if (metricName != null) __obj.updateDynamic("metricName")(metricName)
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    __obj.asInstanceOf[MetricFilter]
  }
}

