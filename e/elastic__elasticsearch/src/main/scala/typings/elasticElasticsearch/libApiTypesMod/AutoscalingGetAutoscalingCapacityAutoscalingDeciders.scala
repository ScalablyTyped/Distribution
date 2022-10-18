package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingGetAutoscalingCapacityAutoscalingDeciders extends StObject {
  
  var current_capacity: AutoscalingGetAutoscalingCapacityAutoscalingCapacity
  
  var current_nodes: js.Array[AutoscalingGetAutoscalingCapacityAutoscalingNode]
  
  var deciders: Record[String, AutoscalingGetAutoscalingCapacityAutoscalingDecider]
  
  var required_capacity: AutoscalingGetAutoscalingCapacityAutoscalingCapacity
}
object AutoscalingGetAutoscalingCapacityAutoscalingDeciders {
  
  inline def apply(
    current_capacity: AutoscalingGetAutoscalingCapacityAutoscalingCapacity,
    current_nodes: js.Array[AutoscalingGetAutoscalingCapacityAutoscalingNode],
    deciders: Record[String, AutoscalingGetAutoscalingCapacityAutoscalingDecider],
    required_capacity: AutoscalingGetAutoscalingCapacityAutoscalingCapacity
  ): AutoscalingGetAutoscalingCapacityAutoscalingDeciders = {
    val __obj = js.Dynamic.literal(current_capacity = current_capacity.asInstanceOf[js.Any], current_nodes = current_nodes.asInstanceOf[js.Any], deciders = deciders.asInstanceOf[js.Any], required_capacity = required_capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingGetAutoscalingCapacityAutoscalingDeciders]
  }
  
  extension [Self <: AutoscalingGetAutoscalingCapacityAutoscalingDeciders](x: Self) {
    
    inline def setCurrent_capacity(value: AutoscalingGetAutoscalingCapacityAutoscalingCapacity): Self = StObject.set(x, "current_capacity", value.asInstanceOf[js.Any])
    
    inline def setCurrent_nodes(value: js.Array[AutoscalingGetAutoscalingCapacityAutoscalingNode]): Self = StObject.set(x, "current_nodes", value.asInstanceOf[js.Any])
    
    inline def setCurrent_nodesVarargs(value: AutoscalingGetAutoscalingCapacityAutoscalingNode*): Self = StObject.set(x, "current_nodes", js.Array(value*))
    
    inline def setDeciders(value: Record[String, AutoscalingGetAutoscalingCapacityAutoscalingDecider]): Self = StObject.set(x, "deciders", value.asInstanceOf[js.Any])
    
    inline def setRequired_capacity(value: AutoscalingGetAutoscalingCapacityAutoscalingCapacity): Self = StObject.set(x, "required_capacity", value.asInstanceOf[js.Any])
  }
}
