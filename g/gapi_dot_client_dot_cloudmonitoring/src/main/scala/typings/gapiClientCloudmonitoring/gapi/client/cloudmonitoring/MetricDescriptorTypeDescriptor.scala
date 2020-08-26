package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDescriptorTypeDescriptor extends js.Object {
  /** The method of collecting data for the metric. See Metric types. */
  var metricType: js.UndefOr[String] = js.native
  /** The data type of of individual points in the metric's time series. See Metric value types. */
  var valueType: js.UndefOr[String] = js.native
}

object MetricDescriptorTypeDescriptor {
  @scala.inline
  def apply(): MetricDescriptorTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDescriptorTypeDescriptor]
  }
  @scala.inline
  implicit class MetricDescriptorTypeDescriptorOps[Self <: MetricDescriptorTypeDescriptor] (val x: Self) extends AnyVal {
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
    def setMetricType(value: String): Self = this.set("metricType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricType: Self = this.set("metricType", js.undefined)
    @scala.inline
    def setValueType(value: String): Self = this.set("valueType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
  }
  
}

