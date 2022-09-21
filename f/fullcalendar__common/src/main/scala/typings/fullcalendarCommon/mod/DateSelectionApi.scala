package typings.fullcalendarCommon.mod

import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateSelectionApi
  extends StObject
     with DateSpanApi {
  
  var jsEvent: UIEvent
  
  var view: ViewApi
}
object DateSelectionApi {
  
  inline def apply(
    allDay: Boolean,
    end: js.Date,
    endStr: String,
    jsEvent: UIEvent,
    start: js.Date,
    startStr: String,
    view: ViewApi
  ): DateSelectionApi = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endStr = endStr.asInstanceOf[js.Any], jsEvent = jsEvent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startStr = startStr.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateSelectionApi]
  }
  
  extension [Self <: DateSelectionApi](x: Self) {
    
    inline def setJsEvent(value: UIEvent): Self = StObject.set(x, "jsEvent", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
