package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricFilter extends js.Object {
  var comparisonValue: js.UndefOr[String] = js.native
  var metricName: js.UndefOr[String] = js.native
  var not: js.UndefOr[Boolean] = js.native
  var operator: js.UndefOr[String] = js.native
}

object MetricFilter {
  @scala.inline
  def apply(): MetricFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricFilter]
  }
  @scala.inline
  implicit class MetricFilterOps[Self <: MetricFilter] (val x: Self) extends AnyVal {
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
    def setComparisonValue(value: String): Self = this.set("comparisonValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisonValue: Self = this.set("comparisonValue", js.undefined)
    @scala.inline
    def setMetricName(value: String): Self = this.set("metricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("metricName", js.undefined)
    @scala.inline
    def setNot(value: Boolean): Self = this.set("not", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
  }
  
}

