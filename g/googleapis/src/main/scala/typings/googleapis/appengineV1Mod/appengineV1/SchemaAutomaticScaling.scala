package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Automatic scaling is based on request rate, response latencies, and other
  * application metrics.
  */
trait SchemaAutomaticScaling extends StObject {
  
  /**
    * The time period that the Autoscaler
    * (https://cloud.google.com/compute/docs/autoscaler/) should wait before it
    * starts collecting information from a new instance. This prevents the
    * autoscaler from collecting information when the instance is initializing,
    * during which the collected usage would not be reliable. Only applicable
    * in the App Engine flexible environment.
    */
  var coolDownPeriod: js.UndefOr[String] = js.undefined
  
  /**
    * Target scaling by CPU usage.
    */
  var cpuUtilization: js.UndefOr[SchemaCpuUtilization] = js.undefined
  
  /**
    * Target scaling by disk usage.
    */
  var diskUtilization: js.UndefOr[SchemaDiskUtilization] = js.undefined
  
  /**
    * Number of concurrent requests an automatic scaling instance can accept
    * before the scheduler spawns a new instance.Defaults to a runtime-specific
    * value.
    */
  var maxConcurrentRequests: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum number of idle instances that should be maintained for this
    * version.
    */
  var maxIdleInstances: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum amount of time that a request should wait in the pending queue
    * before starting a new instance to handle it.
    */
  var maxPendingLatency: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of instances that should be started to handle requests for
    * this version.
    */
  var maxTotalInstances: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of idle instances that should be maintained for this
    * version. Only applicable for the default version of a service.
    */
  var minIdleInstances: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum amount of time a request should wait in the pending queue before
    * starting a new instance to handle it.
    */
  var minPendingLatency: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum number of running instances that should be maintained for this
    * version.
    */
  var minTotalInstances: js.UndefOr[Double] = js.undefined
  
  /**
    * Target scaling by network usage.
    */
  var networkUtilization: js.UndefOr[SchemaNetworkUtilization] = js.undefined
  
  /**
    * Target scaling by request utilization.
    */
  var requestUtilization: js.UndefOr[SchemaRequestUtilization] = js.undefined
  
  /**
    * Scheduler settings for standard environment.
    */
  var standardSchedulerSettings: js.UndefOr[SchemaStandardSchedulerSettings] = js.undefined
}
object SchemaAutomaticScaling {
  
  @scala.inline
  def apply(): SchemaAutomaticScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutomaticScaling]
  }
  
  @scala.inline
  implicit class SchemaAutomaticScalingMutableBuilder[Self <: SchemaAutomaticScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoolDownPeriod(value: String): Self = StObject.set(x, "coolDownPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoolDownPeriodUndefined: Self = StObject.set(x, "coolDownPeriod", js.undefined)
    
    @scala.inline
    def setCpuUtilization(value: SchemaCpuUtilization): Self = StObject.set(x, "cpuUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUtilizationUndefined: Self = StObject.set(x, "cpuUtilization", js.undefined)
    
    @scala.inline
    def setDiskUtilization(value: SchemaDiskUtilization): Self = StObject.set(x, "diskUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskUtilizationUndefined: Self = StObject.set(x, "diskUtilization", js.undefined)
    
    @scala.inline
    def setMaxConcurrentRequests(value: Double): Self = StObject.set(x, "maxConcurrentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentRequestsUndefined: Self = StObject.set(x, "maxConcurrentRequests", js.undefined)
    
    @scala.inline
    def setMaxIdleInstances(value: Double): Self = StObject.set(x, "maxIdleInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIdleInstancesUndefined: Self = StObject.set(x, "maxIdleInstances", js.undefined)
    
    @scala.inline
    def setMaxPendingLatency(value: String): Self = StObject.set(x, "maxPendingLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPendingLatencyUndefined: Self = StObject.set(x, "maxPendingLatency", js.undefined)
    
    @scala.inline
    def setMaxTotalInstances(value: Double): Self = StObject.set(x, "maxTotalInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTotalInstancesUndefined: Self = StObject.set(x, "maxTotalInstances", js.undefined)
    
    @scala.inline
    def setMinIdleInstances(value: Double): Self = StObject.set(x, "minIdleInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinIdleInstancesUndefined: Self = StObject.set(x, "minIdleInstances", js.undefined)
    
    @scala.inline
    def setMinPendingLatency(value: String): Self = StObject.set(x, "minPendingLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPendingLatencyUndefined: Self = StObject.set(x, "minPendingLatency", js.undefined)
    
    @scala.inline
    def setMinTotalInstances(value: Double): Self = StObject.set(x, "minTotalInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTotalInstancesUndefined: Self = StObject.set(x, "minTotalInstances", js.undefined)
    
    @scala.inline
    def setNetworkUtilization(value: SchemaNetworkUtilization): Self = StObject.set(x, "networkUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUtilizationUndefined: Self = StObject.set(x, "networkUtilization", js.undefined)
    
    @scala.inline
    def setRequestUtilization(value: SchemaRequestUtilization): Self = StObject.set(x, "requestUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUtilizationUndefined: Self = StObject.set(x, "requestUtilization", js.undefined)
    
    @scala.inline
    def setStandardSchedulerSettings(value: SchemaStandardSchedulerSettings): Self = StObject.set(x, "standardSchedulerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardSchedulerSettingsUndefined: Self = StObject.set(x, "standardSchedulerSettings", js.undefined)
  }
}
