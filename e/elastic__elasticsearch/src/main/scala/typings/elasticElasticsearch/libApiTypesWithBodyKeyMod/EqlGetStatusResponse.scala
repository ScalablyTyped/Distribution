package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EqlGetStatusResponse extends StObject {
  
  var completion_status: js.UndefOr[integer] = js.undefined
  
  var expiration_time_in_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var id: Id
  
  var is_partial: Boolean
  
  var is_running: Boolean
  
  var start_time_in_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
}
object EqlGetStatusResponse {
  
  inline def apply(id: Id, is_partial: Boolean, is_running: Boolean): EqlGetStatusResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], is_partial = is_partial.asInstanceOf[js.Any], is_running = is_running.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqlGetStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EqlGetStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setCompletion_status(value: integer): Self = StObject.set(x, "completion_status", value.asInstanceOf[js.Any])
    
    inline def setCompletion_statusUndefined: Self = StObject.set(x, "completion_status", js.undefined)
    
    inline def setExpiration_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "expiration_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setExpiration_time_in_millisUndefined: Self = StObject.set(x, "expiration_time_in_millis", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_partial(value: Boolean): Self = StObject.set(x, "is_partial", value.asInstanceOf[js.Any])
    
    inline def setIs_running(value: Boolean): Self = StObject.set(x, "is_running", value.asInstanceOf[js.Any])
    
    inline def setStart_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setStart_time_in_millisUndefined: Self = StObject.set(x, "start_time_in_millis", js.undefined)
  }
}
