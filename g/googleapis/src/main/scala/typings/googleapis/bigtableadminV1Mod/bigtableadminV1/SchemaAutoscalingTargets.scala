package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Autoscaling targets for a Cluster. These determine the recommended nodes.
  */
trait SchemaAutoscalingTargets extends StObject {
  
  /**
    * The cpu utilization that the Autoscaler should be trying to achieve. This number is on a scale from 0 (no utilization) to 100 (total utilization).
    */
  var cpuUtilizationPercent: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAutoscalingTargets {
  
  inline def apply(): SchemaAutoscalingTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingTargets]
  }
  
  extension [Self <: SchemaAutoscalingTargets](x: Self) {
    
    inline def setCpuUtilizationPercent(value: Double): Self = StObject.set(x, "cpuUtilizationPercent", value.asInstanceOf[js.Any])
    
    inline def setCpuUtilizationPercentNull: Self = StObject.set(x, "cpuUtilizationPercent", null)
    
    inline def setCpuUtilizationPercentUndefined: Self = StObject.set(x, "cpuUtilizationPercent", js.undefined)
  }
}
