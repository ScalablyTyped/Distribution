package typings.formatjsEcma402Abstract.typesDateTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.DateTimeFormatOptions, 'weekday' | 'era' | 'year' | 'month' | 'day' | 'hour' | 'minute' | 'second' | 'timeZoneName'> & {  hour12 :boolean | undefined,   patternParts :std.Array<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.RangePatternPart<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.RangePatternType>>} */
@js.native
trait RangePatterns extends js.Object {
  
  var day: js.UndefOr[String] = js.native
  
  var era: js.UndefOr[String] = js.native
  
  var hour: js.UndefOr[String] = js.native
  
  var hour12: js.UndefOr[Boolean] = js.native
  
  var minute: js.UndefOr[String] = js.native
  
  var month: js.UndefOr[String] = js.native
  
  var patternParts: js.Array[RangePatternPart[RangePatternType]] = js.native
  
  var second: js.UndefOr[String] = js.native
  
  var timeZoneName: js.UndefOr[String] = js.native
  
  var weekday: js.UndefOr[String] = js.native
  
  var year: js.UndefOr[String] = js.native
}
object RangePatterns {
  
  @scala.inline
  def apply(patternParts: js.Array[RangePatternPart[RangePatternType]]): RangePatterns = {
    val __obj = js.Dynamic.literal(patternParts = patternParts.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePatterns]
  }
  
  @scala.inline
  implicit class RangePatternsOps[Self <: RangePatterns] (val x: Self) extends AnyVal {
    
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
    def setPatternPartsVarargs(value: RangePatternPart[RangePatternType]*): Self = this.set("patternParts", js.Array(value :_*))
    
    @scala.inline
    def setPatternParts(value: js.Array[RangePatternPart[RangePatternType]]): Self = this.set("patternParts", value.asInstanceOf[js.Any])
    
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
