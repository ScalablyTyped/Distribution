package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Scheduler settings for standard environment.
  */
trait SchemaStandardSchedulerSettings extends StObject {
  
  /**
    * Maximum number of instances to run for this version. Set to zero to
    * disable max_instances configuration.
    */
  var maxInstances: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of instances to run for this version. Set to zero to
    * disable min_instances configuration.
    */
  var minInstances: js.UndefOr[Double] = js.undefined
  
  /**
    * Target CPU utilization ratio to maintain when scaling.
    */
  var targetCpuUtilization: js.UndefOr[Double] = js.undefined
  
  /**
    * Target throughput utilization ratio to maintain when scaling
    */
  var targetThroughputUtilization: js.UndefOr[Double] = js.undefined
}
object SchemaStandardSchedulerSettings {
  
  inline def apply(): SchemaStandardSchedulerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardSchedulerSettings]
  }
  
  extension [Self <: SchemaStandardSchedulerSettings](x: Self) {
    
    inline def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
    
    inline def setMaxInstancesUndefined: Self = StObject.set(x, "maxInstances", js.undefined)
    
    inline def setMinInstances(value: Double): Self = StObject.set(x, "minInstances", value.asInstanceOf[js.Any])
    
    inline def setMinInstancesUndefined: Self = StObject.set(x, "minInstances", js.undefined)
    
    inline def setTargetCpuUtilization(value: Double): Self = StObject.set(x, "targetCpuUtilization", value.asInstanceOf[js.Any])
    
    inline def setTargetCpuUtilizationUndefined: Self = StObject.set(x, "targetCpuUtilization", js.undefined)
    
    inline def setTargetThroughputUtilization(value: Double): Self = StObject.set(x, "targetThroughputUtilization", value.asInstanceOf[js.Any])
    
    inline def setTargetThroughputUtilizationUndefined: Self = StObject.set(x, "targetThroughputUtilization", js.undefined)
  }
}
