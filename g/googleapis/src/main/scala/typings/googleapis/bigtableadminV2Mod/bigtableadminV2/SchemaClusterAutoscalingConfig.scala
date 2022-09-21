package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClusterAutoscalingConfig extends StObject {
  
  /**
    * Required. Autoscaling limits for this cluster.
    */
  var autoscalingLimits: js.UndefOr[SchemaAutoscalingLimits] = js.undefined
  
  /**
    * Required. Autoscaling targets for this cluster.
    */
  var autoscalingTargets: js.UndefOr[SchemaAutoscalingTargets] = js.undefined
}
object SchemaClusterAutoscalingConfig {
  
  inline def apply(): SchemaClusterAutoscalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterAutoscalingConfig]
  }
  
  extension [Self <: SchemaClusterAutoscalingConfig](x: Self) {
    
    inline def setAutoscalingLimits(value: SchemaAutoscalingLimits): Self = StObject.set(x, "autoscalingLimits", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingLimitsUndefined: Self = StObject.set(x, "autoscalingLimits", js.undefined)
    
    inline def setAutoscalingTargets(value: SchemaAutoscalingTargets): Self = StObject.set(x, "autoscalingTargets", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingTargetsUndefined: Self = StObject.set(x, "autoscalingTargets", js.undefined)
  }
}
