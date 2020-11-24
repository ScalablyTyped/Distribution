package typings.formatjsEcma402Abstract.typesDateTimeMod

import typings.formatjsEcma402Abstract.anon.FullLong
import typings.formatjsEcma402Abstract.anon.LongEraData
import typings.formatjsEcma402Abstract.anon.Medium
import typings.formatjsEcma402Abstract.anon.Narrow
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeFormatLocaleInternalData extends js.Object {
  
  var am: String = js.native
  
  var ca: js.Array[String] = js.native
  
  var dateFormat: FullLong = js.native
  
  var dateTimeFormat: Medium = js.native
  
  var era: LongEraData = js.native
  
  var formats: Record[String, js.Array[Formats]] = js.native
  
  /**
    * So we can construct GMT+08:00
    */
  var gmtFormat: String = js.native
  
  var hc: js.Array[String] = js.native
  
  var hourCycle: String = js.native
  
  /**
    * So we can construct GMT+08:00
    */
  var hourFormat: String = js.native
  
  var month: Narrow = js.native
  
  var nu: js.Array[String] = js.native
  
  var pm: String = js.native
  
  var timeFormat: FullLong = js.native
  
  var timeZoneName: TimeZoneNameData = js.native
  
  var weekday: Narrow = js.native
}
object DateTimeFormatLocaleInternalData {
  
  @scala.inline
  def apply(
    am: String,
    ca: js.Array[String],
    dateFormat: FullLong,
    dateTimeFormat: Medium,
    era: LongEraData,
    formats: Record[String, js.Array[Formats]],
    gmtFormat: String,
    hc: js.Array[String],
    hourCycle: String,
    hourFormat: String,
    month: Narrow,
    nu: js.Array[String],
    pm: String,
    timeFormat: FullLong,
    timeZoneName: TimeZoneNameData,
    weekday: Narrow
  ): DateTimeFormatLocaleInternalData = {
    val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], ca = ca.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], era = era.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], gmtFormat = gmtFormat.asInstanceOf[js.Any], hc = hc.asInstanceOf[js.Any], hourCycle = hourCycle.asInstanceOf[js.Any], hourFormat = hourFormat.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], timeFormat = timeFormat.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeFormatLocaleInternalData]
  }
  
  @scala.inline
  implicit class DateTimeFormatLocaleInternalDataOps[Self <: DateTimeFormatLocaleInternalData] (val x: Self) extends AnyVal {
    
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
    def setAm(value: String): Self = this.set("am", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaVarargs(value: String*): Self = this.set("ca", js.Array(value :_*))
    
    @scala.inline
    def setCa(value: js.Array[String]): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormat(value: FullLong): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeFormat(value: Medium): Self = this.set("dateTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEra(value: LongEraData): Self = this.set("era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormats(value: Record[String, js.Array[Formats]]): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmtFormat(value: String): Self = this.set("gmtFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHcVarargs(value: String*): Self = this.set("hc", js.Array(value :_*))
    
    @scala.inline
    def setHc(value: js.Array[String]): Self = this.set("hc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourCycle(value: String): Self = this.set("hourCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourFormat(value: String): Self = this.set("hourFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Narrow): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNuVarargs(value: String*): Self = this.set("nu", js.Array(value :_*))
    
    @scala.inline
    def setNu(value: js.Array[String]): Self = this.set("nu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPm(value: String): Self = this.set("pm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFormat(value: FullLong): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneName(value: TimeZoneNameData): Self = this.set("timeZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekday(value: Narrow): Self = this.set("weekday", value.asInstanceOf[js.Any])
  }
}
