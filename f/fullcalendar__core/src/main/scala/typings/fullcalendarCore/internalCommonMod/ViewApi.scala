package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewApi extends StObject {
  
  var activeEnd: js.Date
  
  var activeStart: js.Date
  
  var calendar: CalendarApi
  
  var currentEnd: js.Date
  
  var currentStart: js.Date
  
  def getOption(name: String): Any
  
  var title: String
  
  var `type`: String
}
object ViewApi {
  
  inline def apply(
    activeEnd: js.Date,
    activeStart: js.Date,
    calendar: CalendarApi,
    currentEnd: js.Date,
    currentStart: js.Date,
    getOption: String => Any,
    title: String,
    `type`: String
  ): ViewApi = {
    val __obj = js.Dynamic.literal(activeEnd = activeEnd.asInstanceOf[js.Any], activeStart = activeStart.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], currentEnd = currentEnd.asInstanceOf[js.Any], currentStart = currentStart.asInstanceOf[js.Any], getOption = js.Any.fromFunction1(getOption), title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewApi] (val x: Self) extends AnyVal {
    
    inline def setActiveEnd(value: js.Date): Self = StObject.set(x, "activeEnd", value.asInstanceOf[js.Any])
    
    inline def setActiveStart(value: js.Date): Self = StObject.set(x, "activeStart", value.asInstanceOf[js.Any])
    
    inline def setCalendar(value: CalendarApi): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCurrentEnd(value: js.Date): Self = StObject.set(x, "currentEnd", value.asInstanceOf[js.Any])
    
    inline def setCurrentStart(value: js.Date): Self = StObject.set(x, "currentStart", value.asInstanceOf[js.Any])
    
    inline def setGetOption(value: String => Any): Self = StObject.set(x, "getOption", js.Any.fromFunction1(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
