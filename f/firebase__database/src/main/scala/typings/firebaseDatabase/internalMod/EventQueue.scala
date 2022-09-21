package typings.firebaseDatabase.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The event queue serves a few purposes:
  * 1. It ensures we maintain event order in the face of event callbacks doing operations that result in more
  *    events being queued.
  * 2. raiseQueuedEvents() handles being called reentrantly nicely.  That is, if in the course of raising events,
  *    raiseQueuedEvents() is called again, the "inner" call will pick up raising events where the "outer" call
  *    left off, ensuring that the events are still raised synchronously and in order.
  * 3. You can use raiseEventsAtPath and raiseEventsForChangedPath to ensure only relevant previously-queued
  *    events are raised synchronously.
  *
  * NOTE: This can all go away if/when we move to async events.
  *
  */
trait EventQueue extends StObject {
  
  var eventLists_ : js.Array[EventList]
  
  /**
    * Tracks recursion depth of raiseQueuedEvents_, for debugging purposes.
    */
  var recursionDepth_ : Double
}
object EventQueue {
  
  inline def apply(eventLists_ : js.Array[EventList], recursionDepth_ : Double): EventQueue = {
    val __obj = js.Dynamic.literal(eventLists_ = eventLists_.asInstanceOf[js.Any], recursionDepth_ = recursionDepth_.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventQueue]
  }
  
  extension [Self <: EventQueue](x: Self) {
    
    inline def setEventLists_(value: js.Array[EventList]): Self = StObject.set(x, "eventLists_", value.asInstanceOf[js.Any])
    
    inline def setEventLists_Varargs(value: EventList*): Self = StObject.set(x, "eventLists_", js.Array(value*))
    
    inline def setRecursionDepth_(value: Double): Self = StObject.set(x, "recursionDepth_", value.asInstanceOf[js.Any])
  }
}
