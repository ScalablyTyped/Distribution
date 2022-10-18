package typings.fluentuiDateTimeUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateGridGetBoundedDateRangeMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateGrid/getBoundedDateRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBoundedDateRange(dateRange: js.Array[js.Date]): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  inline def getBoundedDateRange(dateRange: js.Array[js.Date], minDate: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getBoundedDateRange(dateRange: js.Array[js.Date], minDate: js.Date, maxDate: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getBoundedDateRange(dateRange: js.Array[js.Date], minDate: Unit, maxDate: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
}
