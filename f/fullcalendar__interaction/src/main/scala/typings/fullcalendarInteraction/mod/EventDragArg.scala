package typings.fullcalendarInteraction.mod

import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDragArg extends StObject {
  
  var el: HTMLElement
  
  var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventApi */ Any
  
  var jsEvent: MouseEvent
  
  var view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
}
object EventDragArg {
  
  inline def apply(
    el: HTMLElement,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventApi */ Any,
    jsEvent: MouseEvent,
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
  ): EventDragArg = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], jsEvent = jsEvent.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDragArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventDragArg] (val x: Self) extends AnyVal {
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventApi */ Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setJsEvent(value: MouseEvent): Self = StObject.set(x, "jsEvent", value.asInstanceOf[js.Any])
    
    inline def setView(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
    ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
