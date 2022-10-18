package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncSearchAsyncSearchResponseBase extends StObject {
  
  var expiration_time: js.UndefOr[DateTime] = js.undefined
  
  var expiration_time_in_millis: EpochTime[UnitMillis]
  
  var id: js.UndefOr[Id] = js.undefined
  
  var is_partial: Boolean
  
  var is_running: Boolean
  
  var start_time: js.UndefOr[DateTime] = js.undefined
  
  var start_time_in_millis: EpochTime[UnitMillis]
}
object AsyncSearchAsyncSearchResponseBase {
  
  inline def apply(
    expiration_time_in_millis: EpochTime[UnitMillis],
    is_partial: Boolean,
    is_running: Boolean,
    start_time_in_millis: EpochTime[UnitMillis]
  ): AsyncSearchAsyncSearchResponseBase = {
    val __obj = js.Dynamic.literal(expiration_time_in_millis = expiration_time_in_millis.asInstanceOf[js.Any], is_partial = is_partial.asInstanceOf[js.Any], is_running = is_running.asInstanceOf[js.Any], start_time_in_millis = start_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncSearchAsyncSearchResponseBase]
  }
  
  extension [Self <: AsyncSearchAsyncSearchResponseBase](x: Self) {
    
    inline def setExpiration_time(value: DateTime): Self = StObject.set(x, "expiration_time", value.asInstanceOf[js.Any])
    
    inline def setExpiration_timeUndefined: Self = StObject.set(x, "expiration_time", js.undefined)
    
    inline def setExpiration_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "expiration_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIs_partial(value: Boolean): Self = StObject.set(x, "is_partial", value.asInstanceOf[js.Any])
    
    inline def setIs_running(value: Boolean): Self = StObject.set(x, "is_running", value.asInstanceOf[js.Any])
    
    inline def setStart_time(value: DateTime): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    
    inline def setStart_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time_in_millis", value.asInstanceOf[js.Any])
  }
}
