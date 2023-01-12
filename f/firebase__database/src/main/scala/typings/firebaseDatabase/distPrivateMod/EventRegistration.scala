package typings.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An EventRegistration is basically an event type ('value', 'child_added', etc.) and a callback
  * to be notified of that type of event.
  *
  * That said, it can also contain a cancel callback to be notified if the event is canceled.  And
  * currently, this code is organized around the idea that you would register multiple child_ callbacks
  * together, as a single EventRegistration.  Though currently we don't do that.
  */
trait EventRegistration extends StObject {
  
  def createCancelEvent(error: js.Error, path: Path): CancelEvent | Null
  
  def createEvent(change: Change, query: QueryContext): Event2
  
  /**
    * Given event data, return a function to trigger the user's callback
    */
  def getEventRunner(eventData: Event2): js.Function0[Unit]
  
  /**
    * False basically means this is a "dummy" callback container being used as a sentinel
    * to remove all callback containers of a particular type.  (e.g. if the user does
    * ref.off('value') without specifying a specific callback).
    *
    * (TODO: Rework this, since it's hacky)
    *
    */
  def hasAnyCallback(): Boolean
  
  def matches(other: EventRegistration): Boolean
  
  /**
    * True if this container has a callback to trigger for this event type
    */
  def respondsTo(eventType: String): Boolean
}
object EventRegistration {
  
  inline def apply(
    createCancelEvent: (js.Error, Path) => CancelEvent | Null,
    createEvent: (Change, QueryContext) => Event2,
    getEventRunner: Event2 => js.Function0[Unit],
    hasAnyCallback: () => Boolean,
    matches: EventRegistration => Boolean,
    respondsTo: String => Boolean
  ): EventRegistration = {
    val __obj = js.Dynamic.literal(createCancelEvent = js.Any.fromFunction2(createCancelEvent), createEvent = js.Any.fromFunction2(createEvent), getEventRunner = js.Any.fromFunction1(getEventRunner), hasAnyCallback = js.Any.fromFunction0(hasAnyCallback), matches = js.Any.fromFunction1(matches), respondsTo = js.Any.fromFunction1(respondsTo))
    __obj.asInstanceOf[EventRegistration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventRegistration] (val x: Self) extends AnyVal {
    
    inline def setCreateCancelEvent(value: (js.Error, Path) => CancelEvent | Null): Self = StObject.set(x, "createCancelEvent", js.Any.fromFunction2(value))
    
    inline def setCreateEvent(value: (Change, QueryContext) => Event2): Self = StObject.set(x, "createEvent", js.Any.fromFunction2(value))
    
    inline def setGetEventRunner(value: Event2 => js.Function0[Unit]): Self = StObject.set(x, "getEventRunner", js.Any.fromFunction1(value))
    
    inline def setHasAnyCallback(value: () => Boolean): Self = StObject.set(x, "hasAnyCallback", js.Any.fromFunction0(value))
    
    inline def setMatches(value: EventRegistration => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    
    inline def setRespondsTo(value: String => Boolean): Self = StObject.set(x, "respondsTo", js.Any.fromFunction1(value))
  }
}
