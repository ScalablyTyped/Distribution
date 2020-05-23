package typings.gapiClientAppengine.gapi.client.appengine

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
    maxConcurrentRequests: js.UndefOr[Double] = js.undefined,
    maxIdleInstances: js.UndefOr[Double] = js.undefined,
    maxPendingLatency: String = null,
    maxTotalInstances: js.UndefOr[Double] = js.undefined,
    minIdleInstances: js.UndefOr[Double] = js.undefined,
    minPendingLatency: String = null,
    minTotalInstances: js.UndefOr[Double] = js.undefined,
    networkUtilization: NetworkUtilization = null,
    requestUtilization: RequestUtilization = null
  ): AutomaticScaling = {
    val __obj = js.Dynamic.literal()
    if (coolDownPeriod != null) __obj.updateDynamic("coolDownPeriod")(coolDownPeriod.asInstanceOf[js.Any])
    if (cpuUtilization != null) __obj.updateDynamic("cpuUtilization")(cpuUtilization.asInstanceOf[js.Any])
    if (diskUtilization != null) __obj.updateDynamic("diskUtilization")(diskUtilization.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConcurrentRequests)) __obj.updateDynamic("maxConcurrentRequests")(maxConcurrentRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxIdleInstances)) __obj.updateDynamic("maxIdleInstances")(maxIdleInstances.get.asInstanceOf[js.Any])
    if (maxPendingLatency != null) __obj.updateDynamic("maxPendingLatency")(maxPendingLatency.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTotalInstances)) __obj.updateDynamic("maxTotalInstances")(maxTotalInstances.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minIdleInstances)) __obj.updateDynamic("minIdleInstances")(minIdleInstances.get.asInstanceOf[js.Any])
    if (minPendingLatency != null) __obj.updateDynamic("minPendingLatency")(minPendingLatency.asInstanceOf[js.Any])
    if (!js.isUndefined(minTotalInstances)) __obj.updateDynamic("minTotalInstances")(minTotalInstances.get.asInstanceOf[js.Any])
    if (networkUtilization != null) __obj.updateDynamic("networkUtilization")(networkUtilization.asInstanceOf[js.Any])
    if (requestUtilization != null) __obj.updateDynamic("requestUtilization")(requestUtilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticScaling]
  }
}

