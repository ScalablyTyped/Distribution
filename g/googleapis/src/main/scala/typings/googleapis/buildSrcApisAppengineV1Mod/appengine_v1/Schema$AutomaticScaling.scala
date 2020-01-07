package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Automatic scaling is based on request rate, response latencies, and other
  * application metrics.
  */
@js.native
trait Schema$AutomaticScaling extends js.Object {
  /**
    * The time period that the Autoscaler
    * (https://cloud.google.com/compute/docs/autoscaler/) should wait before it
    * starts collecting information from a new instance. This prevents the
    * autoscaler from collecting information when the instance is initializing,
    * during which the collected usage would not be reliable. Only applicable
    * in the App Engine flexible environment.
    */
  var coolDownPeriod: js.UndefOr[String] = js.native
  /**
    * Target scaling by CPU usage.
    */
  var cpuUtilization: js.UndefOr[Schema$CpuUtilization] = js.native
  /**
    * Target scaling by disk usage.
    */
  var diskUtilization: js.UndefOr[Schema$DiskUtilization] = js.native
  /**
    * Number of concurrent requests an automatic scaling instance can accept
    * before the scheduler spawns a new instance.Defaults to a runtime-specific
    * value.
    */
  var maxConcurrentRequests: js.UndefOr[Double] = js.native
  /**
    * Maximum number of idle instances that should be maintained for this
    * version.
    */
  var maxIdleInstances: js.UndefOr[Double] = js.native
  /**
    * Maximum amount of time that a request should wait in the pending queue
    * before starting a new instance to handle it.
    */
  var maxPendingLatency: js.UndefOr[String] = js.native
  /**
    * Maximum number of instances that should be started to handle requests for
    * this version.
    */
  var maxTotalInstances: js.UndefOr[Double] = js.native
  /**
    * Minimum number of idle instances that should be maintained for this
    * version. Only applicable for the default version of a service.
    */
  var minIdleInstances: js.UndefOr[Double] = js.native
  /**
    * Minimum amount of time a request should wait in the pending queue before
    * starting a new instance to handle it.
    */
  var minPendingLatency: js.UndefOr[String] = js.native
  /**
    * Minimum number of running instances that should be maintained for this
    * version.
    */
  var minTotalInstances: js.UndefOr[Double] = js.native
  /**
    * Target scaling by network usage.
    */
  var networkUtilization: js.UndefOr[Schema$NetworkUtilization] = js.native
  /**
    * Target scaling by request utilization.
    */
  var requestUtilization: js.UndefOr[Schema$RequestUtilization] = js.native
  /**
    * Scheduler settings for standard environment.
    */
  var standardSchedulerSettings: js.UndefOr[Schema$StandardSchedulerSettings] = js.native
}

object Schema$AutomaticScaling {
  @scala.inline
  def apply(
    coolDownPeriod: String = null,
    cpuUtilization: Schema$CpuUtilization = null,
    diskUtilization: Schema$DiskUtilization = null,
    maxConcurrentRequests: Int | Double = null,
    maxIdleInstances: Int | Double = null,
    maxPendingLatency: String = null,
    maxTotalInstances: Int | Double = null,
    minIdleInstances: Int | Double = null,
    minPendingLatency: String = null,
    minTotalInstances: Int | Double = null,
    networkUtilization: Schema$NetworkUtilization = null,
    requestUtilization: Schema$RequestUtilization = null,
    standardSchedulerSettings: Schema$StandardSchedulerSettings = null
  ): Schema$AutomaticScaling = {
    val __obj = js.Dynamic.literal()
    if (coolDownPeriod != null) __obj.updateDynamic("coolDownPeriod")(coolDownPeriod.asInstanceOf[js.Any])
    if (cpuUtilization != null) __obj.updateDynamic("cpuUtilization")(cpuUtilization.asInstanceOf[js.Any])
    if (diskUtilization != null) __obj.updateDynamic("diskUtilization")(diskUtilization.asInstanceOf[js.Any])
    if (maxConcurrentRequests != null) __obj.updateDynamic("maxConcurrentRequests")(maxConcurrentRequests.asInstanceOf[js.Any])
    if (maxIdleInstances != null) __obj.updateDynamic("maxIdleInstances")(maxIdleInstances.asInstanceOf[js.Any])
    if (maxPendingLatency != null) __obj.updateDynamic("maxPendingLatency")(maxPendingLatency.asInstanceOf[js.Any])
    if (maxTotalInstances != null) __obj.updateDynamic("maxTotalInstances")(maxTotalInstances.asInstanceOf[js.Any])
    if (minIdleInstances != null) __obj.updateDynamic("minIdleInstances")(minIdleInstances.asInstanceOf[js.Any])
    if (minPendingLatency != null) __obj.updateDynamic("minPendingLatency")(minPendingLatency.asInstanceOf[js.Any])
    if (minTotalInstances != null) __obj.updateDynamic("minTotalInstances")(minTotalInstances.asInstanceOf[js.Any])
    if (networkUtilization != null) __obj.updateDynamic("networkUtilization")(networkUtilization.asInstanceOf[js.Any])
    if (requestUtilization != null) __obj.updateDynamic("requestUtilization")(requestUtilization.asInstanceOf[js.Any])
    if (standardSchedulerSettings != null) __obj.updateDynamic("standardSchedulerSettings")(standardSchedulerSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AutomaticScaling]
  }
}

