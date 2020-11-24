package typings.formatjsEcma402Abstract.dateTimeFormatFormatDateTimePatternMod

import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatLocaleInternalData
import typings.formatjsEcma402Abstract.typesDateTimeMod.IntlDateTimeFormatInternal
import typings.std.Intl.DateTimeFormat
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatDateTimePatternImplDetails extends js.Object {
  
  def getDefaultTimeZone(): String = js.native
  
  def getInternalSlots(dtf: DateTimeFormat): IntlDateTimeFormatInternal = js.native
  
  var localeData: Record[String, DateTimeFormatLocaleInternalData] = js.native
}
object FormatDateTimePatternImplDetails {
  
  @scala.inline
  def apply(
    getDefaultTimeZone: () => String,
    getInternalSlots: DateTimeFormat => IntlDateTimeFormatInternal,
    localeData: Record[String, DateTimeFormatLocaleInternalData]
  ): FormatDateTimePatternImplDetails = {
    val __obj = js.Dynamic.literal(getDefaultTimeZone = js.Any.fromFunction0(getDefaultTimeZone), getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatDateTimePatternImplDetails]
  }
  
  @scala.inline
  implicit class FormatDateTimePatternImplDetailsOps[Self <: FormatDateTimePatternImplDetails] (val x: Self) extends AnyVal {
    
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
    def setGetDefaultTimeZone(value: () => String): Self = this.set("getDefaultTimeZone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInternalSlots(value: DateTimeFormat => IntlDateTimeFormatInternal): Self = this.set("getInternalSlots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocaleData(value: Record[String, DateTimeFormatLocaleInternalData]): Self = this.set("localeData", value.asInstanceOf[js.Any])
  }
}
