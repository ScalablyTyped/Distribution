package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateSpanApi
  extends StObject
     with RangeApi {
  
  var allDay: Boolean
}
object DateSpanApi {
  
  inline def apply(allDay: Boolean, end: js.Date, endStr: String, start: js.Date, startStr: String): DateSpanApi = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endStr = endStr.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startStr = startStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateSpanApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateSpanApi] (val x: Self) extends AnyVal {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
  }
}
