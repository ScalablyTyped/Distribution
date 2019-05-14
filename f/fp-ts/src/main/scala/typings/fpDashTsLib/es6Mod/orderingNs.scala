package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "ordering")
@js.native
object orderingNs extends js.Object {
  val semigroupOrdering: fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6OrderingMod.Ordering] = js.native
  val setoidOrdering: fpDashTsLib.es6SetoidMod.Setoid[fpDashTsLib.es6OrderingMod.Ordering] = js.native
  def invert(O: fpDashTsLib.es6OrderingMod.Ordering): fpDashTsLib.es6OrderingMod.Ordering = js.native
  def sign(n: scala.Double): fpDashTsLib.es6OrderingMod.Ordering = js.native
}

