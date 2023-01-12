package typings.dhtmlxscheduler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerDateHelpers extends StObject {
  
  def add(origin: js.Date, count: Double, unit: String): js.Date
  
  def add_map(origin: js.Date, count: Double): js.Date
  
  def convert_to_utc(origin: js.Date): js.Date
  
  def copy(origin: js.Date): js.Date
  
  def date_part(origin: js.Date): js.Date
  
  def date_to_str(format: String): Any
  
  def day_start(origin: js.Date): js.Date
  
  def getISOWeek(origin: js.Date): Double
  
  def getUTCISOWeek(origin: js.Date): Double
  
  def month_start(origin: js.Date): js.Date
  
  def str_to_date(format: String): Any
  
  def time_part(origin: js.Date): js.Date
  
  def to_fixed(value: Double): String
  
  def week_start(origin: js.Date): js.Date
  
  def year_start(origin: js.Date): js.Date
}
object SchedulerDateHelpers {
  
  inline def apply(
    add: (js.Date, Double, String) => js.Date,
    add_map: (js.Date, Double) => js.Date,
    convert_to_utc: js.Date => js.Date,
    copy: js.Date => js.Date,
    date_part: js.Date => js.Date,
    date_to_str: String => Any,
    day_start: js.Date => js.Date,
    getISOWeek: js.Date => Double,
    getUTCISOWeek: js.Date => Double,
    month_start: js.Date => js.Date,
    str_to_date: String => Any,
    time_part: js.Date => js.Date,
    to_fixed: Double => String,
    week_start: js.Date => js.Date,
    year_start: js.Date => js.Date
  ): SchedulerDateHelpers = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), add_map = js.Any.fromFunction2(add_map), convert_to_utc = js.Any.fromFunction1(convert_to_utc), copy = js.Any.fromFunction1(copy), date_part = js.Any.fromFunction1(date_part), date_to_str = js.Any.fromFunction1(date_to_str), day_start = js.Any.fromFunction1(day_start), getISOWeek = js.Any.fromFunction1(getISOWeek), getUTCISOWeek = js.Any.fromFunction1(getUTCISOWeek), month_start = js.Any.fromFunction1(month_start), str_to_date = js.Any.fromFunction1(str_to_date), time_part = js.Any.fromFunction1(time_part), to_fixed = js.Any.fromFunction1(to_fixed), week_start = js.Any.fromFunction1(week_start), year_start = js.Any.fromFunction1(year_start))
    __obj.asInstanceOf[SchedulerDateHelpers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerDateHelpers] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (js.Date, Double, String) => js.Date): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
    
    inline def setAdd_map(value: (js.Date, Double) => js.Date): Self = StObject.set(x, "add_map", js.Any.fromFunction2(value))
    
    inline def setConvert_to_utc(value: js.Date => js.Date): Self = StObject.set(x, "convert_to_utc", js.Any.fromFunction1(value))
    
    inline def setCopy(value: js.Date => js.Date): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setDate_part(value: js.Date => js.Date): Self = StObject.set(x, "date_part", js.Any.fromFunction1(value))
    
    inline def setDate_to_str(value: String => Any): Self = StObject.set(x, "date_to_str", js.Any.fromFunction1(value))
    
    inline def setDay_start(value: js.Date => js.Date): Self = StObject.set(x, "day_start", js.Any.fromFunction1(value))
    
    inline def setGetISOWeek(value: js.Date => Double): Self = StObject.set(x, "getISOWeek", js.Any.fromFunction1(value))
    
    inline def setGetUTCISOWeek(value: js.Date => Double): Self = StObject.set(x, "getUTCISOWeek", js.Any.fromFunction1(value))
    
    inline def setMonth_start(value: js.Date => js.Date): Self = StObject.set(x, "month_start", js.Any.fromFunction1(value))
    
    inline def setStr_to_date(value: String => Any): Self = StObject.set(x, "str_to_date", js.Any.fromFunction1(value))
    
    inline def setTime_part(value: js.Date => js.Date): Self = StObject.set(x, "time_part", js.Any.fromFunction1(value))
    
    inline def setTo_fixed(value: Double => String): Self = StObject.set(x, "to_fixed", js.Any.fromFunction1(value))
    
    inline def setWeek_start(value: js.Date => js.Date): Self = StObject.set(x, "week_start", js.Any.fromFunction1(value))
    
    inline def setYear_start(value: js.Date => js.Date): Self = StObject.set(x, "year_start", js.Any.fromFunction1(value))
  }
}
