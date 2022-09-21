package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Limits for the number of nodes a Cluster can autoscale up/down to.
  */
trait SchemaAutoscalingLimits extends StObject {
  
  /**
    * Required. Maximum number of nodes to scale up to.
    */
  var maxServeNodes: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Minimum number of nodes to scale down to.
    */
  var minServeNodes: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAutoscalingLimits {
  
  inline def apply(): SchemaAutoscalingLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingLimits]
  }
  
  extension [Self <: SchemaAutoscalingLimits](x: Self) {
    
    inline def setMaxServeNodes(value: Double): Self = StObject.set(x, "maxServeNodes", value.asInstanceOf[js.Any])
    
    inline def setMaxServeNodesNull: Self = StObject.set(x, "maxServeNodes", null)
    
    inline def setMaxServeNodesUndefined: Self = StObject.set(x, "maxServeNodes", js.undefined)
    
    inline def setMinServeNodes(value: Double): Self = StObject.set(x, "minServeNodes", value.asInstanceOf[js.Any])
    
    inline def setMinServeNodesNull: Self = StObject.set(x, "minServeNodes", null)
    
    inline def setMinServeNodesUndefined: Self = StObject.set(x, "minServeNodes", js.undefined)
  }
}
