package typings.fullcalendarCore.internalCommonMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fullcalendar/core.@fullcalendar/core/internal-common.MountArg<@fullcalendar/core.@fullcalendar/core/internal-common.ViewContentArg> */
trait ViewMountArg extends StObject {
  
  var el: HTMLElement
  
  var view: ViewApi
}
object ViewMountArg {
  
  inline def apply(el: HTMLElement, view: ViewApi): ViewMountArg = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewMountArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewMountArg] (val x: Self) extends AnyVal {
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
