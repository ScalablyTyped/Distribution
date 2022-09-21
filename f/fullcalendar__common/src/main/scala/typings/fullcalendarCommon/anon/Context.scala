package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.mod.CalendarContext
import typings.fullcalendarCommon.mod.DateRange
import typings.fullcalendarCommon.mod.EventSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context[Meta] extends StObject {
  
  var context: CalendarContext
  
  var eventSource: EventSource[Meta]
  
  var isRefetch: Boolean
  
  var range: DateRange
}
object Context {
  
  inline def apply[Meta](context: CalendarContext, eventSource: EventSource[Meta], isRefetch: Boolean, range: DateRange): Context[Meta] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], isRefetch = isRefetch.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[Meta]]
  }
  
  extension [Self <: Context[?], Meta](x: Self & Context[Meta]) {
    
    inline def setContext(value: CalendarContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setEventSource(value: EventSource[Meta]): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    inline def setIsRefetch(value: Boolean): Self = StObject.set(x, "isRefetch", value.asInstanceOf[js.Any])
    
    inline def setRange(value: DateRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
