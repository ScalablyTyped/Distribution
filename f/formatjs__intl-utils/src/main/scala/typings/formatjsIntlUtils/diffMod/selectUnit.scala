package typings.formatjsIntlUtils.diffMod

import typings.formatjsIntlUtils.anon.PartialThresholds
import typings.formatjsIntlUtils.anon.UnitUnit
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/lib/src/diff", "selectUnit")
@js.native
object selectUnit extends js.Object {
  def apply(from: Double): UnitUnit = js.native
  def apply(from: Double, to: js.UndefOr[scala.Nothing], thresholds: PartialThresholds): UnitUnit = js.native
  def apply(from: Double, to: Double): UnitUnit = js.native
  def apply(from: Double, to: Double, thresholds: PartialThresholds): UnitUnit = js.native
  def apply(from: Double, to: Date): UnitUnit = js.native
  def apply(from: Double, to: Date, thresholds: PartialThresholds): UnitUnit = js.native
  def apply(from: Date): UnitUnit = js.native
  def apply(from: Date, to: js.UndefOr[scala.Nothing], thresholds: PartialThresholds): UnitUnit = js.native
  def apply(from: Date, to: Double): UnitUnit = js.native
  def apply(from: Date, to: Double, thresholds: PartialThresholds): UnitUnit = js.native
  def apply(from: Date, to: Date): UnitUnit = js.native
  def apply(from: Date, to: Date, thresholds: PartialThresholds): UnitUnit = js.native
}

