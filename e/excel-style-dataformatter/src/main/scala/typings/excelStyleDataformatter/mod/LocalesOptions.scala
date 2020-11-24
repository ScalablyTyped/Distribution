package typings.excelStyleDataformatter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalesOptions extends js.Object {
  
  var days: js.Array[String] = js.native
  
  var daysShort: js.Array[String] = js.native
  
  var decimalSeparator: String = js.native
  
  var formats: StringDictionary[String] = js.native
  
  var months: js.Array[String] = js.native
  
  var monthsShort: js.Array[String] = js.native
  
  var name: String = js.native
  
  var thousandSeparator: String = js.native
}
object LocalesOptions {
  
  @scala.inline
  def apply(
    days: js.Array[String],
    daysShort: js.Array[String],
    decimalSeparator: String,
    formats: StringDictionary[String],
    months: js.Array[String],
    monthsShort: js.Array[String],
    name: String,
    thousandSeparator: String
  ): LocalesOptions = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], daysShort = daysShort.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thousandSeparator = thousandSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalesOptions]
  }
  
  @scala.inline
  implicit class LocalesOptionsOps[Self <: LocalesOptions] (val x: Self) extends AnyVal {
    
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
    def setDaysVarargs(value: String*): Self = this.set("days", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: js.Array[String]): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysShortVarargs(value: String*): Self = this.set("daysShort", js.Array(value :_*))
    
    @scala.inline
    def setDaysShort(value: js.Array[String]): Self = this.set("daysShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormats(value: StringDictionary[String]): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsShortVarargs(value: String*): Self = this.set("monthsShort", js.Array(value :_*))
    
    @scala.inline
    def setMonthsShort(value: js.Array[String]): Self = this.set("monthsShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandSeparator(value: String): Self = this.set("thousandSeparator", value.asInstanceOf[js.Any])
  }
}
