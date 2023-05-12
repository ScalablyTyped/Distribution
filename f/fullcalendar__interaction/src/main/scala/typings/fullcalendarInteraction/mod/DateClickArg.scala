package typings.fullcalendarInteraction.mod

import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DatePointApi * / any */ trait DateClickArg extends StObject {
  
  var dayEl: HTMLElement
  
  var jsEvent: MouseEvent
  
  var view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
}
object DateClickArg {
  
  inline def apply(
    dayEl: HTMLElement,
    jsEvent: MouseEvent,
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
  ): DateClickArg = {
    val __obj = js.Dynamic.literal(dayEl = dayEl.asInstanceOf[js.Any], jsEvent = jsEvent.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateClickArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateClickArg] (val x: Self) extends AnyVal {
    
    inline def setDayEl(value: HTMLElement): Self = StObject.set(x, "dayEl", value.asInstanceOf[js.Any])
    
    inline def setJsEvent(value: MouseEvent): Self = StObject.set(x, "jsEvent", value.asInstanceOf[js.Any])
    
    inline def setView(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
    ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
