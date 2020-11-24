package typings.formatjsEcma402Abstract.typesDateTimeMod

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.buddhist
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.chinese
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.coptic
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ethiopia
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ethiopic
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.full
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.gregory
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.h11
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.h12
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.h23
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.h24
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hebrew
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.indian
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.islamic
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.iso8601
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.japanese
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.medium
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.persian
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.roc
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeFormatOptions
  extends typings.std.Intl.DateTimeFormatOptions {
  
  var calendar: js.UndefOr[
    buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
  ] = js.native
  
  var dateStyle: js.UndefOr[full | long | medium | short] = js.native
  
  var fractionalSecondDigits: js.UndefOr[Double] = js.native
  
  var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.native
  
  var numberingSystem: js.UndefOr[String] = js.native
  
  var timeStyle: js.UndefOr[full | long | medium | short] = js.native
}
object DateTimeFormatOptions {
  
  @scala.inline
  def apply(): DateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeFormatOptions]
  }
  
  @scala.inline
  implicit class DateTimeFormatOptionsOps[Self <: DateTimeFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setCalendar(
      value: buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
    ): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    
    @scala.inline
    def setDateStyle(value: full | long | medium | short): Self = this.set("dateStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateStyle: Self = this.set("dateStyle", js.undefined)
    
    @scala.inline
    def setFractionalSecondDigits(value: Double): Self = this.set("fractionalSecondDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFractionalSecondDigits: Self = this.set("fractionalSecondDigits", js.undefined)
    
    @scala.inline
    def setHourCycle(value: h11 | h12 | h23 | h24): Self = this.set("hourCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourCycle: Self = this.set("hourCycle", js.undefined)
    
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberingSystem: Self = this.set("numberingSystem", js.undefined)
    
    @scala.inline
    def setTimeStyle(value: full | long | medium | short): Self = this.set("timeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStyle: Self = this.set("timeStyle", js.undefined)
  }
}
