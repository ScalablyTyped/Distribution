package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metric extends js.Object {
  /**
    * An alias for the metric expression is an alternate name for the
    * expression. The alias can be used for filtering and sorting. This field
    * is optional and is useful if the expression is not a single metric but
    * a complex expression which cannot be used in filtering and sorting.
    * The alias is also used in the response column header.
    */
  var alias: js.UndefOr[String] = js.native
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
  var expression: js.UndefOr[String] = js.native
  /**
    * Specifies how the metric expression should be formatted, for example
    * `INTEGER`.
    */
  var formattingType: js.UndefOr[String] = js.native
}

object Metric {
  @scala.inline
  def apply(): Metric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metric]
  }
  @scala.inline
  implicit class MetricOps[Self <: Metric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setFormattingType(value: String): Self = this.set("formattingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattingType: Self = this.set("formattingType", js.undefined)
  }
  
}

