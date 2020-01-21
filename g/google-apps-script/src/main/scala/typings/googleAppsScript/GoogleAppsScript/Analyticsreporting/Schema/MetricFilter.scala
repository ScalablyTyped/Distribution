package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

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
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricFilter]
  }
}

