package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupsSetAutoscalingPolicyRequest extends StObject {
  
  var autoscalingPolicy: js.UndefOr[SchemaNodeGroupAutoscalingPolicy] = js.undefined
}
object SchemaNodeGroupsSetAutoscalingPolicyRequest {
  
  inline def apply(): SchemaNodeGroupsSetAutoscalingPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsSetAutoscalingPolicyRequest]
  }
  
  extension [Self <: SchemaNodeGroupsSetAutoscalingPolicyRequest](x: Self) {
    
    inline def setAutoscalingPolicy(value: SchemaNodeGroupAutoscalingPolicy): Self = StObject.set(x, "autoscalingPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingPolicyUndefined: Self = StObject.set(x, "autoscalingPolicy", js.undefined)
  }
}
