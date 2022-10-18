package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.libDateFormattingDateFormattingDottypesMod.ICalendarStrings
import typings.fluentuiDateTimeUtilities.libDateFormattingDateFormattingDottypesMod.IDateFormatting
import typings.fluentuiDateTimeUtilities.libDateFormattingDateFormattingDottypesMod.IDateGridStrings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateFormattingMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "DEFAULT_CALENDAR_STRINGS")
  @js.native
  val DEFAULT_CALENDAR_STRINGS: ICalendarStrings = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "DEFAULT_DATE_FORMATTING")
  @js.native
  val DEFAULT_DATE_FORMATTING: IDateFormatting = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "DEFAULT_DATE_GRID_STRINGS")
  @js.native
  val DEFAULT_DATE_GRID_STRINGS: IDateGridStrings = js.native
  
  inline def formatDay(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatMonth(date: js.Date, strings: IDateGridStrings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonth")(date.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatMonthDayYear(date: js.Date, strings: IDateGridStrings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthDayYear")(date.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatMonthYear(date: js.Date, strings: IDateGridStrings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthYear")(date.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatYear(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatYear")(date.asInstanceOf[js.Any]).asInstanceOf[String]
}
