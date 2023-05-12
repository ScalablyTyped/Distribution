package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFormattingContext extends StObject {
  
  var calendarSystem: CalendarSystem
  
  var cmdFormatter: js.UndefOr[CmdFormatterFunc] = js.undefined
  
  def computeWeekNumber(d: js.Date): Double
  
  var defaultSeparator: String
  
  var locale: Locale
  
  var timeZone: String
  
  var weekText: String
  
  var weekTextLong: String
}
object DateFormattingContext {
  
  inline def apply(
    calendarSystem: CalendarSystem,
    computeWeekNumber: js.Date => Double,
    defaultSeparator: String,
    locale: Locale,
    timeZone: String,
    weekText: String,
    weekTextLong: String
  ): DateFormattingContext = {
    val __obj = js.Dynamic.literal(calendarSystem = calendarSystem.asInstanceOf[js.Any], computeWeekNumber = js.Any.fromFunction1(computeWeekNumber), defaultSeparator = defaultSeparator.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], weekText = weekText.asInstanceOf[js.Any], weekTextLong = weekTextLong.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormattingContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateFormattingContext] (val x: Self) extends AnyVal {
    
    inline def setCalendarSystem(value: CalendarSystem): Self = StObject.set(x, "calendarSystem", value.asInstanceOf[js.Any])
    
    inline def setCmdFormatter(value: (/* cmd */ String, /* arg */ VerboseFormattingArg) => String): Self = StObject.set(x, "cmdFormatter", js.Any.fromFunction2(value))
    
    inline def setCmdFormatterUndefined: Self = StObject.set(x, "cmdFormatter", js.undefined)
    
    inline def setComputeWeekNumber(value: js.Date => Double): Self = StObject.set(x, "computeWeekNumber", js.Any.fromFunction1(value))
    
    inline def setDefaultSeparator(value: String): Self = StObject.set(x, "defaultSeparator", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setWeekText(value: String): Self = StObject.set(x, "weekText", value.asInstanceOf[js.Any])
    
    inline def setWeekTextLong(value: String): Self = StObject.set(x, "weekTextLong", value.asInstanceOf[js.Any])
  }
}
