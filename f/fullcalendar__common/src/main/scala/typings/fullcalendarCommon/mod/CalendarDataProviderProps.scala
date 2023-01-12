package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarDataProviderProps extends StObject {
  
  var calendarApi: CalendarApi
  
  var children: js.UndefOr[
    js.Function1[
      /* data */ CalendarData, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ]
  ] = js.undefined
  
  var optionOverrides: Any
}
object CalendarDataProviderProps {
  
  inline def apply(calendarApi: CalendarApi, optionOverrides: Any): CalendarDataProviderProps = {
    val __obj = js.Dynamic.literal(calendarApi = calendarApi.asInstanceOf[js.Any], optionOverrides = optionOverrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDataProviderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarDataProviderProps] (val x: Self) extends AnyVal {
    
    inline def setCalendarApi(value: CalendarApi): Self = StObject.set(x, "calendarApi", value.asInstanceOf[js.Any])
    
    inline def setChildren(
      value: /* data */ CalendarData => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOptionOverrides(value: Any): Self = StObject.set(x, "optionOverrides", value.asInstanceOf[js.Any])
  }
}
