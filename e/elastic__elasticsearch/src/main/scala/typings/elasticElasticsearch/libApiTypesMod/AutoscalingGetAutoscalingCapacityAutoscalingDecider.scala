package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingGetAutoscalingCapacityAutoscalingDecider extends StObject {
  
  var reason_details: js.UndefOr[Any] = js.undefined
  
  var reason_summary: js.UndefOr[String] = js.undefined
  
  var required_capacity: AutoscalingGetAutoscalingCapacityAutoscalingCapacity
}
object AutoscalingGetAutoscalingCapacityAutoscalingDecider {
  
  inline def apply(required_capacity: AutoscalingGetAutoscalingCapacityAutoscalingCapacity): AutoscalingGetAutoscalingCapacityAutoscalingDecider = {
    val __obj = js.Dynamic.literal(required_capacity = required_capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingGetAutoscalingCapacityAutoscalingDecider]
  }
  
  extension [Self <: AutoscalingGetAutoscalingCapacityAutoscalingDecider](x: Self) {
    
    inline def setReason_details(value: Any): Self = StObject.set(x, "reason_details", value.asInstanceOf[js.Any])
    
    inline def setReason_detailsUndefined: Self = StObject.set(x, "reason_details", js.undefined)
    
    inline def setReason_summary(value: String): Self = StObject.set(x, "reason_summary", value.asInstanceOf[js.Any])
    
    inline def setReason_summaryUndefined: Self = StObject.set(x, "reason_summary", js.undefined)
    
    inline def setRequired_capacity(value: AutoscalingGetAutoscalingCapacityAutoscalingCapacity): Self = StObject.set(x, "required_capacity", value.asInstanceOf[js.Any])
  }
}
