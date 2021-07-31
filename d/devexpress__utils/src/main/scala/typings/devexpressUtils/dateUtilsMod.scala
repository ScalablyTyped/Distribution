package typings.devexpressUtils

import typings.devexpressUtils.anon.TwoDigitYearMax
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateUtilsMod {
  
  @JSImport("@devexpress/utils/lib/formatters/date-utils", "DateUtils")
  @js.native
  class DateUtils () extends StObject
  /* static members */
  object DateUtils {
    
    @JSImport("@devexpress/utils/lib/formatters/date-utils", "DateUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def expandTwoDigitYear(value: Double, options: TwoDigitYearMax): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("expandTwoDigitYear")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def fixTimezoneGap(oldDate: Date, newDate: Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixTimezoneGap")(oldDate.asInstanceOf[js.Any], newDate.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@devexpress/utils/lib/formatters/date-utils", "DateUtils.getTimeZoneOffset")
    @js.native
    def getTimeZoneOffset: js.Any = js.native
    @scala.inline
    def getTimeZoneOffset_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTimeZoneOffset")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def toUtcTime(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtcTime")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  }
}
