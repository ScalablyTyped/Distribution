package typings.atFormatjsIntlDashUtils.distDiffMod

import typings.atFormatjsIntlDashUtils.Anon_Unit
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
}

