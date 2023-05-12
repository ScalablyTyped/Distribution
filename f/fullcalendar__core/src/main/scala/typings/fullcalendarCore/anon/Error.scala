package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.RECEIVE_EVENT_ERROR
import typings.fullcalendarCore.internalCommonMod.Action
import typings.fullcalendarCore.internalCommonMod.DateRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with Action {
  
  var error: js.Error
  
  var fetchId: String
  
  var fetchRange: DateRange | Null
  
  var sourceId: String
  
  var `type`: RECEIVE_EVENT_ERROR
}
object Error {
  
  inline def apply(error: js.Error, fetchId: String, sourceId: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fetchId = fetchId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], fetchRange = null)
    __obj.updateDynamic("type")("RECEIVE_EVENT_ERROR")
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFetchId(value: String): Self = StObject.set(x, "fetchId", value.asInstanceOf[js.Any])
    
    inline def setFetchRange(value: DateRange): Self = StObject.set(x, "fetchRange", value.asInstanceOf[js.Any])
    
    inline def setFetchRangeNull: Self = StObject.set(x, "fetchRange", null)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setType(value: RECEIVE_EVENT_ERROR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
