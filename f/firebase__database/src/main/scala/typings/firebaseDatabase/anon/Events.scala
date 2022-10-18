package typings.firebaseDatabase.anon

import typings.firebaseDatabase.distNodeEsmSrcCoreViewEventMod.Event
import typings.firebaseDatabase.distNodeEsmSrcCoreViewEventRegistrationMod.QueryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var events: js.Array[Event]
  
  var removed: js.Array[QueryContext]
}
object Events {
  
  inline def apply(events: js.Array[Event], removed: js.Array[QueryContext]): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setRemoved(value: js.Array[QueryContext]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: QueryContext*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
