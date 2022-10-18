package typings.devexpressUtils

import typings.devexpressUtils.anon.TwoDigitYearMax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormattersDateUtilsMod {
  
  @JSImport("@devexpress/utils/lib/formatters/date-utils", "DateUtils")
  @js.native
  open class DateUtils () extends StObject
  /* static members */
  object DateUtils {
    
    @JSImport("@devexpress/utils/lib/formatters/date-utils", "DateUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def expandTwoDigitYear(value: Double, options: TwoDigitYearMax): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("expandTwoDigitYear")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def fixTimezoneGap(oldDate: js.Date, newDate: js.Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixTimezoneGap")(oldDate.asInstanceOf[js.Any], newDate.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@devexpress/utils/lib/formatters/date-utils", "DateUtils.getTimeZoneOffset")
    @js.native
    def getTimeZoneOffset: Any = js.native
    inline def getTimeZoneOffset_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTimeZoneOffset")(x.asInstanceOf[js.Any])
    
    inline def toUtcTime(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtcTime")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  }
}
