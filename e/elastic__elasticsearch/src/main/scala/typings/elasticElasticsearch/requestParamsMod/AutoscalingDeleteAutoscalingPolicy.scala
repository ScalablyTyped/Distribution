package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscalingDeleteAutoscalingPolicy extends Generic {
  
  var name: String = js.native
}
object AutoscalingDeleteAutoscalingPolicy {
  
  @scala.inline
  def apply(name: String): AutoscalingDeleteAutoscalingPolicy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingDeleteAutoscalingPolicy]
  }
  
  @scala.inline
  implicit class AutoscalingDeleteAutoscalingPolicyMutableBuilder[Self <: AutoscalingDeleteAutoscalingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
