package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateGridGetDateRangeTypeToUseMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateGrid/getDateRangeTypeToUse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.Array[DayOfWeek], firstDayOfWeek: DayOfWeek): DateRangeType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeTypeToUse")(dateRangeType.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[DateRangeType]
  inline def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: Unit, firstDayOfWeek: DayOfWeek): DateRangeType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeTypeToUse")(dateRangeType.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[DateRangeType]
}
