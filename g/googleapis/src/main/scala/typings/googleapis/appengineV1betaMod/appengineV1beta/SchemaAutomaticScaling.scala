package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Automatic scaling is based on request rate, response latencies, and other
  * application metrics.
  */
@js.native
trait SchemaAutomaticScaling extends js.Object {
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
  var cpuUtilization: js.UndefOr[SchemaCpuUtilization] = js.native
  /**
    * Target scaling by user-provided metrics.
    */
  var customMetrics: js.UndefOr[js.Array[SchemaCustomMetric]] = js.native
  /**
    * Target scaling by disk usage.
    */
  var diskUtilization: js.UndefOr[SchemaDiskUtilization] = js.native
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
  var networkUtilization: js.UndefOr[SchemaNetworkUtilization] = js.native
  /**
    * Target scaling by request utilization.
    */
  var requestUtilization: js.UndefOr[SchemaRequestUtilization] = js.native
  /**
    * Scheduler settings for standard environment.
    */
  var standardSchedulerSettings: js.UndefOr[SchemaStandardSchedulerSettings] = js.native
}

object SchemaAutomaticScaling {
  @scala.inline
  def apply(
    coolDownPeriod: String = null,
    cpuUtilization: SchemaCpuUtilization = null,
    customMetrics: js.Array[SchemaCustomMetric] = null,
    diskUtilization: SchemaDiskUtilization = null,
    maxConcurrentRequests: Int | Double = null,
    maxIdleInstances: Int | Double = null,
    maxPendingLatency: String = null,
    maxTotalInstances: Int | Double = null,
    minIdleInstances: Int | Double = null,
    minPendingLatency: String = null,
    minTotalInstances: Int | Double = null,
    networkUtilization: SchemaNetworkUtilization = null,
    requestUtilization: SchemaRequestUtilization = null,
    standardSchedulerSettings: SchemaStandardSchedulerSettings = null
  ): SchemaAutomaticScaling = {
    val __obj = js.Dynamic.literal()
    if (coolDownPeriod != null) __obj.updateDynamic("coolDownPeriod")(coolDownPeriod.asInstanceOf[js.Any])
    if (cpuUtilization != null) __obj.updateDynamic("cpuUtilization")(cpuUtilization.asInstanceOf[js.Any])
    if (customMetrics != null) __obj.updateDynamic("customMetrics")(customMetrics.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[SchemaAutomaticScaling]
  }
}

