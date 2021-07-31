package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`2-digit`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.narrow
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.numeric
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.IntlDateTimeFormatInternal, @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.TABLE_6> */
trait PickIntlDateTimeFormatInt extends StObject {
  
  var day: `2-digit` | numeric
  
  var era: narrow | short | long
  
  var hour: `2-digit` | numeric
  
  var minute: `2-digit` | numeric
  
  var month: `2-digit` | numeric | narrow | short | long
  
  var second: `2-digit` | numeric
  
  var timeZoneName: short | long
  
  var weekday: narrow | short | long
  
  var year: `2-digit` | numeric
}
object PickIntlDateTimeFormatInt {
  
  @scala.inline
  def apply(
    day: `2-digit` | numeric,
    era: narrow | short | long,
    hour: `2-digit` | numeric,
    minute: `2-digit` | numeric,
    month: `2-digit` | numeric | narrow | short | long,
    second: `2-digit` | numeric,
    timeZoneName: short | long,
    weekday: narrow | short | long,
    year: `2-digit` | numeric
  ): PickIntlDateTimeFormatInt = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], era = era.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIntlDateTimeFormatInt]
  }
  
  @scala.inline
  implicit class PickIntlDateTimeFormatIntMutableBuilder[Self <: PickIntlDateTimeFormatInt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: `2-digit` | numeric): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEra(value: narrow | short | long): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: `2-digit` | numeric): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: `2-digit` | numeric): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: `2-digit` | numeric | narrow | short | long): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: `2-digit` | numeric): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneName(value: short | long): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekday(value: narrow | short | long): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: `2-digit` | numeric): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
