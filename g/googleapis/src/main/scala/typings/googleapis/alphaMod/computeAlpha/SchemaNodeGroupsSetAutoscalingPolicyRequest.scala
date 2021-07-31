package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupsSetAutoscalingPolicyRequest extends StObject {
  
  var autoscalingPolicy: js.UndefOr[SchemaNodeGroupAutoscalingPolicy] = js.undefined
}
object SchemaNodeGroupsSetAutoscalingPolicyRequest {
  
  @scala.inline
  def apply(): SchemaNodeGroupsSetAutoscalingPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsSetAutoscalingPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaNodeGroupsSetAutoscalingPolicyRequestMutableBuilder[Self <: SchemaNodeGroupsSetAutoscalingPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscalingPolicy(value: SchemaNodeGroupAutoscalingPolicy): Self = StObject.set(x, "autoscalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingPolicyUndefined: Self = StObject.set(x, "autoscalingPolicy", js.undefined)
  }
}
