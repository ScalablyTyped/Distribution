package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricFilter extends js.Object {
  var comparisonValue: js.UndefOr[String] = js.undefined
  var metricName: js.UndefOr[String] = js.undefined
  var not: js.UndefOr[Boolean] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
}

object MetricFilter {
  @scala.inline
  def apply(
    comparisonValue: String = null,
    metricName: String = null,
    not: js.UndefOr[Boolean] = js.undefined,
    operator: String = null
  ): MetricFilter = {
    val __obj = js.Dynamic.literal()
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue)
    if (metricName != null) __obj.updateDynamic("metricName")(metricName)
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    __obj.asInstanceOf[MetricFilter]
  }
}

