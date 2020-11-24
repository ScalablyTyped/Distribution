package typings.fluentuiDateTimeUtilities.dateGridTypesMod

import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatepickerOptions extends IRestrictedDatesOptions {
  
  /**
    * The date range type indicating how  many days should be selected as the user
    * selects days
    */
  var dateRangeType: DateRangeType = js.native
  
  /**
    * The number of days to select while dateRangeType === DateRangeType.Day. Used in order to have multi-day
    * views.
    */
  var daysToSelectInDayView: js.UndefOr[Double] = js.native
  
  /**
    * The first day of the week for your locale.
    */
  var firstDayOfWeek: DayOfWeek = js.native
  
  /**
    * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
    * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
    */
  var firstWeekOfYear: FirstWeekOfYear = js.native
  
  /**
    * Which days in the generated grid should be marked.
    */
  var markedDays: js.UndefOr[js.Array[Date]] = js.native
  
  /**
    * Whether the calendar should show the week number (weeks 1 to 53) before each week row
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Value of today. If null, current time in client machine will be used.
    */
  var today: js.UndefOr[Date] = js.native
  
  /**
    * The days that are selectable when `dateRangeType` is WorkWeek.
    * If `dateRangeType` is not WorkWeek this property does nothing.
    */
  var workWeekDays: js.UndefOr[js.Array[DayOfWeek]] = js.native
}
object IDatepickerOptions {
  
  @scala.inline
  def apply(dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): IDatepickerOptions = {
    val __obj = js.Dynamic.literal(dateRangeType = dateRangeType.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear = firstWeekOfYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatepickerOptions]
  }
  
  @scala.inline
  implicit class IDatepickerOptionsOps[Self <: IDatepickerOptions] (val x: Self) extends AnyVal {
    
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
    def setDateRangeType(value: DateRangeType): Self = this.set("dateRangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayOfWeek(value: DayOfWeek): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstWeekOfYear(value: FirstWeekOfYear): Self = this.set("firstWeekOfYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysToSelectInDayView(value: Double): Self = this.set("daysToSelectInDayView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysToSelectInDayView: Self = this.set("daysToSelectInDayView", js.undefined)
    
    @scala.inline
    def setMarkedDaysVarargs(value: Date*): Self = this.set("markedDays", js.Array(value :_*))
    
    @scala.inline
    def setMarkedDays(value: js.Array[Date]): Self = this.set("markedDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkedDays: Self = this.set("markedDays", js.undefined)
    
    @scala.inline
    def setShowWeekNumbers(value: Boolean): Self = this.set("showWeekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWeekNumbers: Self = this.set("showWeekNumbers", js.undefined)
    
    @scala.inline
    def setToday(value: Date): Self = this.set("today", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
    
    @scala.inline
    def setWorkWeekDaysVarargs(value: DayOfWeek*): Self = this.set("workWeekDays", js.Array(value :_*))
    
    @scala.inline
    def setWorkWeekDays(value: js.Array[DayOfWeek]): Self = this.set("workWeekDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkWeekDays: Self = this.set("workWeekDays", js.undefined)
  }
}
