package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricValueSet extends js.Object {
  /** The metric name defined in the service configuration. */
  var metricName: js.UndefOr[String] = js.native
  /** The values in this metric. */
  var metricValues: js.UndefOr[js.Array[MetricValue]] = js.native
}

object MetricValueSet {
  @scala.inline
  def apply(): MetricValueSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricValueSet]
  }
  @scala.inline
  implicit class MetricValueSetOps[Self <: MetricValueSet] (val x: Self) extends AnyVal {
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
    def setMetricName(value: String): Self = this.set("metricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("metricName", js.undefined)
    @scala.inline
    def setMetricValuesVarargs(value: MetricValue*): Self = this.set("metricValues", js.Array(value :_*))
    @scala.inline
    def setMetricValues(value: js.Array[MetricValue]): Self = this.set("metricValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricValues: Self = this.set("metricValues", js.undefined)
  }
  
}

