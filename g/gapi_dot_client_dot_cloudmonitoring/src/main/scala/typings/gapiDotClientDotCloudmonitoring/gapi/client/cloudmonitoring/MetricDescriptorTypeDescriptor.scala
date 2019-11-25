package typings.gapiDotClientDotCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorTypeDescriptor extends js.Object {
  /** The method of collecting data for the metric. See Metric types. */
  var metricType: js.UndefOr[String] = js.undefined
  /** The data type of of individual points in the metric's time series. See Metric value types. */
  var valueType: js.UndefOr[String] = js.undefined
}

object MetricDescriptorTypeDescriptor {
  @scala.inline
  def apply(metricType: String = null, valueType: String = null): MetricDescriptorTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (metricType != null) __obj.updateDynamic("metricType")(metricType.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDescriptorTypeDescriptor]
  }
}

