package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Random", JSImport.Namespace)
@js.native
object libRandomMod extends js.Object {
  val random: fpDashTsLib.libIOMod.IO[scala.Double] = js.native
  val randomBool: fpDashTsLib.libIOMod.IO[scala.Boolean] = js.native
  def randomInt(low: scala.Double, high: scala.Double): fpDashTsLib.libIOMod.IO[scala.Double] = js.native
  def randomRange(min: scala.Double, max: scala.Double): fpDashTsLib.libIOMod.IO[scala.Double] = js.native
}

