package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingAutoscalingPolicy extends StObject {
  
  var deciders: Record[String, Any]
  
  var roles: js.Array[String]
}
object AutoscalingAutoscalingPolicy {
  
  inline def apply(deciders: Record[String, Any], roles: js.Array[String]): AutoscalingAutoscalingPolicy = {
    val __obj = js.Dynamic.literal(deciders = deciders.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingAutoscalingPolicy]
  }
  
  extension [Self <: AutoscalingAutoscalingPolicy](x: Self) {
    
    inline def setDeciders(value: Record[String, Any]): Self = StObject.set(x, "deciders", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
