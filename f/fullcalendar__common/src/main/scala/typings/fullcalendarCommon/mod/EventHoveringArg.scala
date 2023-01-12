package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventHoveringArg extends StObject {
  
  var el: HTMLElement
  
  var event: EventApi
  
  var jsEvent: MouseEvent
  
  var view: ViewApi
}
object EventHoveringArg {
  
  inline def apply(el: HTMLElement, event: EventApi, jsEvent: MouseEvent, view: ViewApi): EventHoveringArg = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], jsEvent = jsEvent.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventHoveringArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventHoveringArg] (val x: Self) extends AnyVal {
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: EventApi): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setJsEvent(value: MouseEvent): Self = StObject.set(x, "jsEvent", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
