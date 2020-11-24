package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IAvailableDateOptions
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IDay
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IDayGridOptions
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IRestrictedDatesOptions
import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluentui/date-time-utilities/lib/dateGrid", JSImport.Namespace)
@js.native
object dateGridMod extends js.Object {
  
  def findAvailableDate(options: IAvailableDateOptions): js.UndefOr[Date] = js.native
  
  def getBoundedDateRange(dateRange: js.Array[Date]): js.Array[Date] = js.native
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: js.UndefOr[scala.Nothing], maxDate: Date): js.Array[Date] = js.native
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: Date): js.Array[Date] = js.native
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: Date, maxDate: Date): js.Array[Date] = js.native
  
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.UndefOr[scala.Nothing], firstDayOfWeek: DayOfWeek): DateRangeType = js.native
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.Array[DayOfWeek], firstDayOfWeek: DayOfWeek): DateRangeType = js.native
  
  def getDayGrid(options: IDayGridOptions): js.Array[js.Array[IDay]] = js.native
  
  def isAfterMaxDate(date: Date, options: IRestrictedDatesOptions): Boolean = js.native
  
  def isBeforeMinDate(date: Date, options: IRestrictedDatesOptions): Boolean = js.native
  
  def isContiguous(days: js.Array[DayOfWeek], isSingleWeek: Boolean, firstDayOfWeek: DayOfWeek): Boolean = js.native
  
  def isRestrictedDate(date: Date, options: IRestrictedDatesOptions): Boolean = js.native
}
