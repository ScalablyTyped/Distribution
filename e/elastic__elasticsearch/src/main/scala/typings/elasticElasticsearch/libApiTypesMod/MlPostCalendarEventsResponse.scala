package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPostCalendarEventsResponse extends StObject {
  
  var events: js.Array[MlCalendarEvent]
}
object MlPostCalendarEventsResponse {
  
  inline def apply(events: js.Array[MlCalendarEvent]): MlPostCalendarEventsResponse = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPostCalendarEventsResponse]
  }
  
  extension [Self <: MlPostCalendarEventsResponse](x: Self) {
    
    inline def setEvents(value: js.Array[MlCalendarEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: MlCalendarEvent*): Self = StObject.set(x, "events", js.Array(value*))
  }
}
