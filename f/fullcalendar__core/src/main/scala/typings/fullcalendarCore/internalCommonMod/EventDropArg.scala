package typings.fullcalendarCore.internalCommonMod

import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDropArg
  extends StObject
     with EventChangeArg {
  
  var delta: Duration
  
  var el: HTMLElement
  
  var jsEvent: MouseEvent
  
  var view: ViewApi
}
object EventDropArg {
  
  inline def apply(
    delta: Duration,
    el: HTMLElement,
    event: EventImpl,
    jsEvent: MouseEvent,
    oldEvent: EventImpl,
    relatedEvents: js.Array[EventImpl],
    revert: () => Unit,
    view: ViewApi
  ): EventDropArg = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], jsEvent = jsEvent.asInstanceOf[js.Any], oldEvent = oldEvent.asInstanceOf[js.Any], relatedEvents = relatedEvents.asInstanceOf[js.Any], revert = js.Any.fromFunction0(revert), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDropArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventDropArg] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: Duration): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setJsEvent(value: MouseEvent): Self = StObject.set(x, "jsEvent", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
