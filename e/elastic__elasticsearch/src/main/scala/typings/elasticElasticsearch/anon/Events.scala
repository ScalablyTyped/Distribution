package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlCalendarEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var events: js.Array[MlCalendarEvent]
}
object Events {
  
  inline def apply(events: js.Array[MlCalendarEvent]): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setEvents(value: js.Array[MlCalendarEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: MlCalendarEvent*): Self = StObject.set(x, "events", js.Array(value*))
  }
}
