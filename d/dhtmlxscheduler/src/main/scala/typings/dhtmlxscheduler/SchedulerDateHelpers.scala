package typings.dhtmlxscheduler

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerDateHelpers extends js.Object {
  
  def add(origin: Date, count: Double, unit: String): Date = js.native
  
  def add_map(origin: Date, count: Double): Date = js.native
  
  def convert_to_utc(origin: Date): Date = js.native
  
  def copy(origin: Date): Date = js.native
  
  def date_part(origin: Date): Date = js.native
  
  def date_to_str(format: String): js.Any = js.native
  
  def day_start(origin: Date): Date = js.native
  
  def getISOWeek(origin: Date): Double = js.native
  
  def getUTCISOWeek(origin: Date): Double = js.native
  
  def month_start(origin: Date): Date = js.native
  
  def str_to_date(format: String): js.Any = js.native
  
  def time_part(origin: Date): Date = js.native
  
  def to_fixed(value: Double): String = js.native
  
  def week_start(origin: Date): Date = js.native
  
  def year_start(origin: Date): Date = js.native
}
object SchedulerDateHelpers {
  
  @scala.inline
  def apply(
    add: (Date, Double, String) => Date,
    add_map: (Date, Double) => Date,
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
  ): SchedulerDateHelpers = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), add_map = js.Any.fromFunction2(add_map), convert_to_utc = js.Any.fromFunction1(convert_to_utc), copy = js.Any.fromFunction1(copy), date_part = js.Any.fromFunction1(date_part), date_to_str = js.Any.fromFunction1(date_to_str), day_start = js.Any.fromFunction1(day_start), getISOWeek = js.Any.fromFunction1(getISOWeek), getUTCISOWeek = js.Any.fromFunction1(getUTCISOWeek), month_start = js.Any.fromFunction1(month_start), str_to_date = js.Any.fromFunction1(str_to_date), time_part = js.Any.fromFunction1(time_part), to_fixed = js.Any.fromFunction1(to_fixed), week_start = js.Any.fromFunction1(week_start), year_start = js.Any.fromFunction1(year_start))
    __obj.asInstanceOf[SchedulerDateHelpers]
  }
  
  @scala.inline
  implicit class SchedulerDateHelpersOps[Self <: SchedulerDateHelpers] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (Date, Double, String) => Date): Self = this.set("add", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAdd_map(value: (Date, Double) => Date): Self = this.set("add_map", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvert_to_utc(value: Date => Date): Self = this.set("convert_to_utc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopy(value: Date => Date): Self = this.set("copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDate_part(value: Date => Date): Self = this.set("date_part", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDate_to_str(value: String => js.Any): Self = this.set("date_to_str", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDay_start(value: Date => Date): Self = this.set("day_start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetISOWeek(value: Date => Double): Self = this.set("getISOWeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUTCISOWeek(value: Date => Double): Self = this.set("getUTCISOWeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMonth_start(value: Date => Date): Self = this.set("month_start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStr_to_date(value: String => js.Any): Self = this.set("str_to_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTime_part(value: Date => Date): Self = this.set("time_part", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo_fixed(value: Double => String): Self = this.set("to_fixed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeek_start(value: Date => Date): Self = this.set("week_start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYear_start(value: Date => Date): Self = this.set("year_start", js.Any.fromFunction1(value))
  }
}
