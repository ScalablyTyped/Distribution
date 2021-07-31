package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.ICalendarStrings
import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateFormatting
import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateGridStrings
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFormattingMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "DEFAULT_CALENDAR_STRINGS")
  @js.native
  val DEFAULT_CALENDAR_STRINGS: ICalendarStrings = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "DEFAULT_DATE_FORMATTING")
  @js.native
  val DEFAULT_DATE_FORMATTING: IDateFormatting = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "DEFAULT_LOCALIZED_STRINGS")
  @js.native
  val DEFAULT_LOCALIZED_STRINGS: IDateGridStrings = js.native
  
  @scala.inline
  def formatDay(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def formatMonthDayYear(date: Date, strings: IDateGridStrings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthDayYear")(date.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatMonthYear(date: Date, strings: IDateGridStrings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthYear")(date.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatYear(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatYear")(date.asInstanceOf[js.Any]).asInstanceOf[String]
}
