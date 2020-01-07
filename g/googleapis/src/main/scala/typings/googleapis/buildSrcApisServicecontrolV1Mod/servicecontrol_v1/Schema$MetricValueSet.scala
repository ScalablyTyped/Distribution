package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of metric values in the same metric. Each metric value in
  * the set should have a unique combination of start time, end time, and label
  * values.
  */
@js.native
trait Schema$MetricValueSet extends js.Object {
  /**
    * The metric name defined in the service configuration.
    */
  var metricName: js.UndefOr[String] = js.native
  /**
    * The values in this metric.
    */
  var metricValues: js.UndefOr[js.Array[Schema$MetricValue]] = js.native
}

object Schema$MetricValueSet {
  @scala.inline
  def apply(metricName: String = null, metricValues: js.Array[Schema$MetricValue] = null): Schema$MetricValueSet = {
    val __obj = js.Dynamic.literal()
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (metricValues != null) __obj.updateDynamic("metricValues")(metricValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MetricValueSet]
  }
}

