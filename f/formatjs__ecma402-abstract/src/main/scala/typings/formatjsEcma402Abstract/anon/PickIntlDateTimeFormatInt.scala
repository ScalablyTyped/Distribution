package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`2-digit`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.narrow
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.numeric
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.IntlDateTimeFormatInternal, @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.TABLE_6> */
@js.native
trait PickIntlDateTimeFormatInt extends js.Object {
  
  var day: `2-digit` | numeric = js.native
  
  var era: narrow | short | long = js.native
  
  var hour: `2-digit` | numeric = js.native
  
  var minute: `2-digit` | numeric = js.native
  
  var month: `2-digit` | numeric | narrow | short | long = js.native
  
  var second: `2-digit` | numeric = js.native
  
  var timeZoneName: short | long = js.native
  
  var weekday: narrow | short | long = js.native
  
  var year: `2-digit` | numeric = js.native
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
  implicit class PickIntlDateTimeFormatIntOps[Self <: PickIntlDateTimeFormatInt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDay(value: `2-digit` | numeric): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEra(value: narrow | short | long): Self = this.set("era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: `2-digit` | numeric): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: `2-digit` | numeric): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: `2-digit` | numeric | narrow | short | long): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: `2-digit` | numeric): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneName(value: short | long): Self = this.set("timeZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekday(value: narrow | short | long): Self = this.set("weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: `2-digit` | numeric): Self = this.set("year", value.asInstanceOf[js.Any])
  }
}
