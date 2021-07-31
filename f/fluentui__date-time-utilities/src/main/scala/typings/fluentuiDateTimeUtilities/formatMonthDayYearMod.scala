package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateGridStrings
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMonthDayYearMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting/formatMonthDayYear", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatMonthDayYear(date: Date, strings: IDateGridStrings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthDayYear")(date.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
}
