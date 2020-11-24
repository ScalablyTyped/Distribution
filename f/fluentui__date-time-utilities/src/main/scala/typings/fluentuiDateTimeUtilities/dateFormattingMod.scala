package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.ICalendarStrings
import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateFormatting
import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateGridStrings
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluentui/date-time-utilities/lib/dateFormatting", JSImport.Namespace)
@js.native
object dateFormattingMod extends js.Object {
  
  val DEFAULT_CALENDAR_STRINGS: ICalendarStrings = js.native
  
  val DEFAULT_DATE_FORMATTING: IDateFormatting = js.native
  
  val DEFAULT_LOCALIZED_STRINGS: IDateGridStrings = js.native
  
  def formatDay(date: Date): String = js.native
  
  def formatMonthDayYear(date: Date, strings: IDateGridStrings): String = js.native
  
  def formatMonthYear(date: Date, strings: IDateGridStrings): String = js.native
  
  def formatYear(date: Date): String = js.native
}
