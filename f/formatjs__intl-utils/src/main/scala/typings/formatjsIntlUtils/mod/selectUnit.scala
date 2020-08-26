package typings.formatjsIntlUtils.mod

import typings.formatjsIntlUtils.anon.PartialThresholds
import typings.formatjsIntlUtils.anon.UnitValue
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils", "selectUnit")
@js.native
object selectUnit extends js.Object {
  def apply(from: Double): UnitValue = js.native
  def apply(from: Double, to: js.UndefOr[scala.Nothing], thresholds: PartialThresholds): UnitValue = js.native
  def apply(from: Double, to: Double): UnitValue = js.native
  def apply(from: Double, to: Double, thresholds: PartialThresholds): UnitValue = js.native
  def apply(from: Double, to: Date): UnitValue = js.native
  def apply(from: Double, to: Date, thresholds: PartialThresholds): UnitValue = js.native
  def apply(from: Date): UnitValue = js.native
  def apply(from: Date, to: js.UndefOr[scala.Nothing], thresholds: PartialThresholds): UnitValue = js.native
  def apply(from: Date, to: Double): UnitValue = js.native
  def apply(from: Date, to: Double, thresholds: PartialThresholds): UnitValue = js.native
  def apply(from: Date, to: Date): UnitValue = js.native
  def apply(from: Date, to: Date, thresholds: PartialThresholds): UnitValue = js.native
}

