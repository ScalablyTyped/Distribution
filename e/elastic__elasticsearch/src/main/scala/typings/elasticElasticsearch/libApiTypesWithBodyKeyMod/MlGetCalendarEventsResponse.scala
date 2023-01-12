package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetCalendarEventsResponse extends StObject {
  
  var count: long
  
  var events: js.Array[MlCalendarEvent]
}
object MlGetCalendarEventsResponse {
  
  inline def apply(count: long, events: js.Array[MlCalendarEvent]): MlGetCalendarEventsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetCalendarEventsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetCalendarEventsResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[MlCalendarEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: MlCalendarEvent*): Self = StObject.set(x, "events", js.Array(value*))
  }
}
