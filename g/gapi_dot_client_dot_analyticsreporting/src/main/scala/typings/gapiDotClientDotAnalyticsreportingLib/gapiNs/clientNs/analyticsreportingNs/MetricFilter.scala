package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricFilter extends js.Object {
  /** The value to compare against. */
  var comparisonValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The metric that will be filtered on. A metricFilter must contain a metric
    * name. A metric name can be an alias earlier defined as a metric or it can
    * also be a metric expression.
    */
  var metricName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Logical `NOT` operator. If this boolean is set to true, then the matching
    * metric values will be excluded in the report. The default is false.
    */
  var not: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Is the metric `EQUAL`, `LESS_THAN` or `GREATER_THAN` the
    * comparisonValue, the default is `EQUAL`. If the operator is
    * `IS_MISSING`, checks if the metric is missing and would ignore the
    * comparisonValue.
    */
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

