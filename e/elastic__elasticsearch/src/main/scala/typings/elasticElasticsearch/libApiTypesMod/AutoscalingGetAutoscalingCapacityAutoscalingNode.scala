package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingGetAutoscalingCapacityAutoscalingNode extends StObject {
  
  var name: NodeName
}
object AutoscalingGetAutoscalingCapacityAutoscalingNode {
  
  inline def apply(name: NodeName): AutoscalingGetAutoscalingCapacityAutoscalingNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingGetAutoscalingCapacityAutoscalingNode]
  }
  
  extension [Self <: AutoscalingGetAutoscalingCapacityAutoscalingNode](x: Self) {
    
    inline def setName(value: NodeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
