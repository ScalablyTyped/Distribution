package typings.fullcalendarCommon.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateSelectArg
  extends StObject
     with DateSpanApi {
  
  var jsEvent: MouseEvent | Null
  
  var view: ViewApi
}
object DateSelectArg {
  
  inline def apply(allDay: Boolean, end: js.Date, endStr: String, start: js.Date, startStr: String, view: ViewApi): DateSelectArg = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endStr = endStr.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startStr = startStr.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], jsEvent = null)
    __obj.asInstanceOf[DateSelectArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateSelectArg] (val x: Self) extends AnyVal {
    
    inline def setJsEvent(value: MouseEvent): Self = StObject.set(x, "jsEvent", value.asInstanceOf[js.Any])
    
    inline def setJsEventNull: Self = StObject.set(x, "jsEvent", null)
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
