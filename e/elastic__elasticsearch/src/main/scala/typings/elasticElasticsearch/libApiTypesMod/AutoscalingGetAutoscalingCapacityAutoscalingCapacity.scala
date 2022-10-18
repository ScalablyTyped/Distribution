package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingGetAutoscalingCapacityAutoscalingCapacity extends StObject {
  
  var node: AutoscalingGetAutoscalingCapacityAutoscalingResources
  
  var total: AutoscalingGetAutoscalingCapacityAutoscalingResources
}
object AutoscalingGetAutoscalingCapacityAutoscalingCapacity {
  
  inline def apply(
    node: AutoscalingGetAutoscalingCapacityAutoscalingResources,
    total: AutoscalingGetAutoscalingCapacityAutoscalingResources
  ): AutoscalingGetAutoscalingCapacityAutoscalingCapacity = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingGetAutoscalingCapacityAutoscalingCapacity]
  }
  
  extension [Self <: AutoscalingGetAutoscalingCapacityAutoscalingCapacity](x: Self) {
    
    inline def setNode(value: AutoscalingGetAutoscalingCapacityAutoscalingResources): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: AutoscalingGetAutoscalingCapacityAutoscalingResources): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
