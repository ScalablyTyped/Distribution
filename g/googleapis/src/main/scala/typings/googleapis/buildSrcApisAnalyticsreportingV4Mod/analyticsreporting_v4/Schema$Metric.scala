package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Metrics](https://support.google.com/analytics/answer/1033861) are the
  * quantitative measurements. For example, the metric `ga:users` indicates the
  * total number of users for the requested time period.
  */
@js.native
trait Schema$Metric extends js.Object {
  /**
    * An alias for the metric expression is an alternate name for the
    * expression. The alias can be used for filtering and sorting. This field
    * is optional and is useful if the expression is not a single metric but a
    * complex expression which cannot be used in filtering and sorting. The
    * alias is also used in the response column header.
    */
  var alias: js.UndefOr[String] = js.native
  /**
    * A metric expression in the request. An expression is constructed from one
    * or more metrics and numbers. Accepted operators include: Plus (+), Minus
    * (-), Negation (Unary -), Divided by (/), Multiplied by (*), Parenthesis,
    * Positive cardinal numbers (0-9), can include decimals and is limited to
    * 1024 characters. Example `ga:totalRefunds/ga:users`, in most cases the
    * metric expression is just a single metric name like `ga:users`. Adding
    * mixed `MetricType` (E.g., `CURRENCY` + `PERCENTAGE`) metrics will result
    * in unexpected results.
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * Specifies how the metric expression should be formatted, for example
    * `INTEGER`.
    */
  var formattingType: js.UndefOr[String] = js.native
}

object Schema$Metric {
  @scala.inline
  def apply(alias: String = null, expression: String = null, formattingType: String = null): Schema$Metric = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (formattingType != null) __obj.updateDynamic("formattingType")(formattingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Metric]
  }
}

