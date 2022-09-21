package typings.firebaseDatabase.anon

import typings.firebaseDatabase.viewEventMod.Event
import typings.firebaseDatabase.viewEventRegistrationMod.QueryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Removed extends StObject {
  
  var events: js.Array[Event]
  
  var removed: js.Array[QueryContext]
}
object Removed {
  
  inline def apply(events: js.Array[Event], removed: js.Array[QueryContext]): Removed = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Removed]
  }
  
  extension [Self <: Removed](x: Self) {
    
    inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setRemoved(value: js.Array[QueryContext]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: QueryContext*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
