package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.DateTimeFormatOptions, 'weekday' | 'era' | 'year' | 'month' | 'day' | 'hour' | 'minute' | 'second' | 'timeZoneName'> & {  hour12 :boolean | undefined} */
trait PickDateTimeFormatOptions extends StObject {
  
  var day: js.UndefOr[String] = js.undefined
  
  var era: js.UndefOr[String] = js.undefined
  
  var hour: js.UndefOr[String] = js.undefined
  
  var hour12: js.UndefOr[Boolean] = js.undefined
  
  var minute: js.UndefOr[String] = js.undefined
  
  var month: js.UndefOr[String] = js.undefined
  
  var second: js.UndefOr[String] = js.undefined
  
  var timeZoneName: js.UndefOr[String] = js.undefined
  
  var weekday: js.UndefOr[String] = js.undefined
  
  var year: js.UndefOr[String] = js.undefined
}
object PickDateTimeFormatOptions {
  
  inline def apply(): PickDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDateTimeFormatOptions]
  }
  
  extension [Self <: PickDateTimeFormatOptions](x: Self) {
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setEra(value: String): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
    
    inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
    
    inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setTimeZoneName(value: String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
    
    inline def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
