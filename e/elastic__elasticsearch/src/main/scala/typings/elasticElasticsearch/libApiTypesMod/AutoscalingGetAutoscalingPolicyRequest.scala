package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingGetAutoscalingPolicyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: Name
}
object AutoscalingGetAutoscalingPolicyRequest {
  
  inline def apply(name: Name): AutoscalingGetAutoscalingPolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingGetAutoscalingPolicyRequest]
  }
  
  extension [Self <: AutoscalingGetAutoscalingPolicyRequest](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
