package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateGridStrings
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fluentui/date-time-utilities/lib/dateFormatting", JSImport.Namespace)
@js.native
object dateFormattingMod extends js.Object {
  def formatDay(date: Date): String = js.native
  def formatMonthDayYear(date: Date, strings: IDateGridStrings): String = js.native
  def formatMonthYear(date: Date, strings: IDateGridStrings): String = js.native
  def formatYear(date: Date): String = js.native
}

