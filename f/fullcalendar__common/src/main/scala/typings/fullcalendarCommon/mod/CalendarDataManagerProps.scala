package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarDataManagerProps extends StObject {
  
  var calendarApi: CalendarApi
  
  var onAction: js.UndefOr[js.Function1[/* action */ Action, Unit]] = js.undefined
  
  var onData: js.UndefOr[js.Function1[/* data */ CalendarData, Unit]] = js.undefined
  
  var optionOverrides: CalendarOptions
}
object CalendarDataManagerProps {
  
  inline def apply(calendarApi: CalendarApi, optionOverrides: CalendarOptions): CalendarDataManagerProps = {
    val __obj = js.Dynamic.literal(calendarApi = calendarApi.asInstanceOf[js.Any], optionOverrides = optionOverrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDataManagerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarDataManagerProps] (val x: Self) extends AnyVal {
    
    inline def setCalendarApi(value: CalendarApi): Self = StObject.set(x, "calendarApi", value.asInstanceOf[js.Any])
    
    inline def setOnAction(value: /* action */ Action => Unit): Self = StObject.set(x, "onAction", js.Any.fromFunction1(value))
    
    inline def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
    
    inline def setOnData(value: /* data */ CalendarData => Unit): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
    
    inline def setOnDataUndefined: Self = StObject.set(x, "onData", js.undefined)
    
    inline def setOptionOverrides(value: CalendarOptions): Self = StObject.set(x, "optionOverrides", value.asInstanceOf[js.Any])
  }
}
