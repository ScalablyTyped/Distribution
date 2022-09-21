package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoscalingTargets extends StObject {
  
  /**
    * The cpu utilization that the Autoscaler should be trying to achieve. This number is on a scale from 0 (no utilization) to 100 (total utilization), and is limited between 10 and 80, otherwise it will return INVALID_ARGUMENT error.
    */
  var cpuUtilizationPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The storage utilization that the Autoscaler should be trying to achieve. This number is limited between 2560 (2.5TiB) and 5120 (5TiB) for a SSD cluster and between 8192 (8TiB) and 16384 (16TiB) for an HDD cluster, otherwise it will return INVALID_ARGUMENT error. If this value is set to 0, it will be treated as if it were set to the default value: 2560 for SSD, 8192 for HDD.
    */
  var storageUtilizationGibPerNode: js.UndefOr[Double | Null] = js.undefined
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
    
    inline def setStorageUtilizationGibPerNode(value: Double): Self = StObject.set(x, "storageUtilizationGibPerNode", value.asInstanceOf[js.Any])
    
    inline def setStorageUtilizationGibPerNodeNull: Self = StObject.set(x, "storageUtilizationGibPerNode", null)
    
    inline def setStorageUtilizationGibPerNodeUndefined: Self = StObject.set(x, "storageUtilizationGibPerNode", js.undefined)
  }
}
