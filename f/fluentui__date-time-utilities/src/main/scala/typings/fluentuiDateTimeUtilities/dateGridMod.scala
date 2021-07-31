package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IAvailableDateOptions
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IDay
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IDayGridOptions
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IRestrictedDatesOptions
import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateGridMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateGrid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findAvailableDate(options: IAvailableDateOptions): js.UndefOr[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAvailableDate")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Date]]
  
  @scala.inline
  def getBoundedDateRange(dateRange: js.Array[Date]): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  @scala.inline
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: Unit, maxDate: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  @scala.inline
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  @scala.inline
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: Date, maxDate: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.Array[DayOfWeek], firstDayOfWeek: DayOfWeek): DateRangeType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeTypeToUse")(dateRangeType.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[DateRangeType]
  @scala.inline
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: Unit, firstDayOfWeek: DayOfWeek): DateRangeType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeTypeToUse")(dateRangeType.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[DateRangeType]
  
  @scala.inline
  def getDayGrid(options: IDayGridOptions): js.Array[js.Array[IDay]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayGrid")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[IDay]]]
  
  @scala.inline
  def isAfterMaxDate(date: Date, options: IRestrictedDatesOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfterMaxDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isBeforeMinDate(date: Date, options: IRestrictedDatesOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBeforeMinDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isContiguous(days: js.Array[DayOfWeek], isSingleWeek: Boolean, firstDayOfWeek: DayOfWeek): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContiguous")(days.asInstanceOf[js.Any], isSingleWeek.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isRestrictedDate(date: Date, options: IRestrictedDatesOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRestrictedDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
