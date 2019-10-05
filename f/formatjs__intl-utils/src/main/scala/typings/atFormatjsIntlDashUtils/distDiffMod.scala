package typings.atFormatjsIntlDashUtils

import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.day
import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.hour
import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.minute
import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.second
import typings.atFormatjsIntlDashUtils.distDiffMod.Thresholds
import typings.std.Date
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/diff", JSImport.Namespace)
@js.native
object distDiffMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.second
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.minute
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.hour
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.day
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.week
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.month
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.quarter
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.year
  */
  trait Unit extends js.Object
  
  val DEFAULT_THRESHOLDS: Thresholds = js.native
  def selectUnit(from: Double): Anon_Unit = js.native
  def selectUnit(from: Double, to: Double): Anon_Unit = js.native
  def selectUnit(from: Double, to: Double, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def selectUnit(from: Double, to: Date): Anon_Unit = js.native
  def selectUnit(from: Double, to: Date, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def selectUnit(from: Date): Anon_Unit = js.native
  def selectUnit(from: Date, to: Double): Anon_Unit = js.native
  def selectUnit(from: Date, to: Double, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def selectUnit(from: Date, to: Date): Anon_Unit = js.native
  def selectUnit(from: Date, to: Date, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  type Thresholds = Record[second | minute | hour | day, Double]
}

