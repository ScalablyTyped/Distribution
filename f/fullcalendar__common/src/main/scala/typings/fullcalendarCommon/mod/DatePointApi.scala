package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePointApi extends StObject {
  
  var allDay: Boolean
  
  var date: js.Date
  
  var dateStr: String
}
object DatePointApi {
  
  inline def apply(allDay: Boolean, date: js.Date, dateStr: String): DatePointApi = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dateStr = dateStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePointApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatePointApi] (val x: Self) extends AnyVal {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateStr(value: String): Self = StObject.set(x, "dateStr", value.asInstanceOf[js.Any])
  }
}
