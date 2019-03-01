package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentMetricFilter extends js.Object {
  /**
    * The value to compare against. If the operator is `BETWEEN`, this value is
    * treated as minimum comparison value.
    */
  var comparisonValue: js.UndefOr[java.lang.String] = js.undefined
  /** Max comparison value is only used for `BETWEEN` operator. */
  var maxComparisonValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The metric that will be filtered on. A `metricFilter` must contain a
    * metric name.
    */
  var metricName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies is the operation to perform to compare the metric. The default
    * is `EQUAL`.
    */
  var operator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Scope for a metric defines the level at which that metric is defined.  The
    * specified metric scope must be equal to or greater than its primary scope
    * as defined in the data model. The primary scope is defined by if the
    * segment is selecting users or sessions.
    */
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

