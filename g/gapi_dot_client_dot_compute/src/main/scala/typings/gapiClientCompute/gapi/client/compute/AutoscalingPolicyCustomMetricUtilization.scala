package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoscalingPolicyCustomMetricUtilization extends js.Object {
  /**
    * The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative values and should be a utilization metric, which means that
    * the number of virtual machines handling requests should increase or decrease proportionally to the metric.
    *
    * The metric must have a value type of INT64 or DOUBLE.
    */
  var metric: js.UndefOr[String] = js.native
  /**
    * The target value of the metric that autoscaler should maintain. This must be a positive value.
    *
    * For example, a good metric to use as a utilization_target is compute.googleapis.com/instance/network/received_bytes_count. The autoscaler will work to
    * keep this value constant for each of the instances.
    */
  var utilizationTarget: js.UndefOr[Double] = js.native
  /**
    * Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE. If not
    * specified, the default is GAUGE.
    */
  var utilizationTargetType: js.UndefOr[String] = js.native
}

object AutoscalingPolicyCustomMetricUtilization {
  @scala.inline
  def apply(): AutoscalingPolicyCustomMetricUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingPolicyCustomMetricUtilization]
  }
  @scala.inline
  implicit class AutoscalingPolicyCustomMetricUtilizationOps[Self <: AutoscalingPolicyCustomMetricUtilization] (val x: Self) extends AnyVal {
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
    def setMetric(value: String): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    @scala.inline
    def setUtilizationTarget(value: Double): Self = this.set("utilizationTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtilizationTarget: Self = this.set("utilizationTarget", js.undefined)
    @scala.inline
    def setUtilizationTargetType(value: String): Self = this.set("utilizationTargetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtilizationTargetType: Self = this.set("utilizationTargetType", js.undefined)
  }
  
}

