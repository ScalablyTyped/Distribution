package typings.formatjsEcma402Abstract.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Day extends js.Object {
  
  var day: Double = js.native
  
  var era: String = js.native
  
  var hour: Double = js.native
  
  var inDST: Boolean = js.native
  
  var minute: Double = js.native
  
  var month: Double = js.native
  
  var relatedYear: js.UndefOr[scala.Nothing] = js.native
  
  var second: Double = js.native
  
  var timeZoneOffset: Double = js.native
  
  var weekday: Double = js.native
  
  var year: Double = js.native
  
  var yearName: js.UndefOr[scala.Nothing] = js.native
}
object Day {
  
  @scala.inline
  def apply(
    day: Double,
    era: String,
    hour: Double,
    inDST: Boolean,
    minute: Double,
    month: Double,
    second: Double,
    timeZoneOffset: Double,
    weekday: Double,
    year: Double
  ): Day = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], era = era.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], inDST = inDST.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timeZoneOffset = timeZoneOffset.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Day]
  }
  
  @scala.inline
  implicit class DayOps[Self <: Day] (val x: Self) extends AnyVal {
    
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
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEra(value: String): Self = this.set("era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDST(value: Boolean): Self = this.set("inDST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneOffset(value: Double): Self = this.set("timeZoneOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekday(value: Double): Self = this.set("weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
  }
}
