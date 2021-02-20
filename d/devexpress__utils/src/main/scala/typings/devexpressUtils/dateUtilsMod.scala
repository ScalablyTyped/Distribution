package typings.devexpressUtils

import typings.devexpressUtils.anon.TwoDigitYearMax
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @JSImport("@devexpress/utils/lib/formatters/date-utils", "DateUtils.expandTwoDigitYear")
    @js.native
    def expandTwoDigitYear(value: Double, options: TwoDigitYearMax): Double = js.native
    
    @JSImport("@devexpress/utils/lib/formatters/date-utils", "DateUtils.fixTimezoneGap")
    @js.native
    def fixTimezoneGap(oldDate: Date, newDate: Date): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/formatters/date-utils", "DateUtils.getTimeZoneOffset")
    @js.native
    def getTimeZoneOffset: js.Any = js.native
    @scala.inline
    def getTimeZoneOffset_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTimeZoneOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/formatters/date-utils", "DateUtils.toUtcTime")
    @js.native
    def toUtcTime(date: Date): Date = js.native
  }
}
