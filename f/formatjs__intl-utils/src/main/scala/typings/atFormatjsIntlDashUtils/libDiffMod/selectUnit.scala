package typings.atFormatjsIntlDashUtils.libDiffMod

import typings.atFormatjsIntlDashUtils.Anon_UnitValue
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/lib/diff", "selectUnit")
@js.native
object selectUnit extends js.Object {
  def apply(from: Double): Anon_UnitValue = js.native
  def apply(from: Double, to: Double): Anon_UnitValue = js.native
  def apply(from: Double, to: Double, thresholds: Partial[Thresholds]): Anon_UnitValue = js.native
  def apply(from: Double, to: Date): Anon_UnitValue = js.native
  def apply(from: Double, to: Date, thresholds: Partial[Thresholds]): Anon_UnitValue = js.native
  def apply(from: Date): Anon_UnitValue = js.native
  def apply(from: Date, to: Double): Anon_UnitValue = js.native
  def apply(from: Date, to: Double, thresholds: Partial[Thresholds]): Anon_UnitValue = js.native
  def apply(from: Date, to: Date): Anon_UnitValue = js.native
  def apply(from: Date, to: Date, thresholds: Partial[Thresholds]): Anon_UnitValue = js.native
}

