package typings.gapiDotClientDotServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricValueSet extends js.Object {
  /** The metric name defined in the service configuration. */
  var metricName: js.UndefOr[String] = js.undefined
  /** The values in this metric. */
  var metricValues: js.UndefOr[js.Array[MetricValue]] = js.undefined
}

object MetricValueSet {
  @scala.inline
  def apply(metricName: String = null, metricValues: js.Array[MetricValue] = null): MetricValueSet = {
    val __obj = js.Dynamic.literal()
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (metricValues != null) __obj.updateDynamic("metricValues")(metricValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricValueSet]
  }
}

