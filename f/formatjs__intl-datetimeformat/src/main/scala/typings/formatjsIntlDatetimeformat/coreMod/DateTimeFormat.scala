package typings.formatjsIntlDatetimeformat.coreMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormat extends js.Object {
  def format(): String = js.native
  def format(x: Double): String = js.native
  def format(x: Date): String = js.native
  def formatToParts(): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(x: Double): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(x: Date): js.Array[DateTimeFormatPart] = js.native
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}

@JSImport("@formatjs/intl-datetimeformat/src/core", "DateTimeFormat")
@js.native
object DateTimeFormat extends TopLevel[DateTimeFormatConstructor]

