package typings.fluentuiDateTimeUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeMathMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/timeMath/timeMath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMinutes(date: js.Date, minutes: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMinutes")(date.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def ceilMinuteToIncrement(date: js.Date, increments: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("ceilMinuteToIncrement")(date.asInstanceOf[js.Any], increments.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getDateFromTimeSelection(useHour12: Boolean, baseDate: js.Date, selectedTime: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateFromTimeSelection")(useHour12.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], selectedTime.asInstanceOf[js.Any])).asInstanceOf[js.Date]
}
