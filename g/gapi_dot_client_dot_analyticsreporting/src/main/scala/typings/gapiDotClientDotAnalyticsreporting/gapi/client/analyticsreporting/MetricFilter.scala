package typings.gapiDotClientDotAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricFilter extends js.Object {
  /** The value to compare against. */
  var comparisonValue: js.UndefOr[String] = js.undefined
  /**
    * The metric that will be filtered on. A metricFilter must contain a metric
    * name. A metric name can be an alias earlier defined as a metric or it can
    * also be a metric expression.
    */
  var metricName: js.UndefOr[String] = js.undefined
  /**
    * Logical `NOT` operator. If this boolean is set to true, then the matching
    * metric values will be excluded in the report. The default is false.
    */
  var not: js.UndefOr[Boolean] = js.undefined
  /**
    * Is the metric `EQUAL`, `LESS_THAN` or `GREATER_THAN` the
    * comparisonValue, the default is `EQUAL`. If the operator is
    * `IS_MISSING`, checks if the metric is missing and would ignore the
    * comparisonValue.
    */
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

