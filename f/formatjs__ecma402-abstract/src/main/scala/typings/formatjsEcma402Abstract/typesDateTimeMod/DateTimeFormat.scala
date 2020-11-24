package typings.formatjsEcma402Abstract.typesDateTimeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeFormat
  extends typings.std.Intl.DateTimeFormat {
  
  def formatRange(startDate: Double, endDate: Double): String = js.native
  def formatRange(startDate: Double, endDate: Date): String = js.native
  def formatRange(startDate: Date, endDate: Double): String = js.native
  def formatRange(startDate: Date, endDate: Date): String = js.native
  
  def formatRangeToParts(startDate: Double, endDate: Double): js.Array[IntlDateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: Double, endDate: Date): js.Array[IntlDateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: Date, endDate: Double): js.Array[IntlDateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: Date, endDate: Date): js.Array[IntlDateTimeFormatPart] = js.native
}
