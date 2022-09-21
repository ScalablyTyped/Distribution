package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.fullcalendarCommonStrings.RECEIVE_EVENT_ERROR
import typings.fullcalendarCommon.mod.Action
import typings.fullcalendarCommon.mod.DateRange
import typings.fullcalendarCommon.mod.EventSourceError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with Action {
  
  var error: EventSourceError
  
  var fetchId: String
  
  var fetchRange: DateRange | Null
  
  var sourceId: String
  
  var `type`: RECEIVE_EVENT_ERROR
}
object Error {
  
  inline def apply(error: EventSourceError, fetchId: String, sourceId: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fetchId = fetchId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], fetchRange = null)
    __obj.updateDynamic("type")("RECEIVE_EVENT_ERROR")
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: EventSourceError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFetchId(value: String): Self = StObject.set(x, "fetchId", value.asInstanceOf[js.Any])
    
    inline def setFetchRange(value: DateRange): Self = StObject.set(x, "fetchRange", value.asInstanceOf[js.Any])
    
    inline def setFetchRangeNull: Self = StObject.set(x, "fetchRange", null)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setType(value: RECEIVE_EVENT_ERROR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
