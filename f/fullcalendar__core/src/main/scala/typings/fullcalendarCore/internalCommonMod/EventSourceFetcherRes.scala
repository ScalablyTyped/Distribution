package typings.fullcalendarCore.internalCommonMod

import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceFetcherRes extends StObject {
  
  var rawEvents: js.Array[EventInput]
  
  var response: js.UndefOr[Response] = js.undefined
}
object EventSourceFetcherRes {
  
  inline def apply(rawEvents: js.Array[EventInput]): EventSourceFetcherRes = {
    val __obj = js.Dynamic.literal(rawEvents = rawEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceFetcherRes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventSourceFetcherRes] (val x: Self) extends AnyVal {
    
    inline def setRawEvents(value: js.Array[EventInput]): Self = StObject.set(x, "rawEvents", value.asInstanceOf[js.Any])
    
    inline def setRawEventsVarargs(value: EventInput*): Self = StObject.set(x, "rawEvents", js.Array(value*))
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
