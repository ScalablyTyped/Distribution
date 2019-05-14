package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Random", JSImport.Namespace)
@js.native
object es6RandomMod extends js.Object {
  val random: fpDashTsLib.es6IOMod.IO[scala.Double] = js.native
  val randomBool: fpDashTsLib.es6IOMod.IO[scala.Boolean] = js.native
  def randomInt(low: scala.Double, high: scala.Double): fpDashTsLib.es6IOMod.IO[scala.Double] = js.native
  def randomRange(min: scala.Double, max: scala.Double): fpDashTsLib.es6IOMod.IO[scala.Double] = js.native
}

