package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

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
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue.asInstanceOf[js.Any])
    if (maxComparisonValue != null) __obj.updateDynamic("maxComparisonValue")(maxComparisonValue.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentMetricFilter]
  }
}

