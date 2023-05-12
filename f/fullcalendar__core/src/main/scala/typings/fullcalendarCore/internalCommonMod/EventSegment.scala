package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSegment extends StObject {
  
  var end: js.Date
  
  var event: EventApi
  
  var isEnd: Boolean
  
  var isStart: Boolean
  
  var start: js.Date
}
object EventSegment {
  
  inline def apply(end: js.Date, event: EventApi, isEnd: Boolean, isStart: Boolean, start: js.Date): EventSegment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventSegment] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: EventApi): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setIsEnd(value: Boolean): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
    
    inline def setIsStart(value: Boolean): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
