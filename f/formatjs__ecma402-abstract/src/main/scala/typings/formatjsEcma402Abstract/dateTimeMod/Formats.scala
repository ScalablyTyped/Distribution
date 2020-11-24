package typings.formatjsEcma402Abstract.dateTimeMod

import typings.formatjsEcma402Abstract.anon.RecordTABLE2defaultRangeP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.DateTimeFormatOptions, 'weekday' | 'era' | 'year' | 'month' | 'day' | 'hour' | 'minute' | 'second' | 'timeZoneName'> & {  hour12 :boolean | undefined,   pattern :string,   pattern12 :string,   skeleton :string,   rawPattern :string,   rangePatterns :std.Record<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.TABLE_2 | 'default', @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.RangePatterns>,   rangePatterns12 :std.Record<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.TABLE_2 | 'default', @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.RangePatterns>} */
@js.native
trait Formats extends js.Object {
  
  var day: js.UndefOr[String] = js.native
  
  var era: js.UndefOr[String] = js.native
  
  var hour: js.UndefOr[String] = js.native
  
  var hour12: js.UndefOr[Boolean] = js.native
  
  var minute: js.UndefOr[String] = js.native
  
  var month: js.UndefOr[String] = js.native
  
  var pattern: String = js.native
  
  var pattern12: String = js.native
  
  var rangePatterns: RecordTABLE2defaultRangeP = js.native
  
  var rangePatterns12: RecordTABLE2defaultRangeP = js.native
  
  var rawPattern: String = js.native
  
  var second: js.UndefOr[String] = js.native
  
  var skeleton: String = js.native
  
  var timeZoneName: js.UndefOr[String] = js.native
  
  var weekday: js.UndefOr[String] = js.native
  
  var year: js.UndefOr[String] = js.native
}
object Formats {
  
  @scala.inline
  def apply(
    pattern: String,
    pattern12: String,
    rangePatterns: RecordTABLE2defaultRangeP,
    rangePatterns12: RecordTABLE2defaultRangeP,
    rawPattern: String,
    skeleton: String
  ): Formats = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], pattern12 = pattern12.asInstanceOf[js.Any], rangePatterns = rangePatterns.asInstanceOf[js.Any], rangePatterns12 = rangePatterns12.asInstanceOf[js.Any], rawPattern = rawPattern.asInstanceOf[js.Any], skeleton = skeleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
  
  @scala.inline
  implicit class FormatsOps[Self <: Formats] (val x: Self) extends AnyVal {
    
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
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern12(value: String): Self = this.set("pattern12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangePatterns(value: RecordTABLE2defaultRangeP): Self = this.set("rangePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangePatterns12(value: RecordTABLE2defaultRangeP): Self = this.set("rangePatterns12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawPattern(value: String): Self = this.set("rawPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeleton(value: String): Self = this.set("skeleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setEra(value: String): Self = this.set("era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEra: Self = this.set("era", js.undefined)
    
    @scala.inline
    def setHour(value: String): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    
    @scala.inline
    def setHour12(value: Boolean): Self = this.set("hour12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour12: Self = this.set("hour12", js.undefined)
    
    @scala.inline
    def setMinute(value: String): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setSecond(value: String): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    
    @scala.inline
    def setTimeZoneName(value: String): Self = this.set("timeZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneName: Self = this.set("timeZoneName", js.undefined)
    
    @scala.inline
    def setWeekday(value: String): Self = this.set("weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekday: Self = this.set("weekday", js.undefined)
    
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
