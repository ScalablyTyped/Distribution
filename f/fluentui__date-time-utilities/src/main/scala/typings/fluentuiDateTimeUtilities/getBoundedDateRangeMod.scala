package typings.fluentuiDateTimeUtilities

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBoundedDateRangeMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateGrid/getBoundedDateRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBoundedDateRange(dateRange: js.Array[Date]): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  inline def getBoundedDateRange(dateRange: js.Array[Date], minDate: Unit, maxDate: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def getBoundedDateRange(dateRange: js.Array[Date], minDate: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  inline def getBoundedDateRange(dateRange: js.Array[Date], minDate: Date, maxDate: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
}
