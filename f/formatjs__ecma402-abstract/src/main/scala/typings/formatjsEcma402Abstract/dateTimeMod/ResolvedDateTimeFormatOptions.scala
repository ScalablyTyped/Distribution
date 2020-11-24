package typings.formatjsEcma402Abstract.dateTimeMod

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.full
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.medium
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedDateTimeFormatOptions
  extends typings.std.Intl.ResolvedDateTimeFormatOptions {
  
  var dateStyle: js.UndefOr[full | long | medium | short] = js.native
  
  var hourCycle: String = js.native
  
  var timeStyle: js.UndefOr[full | long | medium | short] = js.native
}
object ResolvedDateTimeFormatOptions {
  
  @scala.inline
  def apply(calendar: String, hourCycle: String, locale: String, numberingSystem: String, timeZone: String): ResolvedDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], hourCycle = hourCycle.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedDateTimeFormatOptions]
  }
  
  @scala.inline
  implicit class ResolvedDateTimeFormatOptionsOps[Self <: ResolvedDateTimeFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setHourCycle(value: String): Self = this.set("hourCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateStyle(value: full | long | medium | short): Self = this.set("dateStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateStyle: Self = this.set("dateStyle", js.undefined)
    
    @scala.inline
    def setTimeStyle(value: full | long | medium | short): Self = this.set("timeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStyle: Self = this.set("timeStyle", js.undefined)
  }
}
