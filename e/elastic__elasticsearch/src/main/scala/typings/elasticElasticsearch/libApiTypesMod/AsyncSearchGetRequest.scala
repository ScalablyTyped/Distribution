package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncSearchGetRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
  
  var keep_alive: js.UndefOr[Duration] = js.undefined
  
  var typed_keys: js.UndefOr[Boolean] = js.undefined
  
  var wait_for_completion_timeout: js.UndefOr[Duration] = js.undefined
}
object AsyncSearchGetRequest {
  
  inline def apply(id: Id): AsyncSearchGetRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncSearchGetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncSearchGetRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKeep_alive(value: Duration): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
    
    inline def setKeep_aliveUndefined: Self = StObject.set(x, "keep_alive", js.undefined)
    
    inline def setTyped_keys(value: Boolean): Self = StObject.set(x, "typed_keys", value.asInstanceOf[js.Any])
    
    inline def setTyped_keysUndefined: Self = StObject.set(x, "typed_keys", js.undefined)
    
    inline def setWait_for_completion_timeout(value: Duration): Self = StObject.set(x, "wait_for_completion_timeout", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completion_timeoutUndefined: Self = StObject.set(x, "wait_for_completion_timeout", js.undefined)
  }
}
