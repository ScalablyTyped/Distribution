package typings.firebaseDatabase

import typings.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import typings.firebaseDatabase.distNodeEsmSrcCoreViewEventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreViewEventQueueMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/view/EventQueue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/view/EventQueue", "EventQueue")
  @js.native
  open class EventQueue () extends StObject {
    
    var eventLists_ : js.Array[EventList] = js.native
    
    /**
      * Tracks recursion depth of raiseQueuedEvents_, for debugging purposes.
      */
    var recursionDepth_ : Double = js.native
  }
  
  inline def eventQueueQueueEvents(eventQueue: EventQueue, eventDataList: js.Array[Event]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventQueueQueueEvents")(eventQueue.asInstanceOf[js.Any], eventDataList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eventQueueRaiseEventsAtPath(eventQueue: EventQueue, path: Path, eventDataList: js.Array[Event]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventQueueRaiseEventsAtPath")(eventQueue.asInstanceOf[js.Any], path.asInstanceOf[js.Any], eventDataList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eventQueueRaiseEventsForChangedPath(eventQueue: EventQueue, changedPath: Path, eventDataList: js.Array[Event]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventQueueRaiseEventsForChangedPath")(eventQueue.asInstanceOf[js.Any], changedPath.asInstanceOf[js.Any], eventDataList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait EventList extends StObject {
    
    var events: js.Array[Event]
    
    var path: Path
  }
  object EventList {
    
    inline def apply(events: js.Array[Event], path: Path): EventList = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventList]
    }
    
    extension [Self <: EventList](x: Self) {
      
      inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
