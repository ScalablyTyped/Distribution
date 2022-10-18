package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmDeleteLifecycleRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var policy_id: Name
}
object SlmDeleteLifecycleRequest {
  
  inline def apply(policy_id: Name): SlmDeleteLifecycleRequest = {
    val __obj = js.Dynamic.literal(policy_id = policy_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmDeleteLifecycleRequest]
  }
  
  extension [Self <: SlmDeleteLifecycleRequest](x: Self) {
    
    inline def setPolicy_id(value: Name): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
  }
}
