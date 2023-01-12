package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingPutAutoscalingPolicyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: Name
  
  var policy: js.UndefOr[AutoscalingAutoscalingPolicy] = js.undefined
}
object AutoscalingPutAutoscalingPolicyRequest {
  
  inline def apply(name: Name): AutoscalingPutAutoscalingPolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingPutAutoscalingPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoscalingPutAutoscalingPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: AutoscalingAutoscalingPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
