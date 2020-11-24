package typings.fundamentalReact.calendarMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.NextMonth
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  monthListProps :{[x: string] : any} | undefined,   tableBodyProps :{[x: string] : any} | undefined,   tableHeaderProps :{[x: string] : any} | undefined,   tableProps :{[x: string] : any} | undefined,   yearListProps :{[x: string] : any} | undefined,   onChange :(date : std.Date): void | undefined, [x: string] : any} & fundamental-react.fundamental-react/lib/Calendar/Calendar.CalendarBaseProps */
@js.native
trait CalendarProps
  extends /* x */ StringDictionary[js.Any] {
  
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
  
  var monthListProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
  
  var tableBodyProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var tableHeaderProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var tableProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var yearListProps: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object CalendarProps {
  
  @scala.inline
  def apply(): CalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarProps]
  }
  
  @scala.inline
  implicit class CalendarPropsOps[Self <: CalendarProps] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setMonthListProps(value: StringDictionary[js.Any]): Self = this.set("monthListProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthListProps: Self = this.set("monthListProps", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* date */ Date => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setTableBodyProps(value: StringDictionary[js.Any]): Self = this.set("tableBodyProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyProps: Self = this.set("tableBodyProps", js.undefined)
    
    @scala.inline
    def setTableHeaderProps(value: StringDictionary[js.Any]): Self = this.set("tableHeaderProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeaderProps: Self = this.set("tableHeaderProps", js.undefined)
    
    @scala.inline
    def setTableProps(value: StringDictionary[js.Any]): Self = this.set("tableProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableProps: Self = this.set("tableProps", js.undefined)
    
    @scala.inline
    def setYearListProps(value: StringDictionary[js.Any]): Self = this.set("yearListProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearListProps: Self = this.set("yearListProps", js.undefined)
  }
}
