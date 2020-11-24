package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.dateTimeMod.RangePatterns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.TABLE_2 | 'default', @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.RangePatterns> */
@js.native
trait RecordTABLE2defaultRangeP extends js.Object {
  
  var ampm: RangePatterns = js.native
  
  var day: RangePatterns = js.native
  
  var default: RangePatterns = js.native
  
  var era: RangePatterns = js.native
  
  var hour: RangePatterns = js.native
  
  var minute: RangePatterns = js.native
  
  var month: RangePatterns = js.native
  
  var second: RangePatterns = js.native
  
  var year: RangePatterns = js.native
}
object RecordTABLE2defaultRangeP {
  
  @scala.inline
  def apply(
    ampm: RangePatterns,
    day: RangePatterns,
    default: RangePatterns,
    era: RangePatterns,
    hour: RangePatterns,
    minute: RangePatterns,
    month: RangePatterns,
    second: RangePatterns,
    year: RangePatterns
  ): RecordTABLE2defaultRangeP = {
    val __obj = js.Dynamic.literal(ampm = ampm.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], era = era.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordTABLE2defaultRangeP]
  }
  
  @scala.inline
  implicit class RecordTABLE2defaultRangePOps[Self <: RecordTABLE2defaultRangeP] (val x: Self) extends AnyVal {
    
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
    def setAmpm(value: RangePatterns): Self = this.set("ampm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay(value: RangePatterns): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: RangePatterns): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEra(value: RangePatterns): Self = this.set("era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: RangePatterns): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: RangePatterns): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: RangePatterns): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: RangePatterns): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: RangePatterns): Self = this.set("year", value.asInstanceOf[js.Any])
  }
}
