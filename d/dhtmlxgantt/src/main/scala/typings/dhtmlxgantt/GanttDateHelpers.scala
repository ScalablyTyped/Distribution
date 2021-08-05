package typings.dhtmlxgantt

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttDateHelpers extends StObject {
  
  def add(origin: Date, count: Double, unit: String): Date
  
  def convert_to_utc(origin: Date): Date
  
  def copy(origin: Date): Date
  
  def date_part(origin: Date): Date
  
  def date_to_str(format: String): js.Any
  
  def day_start(origin: Date): Date
  
  def getISOWeek(origin: Date): Double
  
  def getUTCISOWeek(origin: Date): Double
  
  def month_start(origin: Date): Date
  
  def str_to_date(format: String): js.Any
  
  def time_part(origin: Date): Date
  
  def to_fixed(value: Double): String
  
  def week_start(origin: Date): Date
  
  def year_start(origin: Date): Date
}
object GanttDateHelpers {
  
  inline def apply(
    add: (Date, Double, String) => Date,
    convert_to_utc: Date => Date,
    copy: Date => Date,
    date_part: Date => Date,
    date_to_str: String => js.Any,
    day_start: Date => Date,
    getISOWeek: Date => Double,
    getUTCISOWeek: Date => Double,
    month_start: Date => Date,
    str_to_date: String => js.Any,
    time_part: Date => Date,
    to_fixed: Double => String,
    week_start: Date => Date,
    year_start: Date => Date
  ): GanttDateHelpers = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), convert_to_utc = js.Any.fromFunction1(convert_to_utc), copy = js.Any.fromFunction1(copy), date_part = js.Any.fromFunction1(date_part), date_to_str = js.Any.fromFunction1(date_to_str), day_start = js.Any.fromFunction1(day_start), getISOWeek = js.Any.fromFunction1(getISOWeek), getUTCISOWeek = js.Any.fromFunction1(getUTCISOWeek), month_start = js.Any.fromFunction1(month_start), str_to_date = js.Any.fromFunction1(str_to_date), time_part = js.Any.fromFunction1(time_part), to_fixed = js.Any.fromFunction1(to_fixed), week_start = js.Any.fromFunction1(week_start), year_start = js.Any.fromFunction1(year_start))
    __obj.asInstanceOf[GanttDateHelpers]
  }
  
  extension [Self <: GanttDateHelpers](x: Self) {
    
    inline def setAdd(value: (Date, Double, String) => Date): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
    
    inline def setConvert_to_utc(value: Date => Date): Self = StObject.set(x, "convert_to_utc", js.Any.fromFunction1(value))
    
    inline def setCopy(value: Date => Date): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setDate_part(value: Date => Date): Self = StObject.set(x, "date_part", js.Any.fromFunction1(value))
    
    inline def setDate_to_str(value: String => js.Any): Self = StObject.set(x, "date_to_str", js.Any.fromFunction1(value))
    
    inline def setDay_start(value: Date => Date): Self = StObject.set(x, "day_start", js.Any.fromFunction1(value))
    
    inline def setGetISOWeek(value: Date => Double): Self = StObject.set(x, "getISOWeek", js.Any.fromFunction1(value))
    
    inline def setGetUTCISOWeek(value: Date => Double): Self = StObject.set(x, "getUTCISOWeek", js.Any.fromFunction1(value))
    
    inline def setMonth_start(value: Date => Date): Self = StObject.set(x, "month_start", js.Any.fromFunction1(value))
    
    inline def setStr_to_date(value: String => js.Any): Self = StObject.set(x, "str_to_date", js.Any.fromFunction1(value))
    
    inline def setTime_part(value: Date => Date): Self = StObject.set(x, "time_part", js.Any.fromFunction1(value))
    
    inline def setTo_fixed(value: Double => String): Self = StObject.set(x, "to_fixed", js.Any.fromFunction1(value))
    
    inline def setWeek_start(value: Date => Date): Self = StObject.set(x, "week_start", js.Any.fromFunction1(value))
    
    inline def setYear_start(value: Date => Date): Self = StObject.set(x, "year_start", js.Any.fromFunction1(value))
  }
}
