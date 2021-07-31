package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Day extends StObject {
  
  var day: Double
  
  var era: String
  
  var hour: Double
  
  var inDST: Boolean
  
  var minute: Double
  
  var month: Double
  
  var relatedYear: Unit
  
  var second: Double
  
  var timeZoneOffset: Double
  
  var weekday: Double
  
  var year: Double
  
  var yearName: Unit
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
    relatedYear: Unit,
    second: Double,
    timeZoneOffset: Double,
    weekday: Double,
    year: Double,
    yearName: Unit
  ): Day = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], era = era.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], inDST = inDST.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], relatedYear = relatedYear.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timeZoneOffset = timeZoneOffset.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], yearName = yearName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Day]
  }
  
  @scala.inline
  implicit class DayMutableBuilder[Self <: Day] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEra(value: String): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDST(value: Boolean): Self = StObject.set(x, "inDST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedYear(value: Unit): Self = StObject.set(x, "relatedYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneOffset(value: Double): Self = StObject.set(x, "timeZoneOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekday(value: Double): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearName(value: Unit): Self = StObject.set(x, "yearName", value.asInstanceOf[js.Any])
  }
}
