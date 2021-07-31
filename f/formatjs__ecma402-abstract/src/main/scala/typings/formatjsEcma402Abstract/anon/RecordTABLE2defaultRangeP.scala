package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.dateTimeMod.RangePatterns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.TABLE_2 | 'default', @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/date-time.RangePatterns> */
trait RecordTABLE2defaultRangeP extends StObject {
  
  var default: RangePatterns
  
  var ampm: RangePatterns
  
  var day: RangePatterns
  
  var era: RangePatterns
  
  var hour: RangePatterns
  
  var minute: RangePatterns
  
  var month: RangePatterns
  
  var second: RangePatterns
  
  var year: RangePatterns
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
  implicit class RecordTABLE2defaultRangePMutableBuilder[Self <: RecordTABLE2defaultRangeP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmpm(value: RangePatterns): Self = StObject.set(x, "ampm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay(value: RangePatterns): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: RangePatterns): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEra(value: RangePatterns): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: RangePatterns): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: RangePatterns): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: RangePatterns): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: RangePatterns): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: RangePatterns): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
