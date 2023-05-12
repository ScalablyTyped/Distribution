package typings.fullcalendarCore.internalCommonMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fullcalendar/core.@fullcalendar/core/internal-common.MountArg<@fullcalendar/core.@fullcalendar/core/internal-common.WeekNumberContentArg> */
trait WeekNumberMountArg extends StObject {
  
  var date: js.Date
  
  var el: HTMLElement
  
  var num: Double
  
  var text: String
}
object WeekNumberMountArg {
  
  inline def apply(date: js.Date, el: HTMLElement, num: Double, text: String): WeekNumberMountArg = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekNumberMountArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeekNumberMountArg] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
