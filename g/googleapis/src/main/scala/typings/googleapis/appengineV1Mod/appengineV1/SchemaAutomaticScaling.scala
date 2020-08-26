package typings.googleapis.appengineV1Mod.appengineV1

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
  def apply(): SchemaAutomaticScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutomaticScaling]
  }
  @scala.inline
  implicit class SchemaAutomaticScalingOps[Self <: SchemaAutomaticScaling] (val x: Self) extends AnyVal {
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
    def setCoolDownPeriod(value: String): Self = this.set("coolDownPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoolDownPeriod: Self = this.set("coolDownPeriod", js.undefined)
    @scala.inline
    def setCpuUtilization(value: SchemaCpuUtilization): Self = this.set("cpuUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuUtilization: Self = this.set("cpuUtilization", js.undefined)
    @scala.inline
    def setDiskUtilization(value: SchemaDiskUtilization): Self = this.set("diskUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskUtilization: Self = this.set("diskUtilization", js.undefined)
    @scala.inline
    def setMaxConcurrentRequests(value: Double): Self = this.set("maxConcurrentRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrentRequests: Self = this.set("maxConcurrentRequests", js.undefined)
    @scala.inline
    def setMaxIdleInstances(value: Double): Self = this.set("maxIdleInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxIdleInstances: Self = this.set("maxIdleInstances", js.undefined)
    @scala.inline
    def setMaxPendingLatency(value: String): Self = this.set("maxPendingLatency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPendingLatency: Self = this.set("maxPendingLatency", js.undefined)
    @scala.inline
    def setMaxTotalInstances(value: Double): Self = this.set("maxTotalInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTotalInstances: Self = this.set("maxTotalInstances", js.undefined)
    @scala.inline
    def setMinIdleInstances(value: Double): Self = this.set("minIdleInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinIdleInstances: Self = this.set("minIdleInstances", js.undefined)
    @scala.inline
    def setMinPendingLatency(value: String): Self = this.set("minPendingLatency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPendingLatency: Self = this.set("minPendingLatency", js.undefined)
    @scala.inline
    def setMinTotalInstances(value: Double): Self = this.set("minTotalInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTotalInstances: Self = this.set("minTotalInstances", js.undefined)
    @scala.inline
    def setNetworkUtilization(value: SchemaNetworkUtilization): Self = this.set("networkUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkUtilization: Self = this.set("networkUtilization", js.undefined)
    @scala.inline
    def setRequestUtilization(value: SchemaRequestUtilization): Self = this.set("requestUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestUtilization: Self = this.set("requestUtilization", js.undefined)
    @scala.inline
    def setStandardSchedulerSettings(value: SchemaStandardSchedulerSettings): Self = this.set("standardSchedulerSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardSchedulerSettings: Self = this.set("standardSchedulerSettings", js.undefined)
  }
  
}

