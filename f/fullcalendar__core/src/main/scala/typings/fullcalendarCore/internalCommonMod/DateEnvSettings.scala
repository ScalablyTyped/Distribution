package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateEnvSettings extends StObject {
  
  var calendarSystem: String
  
  var cmdFormatter: js.UndefOr[CmdFormatterFunc] = js.undefined
  
  var defaultSeparator: js.UndefOr[String] = js.undefined
  
  var firstDay: js.UndefOr[Double] = js.undefined
  
  var locale: Locale
  
  var namedTimeZoneImpl: js.UndefOr[NamedTimeZoneImplClass] = js.undefined
  
  var timeZone: String
  
  var weekNumberCalculation: js.UndefOr[WeekNumberCalculation] = js.undefined
  
  var weekText: js.UndefOr[String] = js.undefined
  
  var weekTextLong: js.UndefOr[String] = js.undefined
}
object DateEnvSettings {
  
  inline def apply(calendarSystem: String, locale: Locale, timeZone: String): DateEnvSettings = {
    val __obj = js.Dynamic.literal(calendarSystem = calendarSystem.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateEnvSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateEnvSettings] (val x: Self) extends AnyVal {
    
    inline def setCalendarSystem(value: String): Self = StObject.set(x, "calendarSystem", value.asInstanceOf[js.Any])
    
    inline def setCmdFormatter(value: (/* cmd */ String, /* arg */ VerboseFormattingArg) => String): Self = StObject.set(x, "cmdFormatter", js.Any.fromFunction2(value))
    
    inline def setCmdFormatterUndefined: Self = StObject.set(x, "cmdFormatter", js.undefined)
    
    inline def setDefaultSeparator(value: String): Self = StObject.set(x, "defaultSeparator", value.asInstanceOf[js.Any])
    
    inline def setDefaultSeparatorUndefined: Self = StObject.set(x, "defaultSeparator", js.undefined)
    
    inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    inline def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setNamedTimeZoneImpl(value: NamedTimeZoneImplClass): Self = StObject.set(x, "namedTimeZoneImpl", value.asInstanceOf[js.Any])
    
    inline def setNamedTimeZoneImplUndefined: Self = StObject.set(x, "namedTimeZoneImpl", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setWeekNumberCalculation(value: WeekNumberCalculation): Self = StObject.set(x, "weekNumberCalculation", value.asInstanceOf[js.Any])
    
    inline def setWeekNumberCalculationFunction1(value: /* m */ js.Date => Double): Self = StObject.set(x, "weekNumberCalculation", js.Any.fromFunction1(value))
    
    inline def setWeekNumberCalculationUndefined: Self = StObject.set(x, "weekNumberCalculation", js.undefined)
    
    inline def setWeekText(value: String): Self = StObject.set(x, "weekText", value.asInstanceOf[js.Any])
    
    inline def setWeekTextLong(value: String): Self = StObject.set(x, "weekTextLong", value.asInstanceOf[js.Any])
    
    inline def setWeekTextLongUndefined: Self = StObject.set(x, "weekTextLong", js.undefined)
    
    inline def setWeekTextUndefined: Self = StObject.set(x, "weekText", js.undefined)
  }
}
