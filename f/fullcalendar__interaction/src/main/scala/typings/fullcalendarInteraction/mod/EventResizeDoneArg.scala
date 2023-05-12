package typings.fullcalendarInteraction.mod

import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventChangeArg * / any */ trait EventResizeDoneArg extends StObject {
  
  var el: HTMLElement
  
  var endDelta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
  
  var jsEvent: MouseEvent
  
  var startDelta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
  
  var view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
}
object EventResizeDoneArg {
  
  inline def apply(
    el: HTMLElement,
    endDelta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any,
    jsEvent: MouseEvent,
    startDelta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any,
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
  ): EventResizeDoneArg = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], endDelta = endDelta.asInstanceOf[js.Any], jsEvent = jsEvent.asInstanceOf[js.Any], startDelta = startDelta.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventResizeDoneArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventResizeDoneArg] (val x: Self) extends AnyVal {
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setEndDelta(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
    ): Self = StObject.set(x, "endDelta", value.asInstanceOf[js.Any])
    
    inline def setJsEvent(value: MouseEvent): Self = StObject.set(x, "jsEvent", value.asInstanceOf[js.Any])
    
    inline def setStartDelta(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
    ): Self = StObject.set(x, "startDelta", value.asInstanceOf[js.Any])
    
    inline def setView(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
    ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
