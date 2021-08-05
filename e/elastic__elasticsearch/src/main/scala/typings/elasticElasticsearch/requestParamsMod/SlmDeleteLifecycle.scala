package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmDeleteLifecycle
  extends StObject
     with Generic {
  
  var policy_id: String
}
object SlmDeleteLifecycle {
  
  inline def apply(policy_id: String): SlmDeleteLifecycle = {
    val __obj = js.Dynamic.literal(policy_id = policy_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmDeleteLifecycle]
  }
  
  extension [Self <: SlmDeleteLifecycle](x: Self) {
    
    inline def setPolicy_id(value: String): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
  }
}
