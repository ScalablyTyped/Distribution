package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EqlGetRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
  
  var keep_alive: js.UndefOr[Duration] = js.undefined
  
  var wait_for_completion_timeout: js.UndefOr[Duration] = js.undefined
}
object EqlGetRequest {
  
  inline def apply(id: Id): EqlGetRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqlGetRequest]
  }
  
  extension [Self <: EqlGetRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKeep_alive(value: Duration): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
    
    inline def setKeep_aliveUndefined: Self = StObject.set(x, "keep_alive", js.undefined)
    
    inline def setWait_for_completion_timeout(value: Duration): Self = StObject.set(x, "wait_for_completion_timeout", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completion_timeoutUndefined: Self = StObject.set(x, "wait_for_completion_timeout", js.undefined)
  }
}
