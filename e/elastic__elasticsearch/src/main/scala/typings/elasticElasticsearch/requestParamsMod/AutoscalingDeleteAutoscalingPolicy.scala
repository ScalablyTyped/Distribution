package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingDeleteAutoscalingPolicy
  extends StObject
     with Generic {
  
  var name: String
}
object AutoscalingDeleteAutoscalingPolicy {
  
  inline def apply(name: String): AutoscalingDeleteAutoscalingPolicy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingDeleteAutoscalingPolicy]
  }
  
  extension [Self <: AutoscalingDeleteAutoscalingPolicy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
