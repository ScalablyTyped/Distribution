package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutomaticScaling extends js.Object {
  /**
    * Amount of time that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait between changes to the number of virtual machines.
    * Only applicable for VM runtimes.
    */
  var coolDownPeriod: js.UndefOr[String] = js.undefined
  /** Target scaling by CPU usage. */
  var cpuUtilization: js.UndefOr[CpuUtilization] = js.undefined
  /** Target scaling by disk usage. */
  var diskUtilization: js.UndefOr[DiskUtilization] = js.undefined
  /** Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value. */
  var maxConcurrentRequests: js.UndefOr[Double] = js.undefined
  /** Maximum number of idle instances that should be maintained for this version. */
  var maxIdleInstances: js.UndefOr[Double] = js.undefined
  /** Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it. */
  var maxPendingLatency: js.UndefOr[String] = js.undefined
  /** Maximum number of instances that should be started to handle requests. */
  var maxTotalInstances: js.UndefOr[Double] = js.undefined
  /** Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service. */
  var minIdleInstances: js.UndefOr[Double] = js.undefined
  /** Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it. */
  var minPendingLatency: js.UndefOr[String] = js.undefined
  /** Minimum number of instances that should be maintained for this version. */
  var minTotalInstances: js.UndefOr[Double] = js.undefined
  /** Target scaling by network usage. */
  var networkUtilization: js.UndefOr[NetworkUtilization] = js.undefined
  /** Target scaling by request utilization. */
  var requestUtilization: js.UndefOr[RequestUtilization] = js.undefined
}

object AutomaticScaling {
  @scala.inline
  def apply(
    coolDownPeriod: String = null,
    cpuUtilization: CpuUtilization = null,
    diskUtilization: DiskUtilization = null,
    maxConcurrentRequests: Int | Double = null,
    maxIdleInstances: Int | Double = null,
    maxPendingLatency: String = null,
    maxTotalInstances: Int | Double = null,
    minIdleInstances: Int | Double = null,
    minPendingLatency: String = null,
    minTotalInstances: Int | Double = null,
    networkUtilization: NetworkUtilization = null,
    requestUtilization: RequestUtilization = null
  ): AutomaticScaling = {
    val __obj = js.Dynamic.literal()
    if (coolDownPeriod != null) __obj.updateDynamic("coolDownPeriod")(coolDownPeriod)
    if (cpuUtilization != null) __obj.updateDynamic("cpuUtilization")(cpuUtilization)
    if (diskUtilization != null) __obj.updateDynamic("diskUtilization")(diskUtilization)
    if (maxConcurrentRequests != null) __obj.updateDynamic("maxConcurrentRequests")(maxConcurrentRequests.asInstanceOf[js.Any])
    if (maxIdleInstances != null) __obj.updateDynamic("maxIdleInstances")(maxIdleInstances.asInstanceOf[js.Any])
    if (maxPendingLatency != null) __obj.updateDynamic("maxPendingLatency")(maxPendingLatency)
    if (maxTotalInstances != null) __obj.updateDynamic("maxTotalInstances")(maxTotalInstances.asInstanceOf[js.Any])
    if (minIdleInstances != null) __obj.updateDynamic("minIdleInstances")(minIdleInstances.asInstanceOf[js.Any])
    if (minPendingLatency != null) __obj.updateDynamic("minPendingLatency")(minPendingLatency)
    if (minTotalInstances != null) __obj.updateDynamic("minTotalInstances")(minTotalInstances.asInstanceOf[js.Any])
    if (networkUtilization != null) __obj.updateDynamic("networkUtilization")(networkUtilization)
    if (requestUtilization != null) __obj.updateDynamic("requestUtilization")(requestUtilization)
    __obj.asInstanceOf[AutomaticScaling]
  }
}

