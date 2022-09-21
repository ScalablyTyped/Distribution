package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fullcalendar/common.@fullcalendar/common.MountArg<@fullcalendar/common.@fullcalendar/common.ViewContentArg> */
trait ViewMountArg extends StObject {
  
  var el: HTMLElement
  
  var view: ViewApi
}
object ViewMountArg {
  
  inline def apply(el: HTMLElement, view: ViewApi): ViewMountArg = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewMountArg]
  }
  
  extension [Self <: ViewMountArg](x: Self) {
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
