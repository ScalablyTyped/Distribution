package typings.formatjsIntlUtils.diffMod

import typings.formatjsIntlUtils.AnonUnit
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/diff", "selectUnit")
@js.native
object selectUnit extends js.Object {
  def apply(from: Double): AnonUnit = js.native
  def apply(from: Double, to: Double): AnonUnit = js.native
  def apply(from: Double, to: Double, thresholds: Partial[Thresholds]): AnonUnit = js.native
  def apply(from: Double, to: Date): AnonUnit = js.native
  def apply(from: Double, to: Date, thresholds: Partial[Thresholds]): AnonUnit = js.native
  def apply(from: Date): AnonUnit = js.native
  def apply(from: Date, to: Double): AnonUnit = js.native
  def apply(from: Date, to: Double, thresholds: Partial[Thresholds]): AnonUnit = js.native
  def apply(from: Date, to: Date): AnonUnit = js.native
  def apply(from: Date, to: Date, thresholds: Partial[Thresholds]): AnonUnit = js.native
}

