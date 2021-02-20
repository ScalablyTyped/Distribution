package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.ICalendarStrings
import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateFormatting
import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateGridStrings
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFormattingMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "DEFAULT_CALENDAR_STRINGS")
  @js.native
  val DEFAULT_CALENDAR_STRINGS: ICalendarStrings = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "DEFAULT_DATE_FORMATTING")
  @js.native
  val DEFAULT_DATE_FORMATTING: IDateFormatting = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "DEFAULT_LOCALIZED_STRINGS")
  @js.native
  val DEFAULT_LOCALIZED_STRINGS: IDateGridStrings = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "formatDay")
  @js.native
  def formatDay(date: Date): String = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "formatMonthDayYear")
  @js.native
  def formatMonthDayYear(date: Date, strings: IDateGridStrings): String = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "formatMonthYear")
  @js.native
  def formatMonthYear(date: Date, strings: IDateGridStrings): String = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "formatYear")
  @js.native
  def formatYear(date: Date): String = js.native
}
