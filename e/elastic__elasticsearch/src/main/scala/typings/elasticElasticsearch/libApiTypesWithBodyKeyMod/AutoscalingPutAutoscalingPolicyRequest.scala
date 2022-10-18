package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingPutAutoscalingPolicyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, use 'policy' instead. */
  var body: js.UndefOr[AutoscalingAutoscalingPolicy] = js.undefined
  
  var name: Name
}
object AutoscalingPutAutoscalingPolicyRequest {
  
  inline def apply(name: Name): AutoscalingPutAutoscalingPolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingPutAutoscalingPolicyRequest]
  }
  
  extension [Self <: AutoscalingPutAutoscalingPolicyRequest](x: Self) {
    
    inline def setBody(value: AutoscalingAutoscalingPolicy): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
