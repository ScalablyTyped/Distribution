package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingDeleteAutoscalingPolicyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: Name
}
object AutoscalingDeleteAutoscalingPolicyRequest {
  
  inline def apply(name: Name): AutoscalingDeleteAutoscalingPolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingDeleteAutoscalingPolicyRequest]
  }
  
  extension [Self <: AutoscalingDeleteAutoscalingPolicyRequest](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
