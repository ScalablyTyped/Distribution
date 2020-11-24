package typings.devexpressUtils.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateFormatterOptions extends js.Object {
  
  var abbrDayNames: js.Array[String] = js.native
  
  var abbrMonthNames: js.Array[String] = js.native
  
  var am: String = js.native
  
  var dayNames: js.Array[String] = js.native
  
  var ds: String = js.native
  
  var genMonthNames: js.Array[String] = js.native
  
  var longDate: String = js.native
  
  var longTime: String = js.native
  
  var monthDay: String = js.native
  
  var monthNames: js.Array[String] = js.native
  
  var pm: String = js.native
  
  var shortDate: String = js.native
  
  var shortTime: String = js.native
  
  var ts: String = js.native
  
  var twoDigitYearMax: Double = js.native
  
  var yearMonth: String = js.native
}
object IDateFormatterOptions {
  
  @scala.inline
  def apply(
    abbrDayNames: js.Array[String],
    abbrMonthNames: js.Array[String],
    am: String,
    dayNames: js.Array[String],
    ds: String,
    genMonthNames: js.Array[String],
    longDate: String,
    longTime: String,
    monthDay: String,
    monthNames: js.Array[String],
    pm: String,
    shortDate: String,
    shortTime: String,
    ts: String,
    twoDigitYearMax: Double,
    yearMonth: String
  ): IDateFormatterOptions = {
    val __obj = js.Dynamic.literal(abbrDayNames = abbrDayNames.asInstanceOf[js.Any], abbrMonthNames = abbrMonthNames.asInstanceOf[js.Any], am = am.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], ds = ds.asInstanceOf[js.Any], genMonthNames = genMonthNames.asInstanceOf[js.Any], longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], monthDay = monthDay.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any], yearMonth = yearMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateFormatterOptions]
  }
  
  @scala.inline
  implicit class IDateFormatterOptionsOps[Self <: IDateFormatterOptions] (val x: Self) extends AnyVal {
    
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
    def setAbbrDayNamesVarargs(value: String*): Self = this.set("abbrDayNames", js.Array(value :_*))
    
    @scala.inline
    def setAbbrDayNames(value: js.Array[String]): Self = this.set("abbrDayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbbrMonthNamesVarargs(value: String*): Self = this.set("abbrMonthNames", js.Array(value :_*))
    
    @scala.inline
    def setAbbrMonthNames(value: js.Array[String]): Self = this.set("abbrMonthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAm(value: String): Self = this.set("am", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayNamesVarargs(value: String*): Self = this.set("dayNames", js.Array(value :_*))
    
    @scala.inline
    def setDayNames(value: js.Array[String]): Self = this.set("dayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDs(value: String): Self = this.set("ds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenMonthNamesVarargs(value: String*): Self = this.set("genMonthNames", js.Array(value :_*))
    
    @scala.inline
    def setGenMonthNames(value: js.Array[String]): Self = this.set("genMonthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDate(value: String): Self = this.set("longDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongTime(value: String): Self = this.set("longTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthDay(value: String): Self = this.set("monthDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPm(value: String): Self = this.set("pm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDate(value: String): Self = this.set("shortDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortTime(value: String): Self = this.set("shortTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTs(value: String): Self = this.set("ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoDigitYearMax(value: Double): Self = this.set("twoDigitYearMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearMonth(value: String): Self = this.set("yearMonth", value.asInstanceOf[js.Any])
  }
}
