package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmPutLifecycle[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
  
  var policy_id: String
}
object SlmPutLifecycle {
  
  inline def apply[T](policy_id: String): SlmPutLifecycle[T] = {
    val __obj = js.Dynamic.literal(policy_id = policy_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmPutLifecycle[T]]
  }
  
  extension [Self <: SlmPutLifecycle[?], T](x: Self & SlmPutLifecycle[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setPolicy_id(value: String): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
  }
}
