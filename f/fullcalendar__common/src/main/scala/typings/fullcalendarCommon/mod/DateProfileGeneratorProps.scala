package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateProfileGeneratorProps
  extends StObject
     with DateProfileOptions {
  
  var calendarApi: CalendarApi
  
  var dateEnv: DateEnv
  
  var dateProfileGeneratorClass: DateProfileGeneratorClass
  
  var duration: Duration
  
  var durationUnit: String
  
  var usesMinMaxTime: Boolean
}
object DateProfileGeneratorProps {
  
  inline def apply(
    calendarApi: CalendarApi,
    dateEnv: DateEnv,
    dateProfileGeneratorClass: DateProfileGeneratorClass,
    duration: Duration,
    durationUnit: String,
    slotMaxTime: Duration,
    slotMinTime: Duration,
    usesMinMaxTime: Boolean
  ): DateProfileGeneratorProps = {
    val __obj = js.Dynamic.literal(calendarApi = calendarApi.asInstanceOf[js.Any], dateEnv = dateEnv.asInstanceOf[js.Any], dateProfileGeneratorClass = dateProfileGeneratorClass.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], durationUnit = durationUnit.asInstanceOf[js.Any], slotMaxTime = slotMaxTime.asInstanceOf[js.Any], slotMinTime = slotMinTime.asInstanceOf[js.Any], usesMinMaxTime = usesMinMaxTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateProfileGeneratorProps]
  }
  
  extension [Self <: DateProfileGeneratorProps](x: Self) {
    
    inline def setCalendarApi(value: CalendarApi): Self = StObject.set(x, "calendarApi", value.asInstanceOf[js.Any])
    
    inline def setDateEnv(value: DateEnv): Self = StObject.set(x, "dateEnv", value.asInstanceOf[js.Any])
    
    inline def setDateProfileGeneratorClass(value: DateProfileGeneratorClass): Self = StObject.set(x, "dateProfileGeneratorClass", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUnit(value: String): Self = StObject.set(x, "durationUnit", value.asInstanceOf[js.Any])
    
    inline def setUsesMinMaxTime(value: Boolean): Self = StObject.set(x, "usesMinMaxTime", value.asInstanceOf[js.Any])
  }
}
