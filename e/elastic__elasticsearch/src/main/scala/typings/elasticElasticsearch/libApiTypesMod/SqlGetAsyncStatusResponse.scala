package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlGetAsyncStatusResponse extends StObject {
  
  var completion_status: js.UndefOr[uint] = js.undefined
  
  var expiration_time_in_millis: EpochTime[UnitMillis]
  
  var id: String
  
  var is_partial: Boolean
  
  var is_running: Boolean
  
  var start_time_in_millis: EpochTime[UnitMillis]
}
object SqlGetAsyncStatusResponse {
  
  inline def apply(
    expiration_time_in_millis: EpochTime[UnitMillis],
    id: String,
    is_partial: Boolean,
    is_running: Boolean,
    start_time_in_millis: EpochTime[UnitMillis]
  ): SqlGetAsyncStatusResponse = {
    val __obj = js.Dynamic.literal(expiration_time_in_millis = expiration_time_in_millis.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_partial = is_partial.asInstanceOf[js.Any], is_running = is_running.asInstanceOf[js.Any], start_time_in_millis = start_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlGetAsyncStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlGetAsyncStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setCompletion_status(value: uint): Self = StObject.set(x, "completion_status", value.asInstanceOf[js.Any])
    
    inline def setCompletion_statusUndefined: Self = StObject.set(x, "completion_status", js.undefined)
    
    inline def setExpiration_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "expiration_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_partial(value: Boolean): Self = StObject.set(x, "is_partial", value.asInstanceOf[js.Any])
    
    inline def setIs_running(value: Boolean): Self = StObject.set(x, "is_running", value.asInstanceOf[js.Any])
    
    inline def setStart_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time_in_millis", value.asInstanceOf[js.Any])
  }
}
