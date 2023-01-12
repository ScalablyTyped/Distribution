package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingGetAutoscalingCapacityAutoscalingResources extends StObject {
  
  var memory: integer
  
  var storage: integer
}
object AutoscalingGetAutoscalingCapacityAutoscalingResources {
  
  inline def apply(memory: integer, storage: integer): AutoscalingGetAutoscalingCapacityAutoscalingResources = {
    val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingGetAutoscalingCapacityAutoscalingResources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoscalingGetAutoscalingCapacityAutoscalingResources] (val x: Self) extends AnyVal {
    
    inline def setMemory(value: integer): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: integer): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
