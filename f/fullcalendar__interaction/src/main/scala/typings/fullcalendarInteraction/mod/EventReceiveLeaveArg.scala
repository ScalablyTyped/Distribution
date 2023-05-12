package typings.fullcalendarInteraction.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventReceiveLeaveArg extends StObject {
  
  var draggedEl: HTMLElement
  
  var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventApi */ Any
  
  var relatedEvents: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventApi */ Any
  ]
  
  def revert(): Unit
  
  var view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
}
object EventReceiveLeaveArg {
  
  inline def apply(
    draggedEl: HTMLElement,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventApi */ Any,
    relatedEvents: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventApi */ Any
    ],
    revert: () => Unit,
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
  ): EventReceiveLeaveArg = {
    val __obj = js.Dynamic.literal(draggedEl = draggedEl.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], relatedEvents = relatedEvents.asInstanceOf[js.Any], revert = js.Any.fromFunction0(revert), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventReceiveLeaveArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventReceiveLeaveArg] (val x: Self) extends AnyVal {
    
    inline def setDraggedEl(value: HTMLElement): Self = StObject.set(x, "draggedEl", value.asInstanceOf[js.Any])
    
    inline def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventApi */ Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setRelatedEvents(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventApi */ Any
        ]
    ): Self = StObject.set(x, "relatedEvents", value.asInstanceOf[js.Any])
    
    inline def setRelatedEventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventApi */ Any)*
    ): Self = StObject.set(x, "relatedEvents", js.Array(value*))
    
    inline def setRevert(value: () => Unit): Self = StObject.set(x, "revert", js.Any.fromFunction0(value))
    
    inline def setView(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
    ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
