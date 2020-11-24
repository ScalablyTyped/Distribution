package typings.fecha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fecha.fecha.I18nSettings> */
@js.native
trait I18nSettingsOptional extends js.Object {
  
  var DoFn: js.UndefOr[js.Function1[/* dayOfMonth */ Double, String]] = js.native
  
  var amPm: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  var dayNames: js.UndefOr[Days] = js.native
  
  var dayNamesShort: js.UndefOr[Days] = js.native
  
  var monthNames: js.UndefOr[Months] = js.native
  
  var monthNamesShort: js.UndefOr[Months] = js.native
}
object I18nSettingsOptional {
  
  @scala.inline
  def apply(): I18nSettingsOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nSettingsOptional]
  }
  
  @scala.inline
  implicit class I18nSettingsOptionalOps[Self <: I18nSettingsOptional] (val x: Self) extends AnyVal {
    
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
    def setDoFn(value: /* dayOfMonth */ Double => String): Self = this.set("DoFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoFn: Self = this.set("DoFn", js.undefined)
    
    @scala.inline
    def setAmPm(value: js.Tuple2[String, String]): Self = this.set("amPm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmPm: Self = this.set("amPm", js.undefined)
    
    @scala.inline
    def setDayNames(value: Days): Self = this.set("dayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayNames: Self = this.set("dayNames", js.undefined)
    
    @scala.inline
    def setDayNamesShort(value: Days): Self = this.set("dayNamesShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayNamesShort: Self = this.set("dayNamesShort", js.undefined)
    
    @scala.inline
    def setMonthNames(value: Months): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthNames: Self = this.set("monthNames", js.undefined)
    
    @scala.inline
    def setMonthNamesShort(value: Months): Self = this.set("monthNamesShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthNamesShort: Self = this.set("monthNamesShort", js.undefined)
  }
}
