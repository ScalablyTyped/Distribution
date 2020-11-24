package typings.fundamentalReact.calendarMod

import typings.fundamentalReact.anon.NextMonth
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarBaseProps extends js.Object {
  
  var blockedDates: js.UndefOr[js.Array[Date]] = js.native
  
  var disableAfterDate: js.UndefOr[Date] = js.native
  
  var disableBeforeDate: js.UndefOr[Date] = js.native
  
  var disableFutureDates: js.UndefOr[Boolean] = js.native
  
  var disablePastDates: js.UndefOr[Boolean] = js.native
  
  var disableStyles: js.UndefOr[Boolean] = js.native
  
  var disableWeekday: js.UndefOr[js.Array[String]] = js.native
  
  var disableWeekends: js.UndefOr[Boolean] = js.native
  
  var disabledDates: js.UndefOr[js.Array[Date]] = js.native
  
  var localizedText: js.UndefOr[NextMonth] = js.native
}
object CalendarBaseProps {
  
  @scala.inline
  def apply(): CalendarBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarBaseProps]
  }
  
  @scala.inline
  implicit class CalendarBasePropsOps[Self <: CalendarBaseProps] (val x: Self) extends AnyVal {
    
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
    def setBlockedDatesVarargs(value: Date*): Self = this.set("blockedDates", js.Array(value :_*))
    
    @scala.inline
    def setBlockedDates(value: js.Array[Date]): Self = this.set("blockedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockedDates: Self = this.set("blockedDates", js.undefined)
    
    @scala.inline
    def setDisableAfterDate(value: Date): Self = this.set("disableAfterDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAfterDate: Self = this.set("disableAfterDate", js.undefined)
    
    @scala.inline
    def setDisableBeforeDate(value: Date): Self = this.set("disableBeforeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableBeforeDate: Self = this.set("disableBeforeDate", js.undefined)
    
    @scala.inline
    def setDisableFutureDates(value: Boolean): Self = this.set("disableFutureDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFutureDates: Self = this.set("disableFutureDates", js.undefined)
    
    @scala.inline
    def setDisablePastDates(value: Boolean): Self = this.set("disablePastDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePastDates: Self = this.set("disablePastDates", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    
    @scala.inline
    def setDisableWeekdayVarargs(value: String*): Self = this.set("disableWeekday", js.Array(value :_*))
    
    @scala.inline
    def setDisableWeekday(value: js.Array[String]): Self = this.set("disableWeekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableWeekday: Self = this.set("disableWeekday", js.undefined)
    
    @scala.inline
    def setDisableWeekends(value: Boolean): Self = this.set("disableWeekends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableWeekends: Self = this.set("disableWeekends", js.undefined)
    
    @scala.inline
    def setDisabledDatesVarargs(value: Date*): Self = this.set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDates(value: js.Array[Date]): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    
    @scala.inline
    def setLocalizedText(value: NextMonth): Self = this.set("localizedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizedText: Self = this.set("localizedText", js.undefined)
  }
}
