package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "random")
@js.native
object randomNs extends js.Object {
  val random: fpDashTsLib.libIOMod.IO[scala.Double] = js.native
  val randomBool: fpDashTsLib.libIOMod.IO[scala.Boolean] = js.native
  def randomInt(low: scala.Double, high: scala.Double): fpDashTsLib.libIOMod.IO[scala.Double] = js.native
  def randomRange(min: scala.Double, max: scala.Double): fpDashTsLib.libIOMod.IO[scala.Double] = js.native
}

