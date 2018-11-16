package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutoscalingPolicyCustomMetricUtilization extends js.Object {
  /**
               * The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative values and should be a utilization metric, which means that
               * the number of virtual machines handling requests should increase or decrease proportionally to the metric.
               *
               * The metric must have a value type of INT64 or DOUBLE.
               */
  var metric: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The target value of the metric that autoscaler should maintain. This must be a positive value.
               *
               * For example, a good metric to use as a utilization_target is compute.googleapis.com/instance/network/received_bytes_count. The autoscaler will work to
               * keep this value constant for each of the instances.
               */
  var utilizationTarget: js.UndefOr[scala.Double] = js.undefined
  /**
               * Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE. If not
               * specified, the default is GAUGE.
               */
  var utilizationTargetType: js.UndefOr[java.lang.String] = js.undefined
}

