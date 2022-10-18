package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventList extends StObject {
  
  var events: js.Array[Event2]
  
  var path: Path
}
object EventList {
  
  inline def apply(events: js.Array[Event2], path: Path): EventList = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventList]
  }
  
  extension [Self <: EventList](x: Self) {
    
    inline def setEvents(value: js.Array[Event2]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Event2*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
