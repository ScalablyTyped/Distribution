package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  /**
    * An alias for the metric expression is an alternate name for the
    * expression. The alias can be used for filtering and sorting. This field
    * is optional and is useful if the expression is not a single metric but
    * a complex expression which cannot be used in filtering and sorting.
    * The alias is also used in the response column header.
    */
  var alias: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A metric expression in the request. An expression is constructed from one
    * or more metrics and numbers. Accepted operators include: Plus (+), Minus
    * (-), Negation (Unary -), Divided by (/), Multiplied by (&#42;), Parenthesis,
    * Positive cardinal numbers (0-9), can include decimals and is limited to
    * 1024 characters. Example `ga:totalRefunds/ga:users`, in most cases the
    * metric expression is just a single metric name like `ga:users`.
    * Adding mixed `MetricType` (E.g., `CURRENCY` + `PERCENTAGE`) metrics
    * will result in unexpected results.
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies how the metric expression should be formatted, for example
    * `INTEGER`.
    */
  var formattingType: js.UndefOr[java.lang.String] = js.undefined
}

object Metric {
  @scala.inline
  def apply(
    alias: java.lang.String = null,
    expression: java.lang.String = null,
    formattingType: java.lang.String = null
  ): Metric = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (formattingType != null) __obj.updateDynamic("formattingType")(formattingType)
    __obj.asInstanceOf[Metric]
  }
}

