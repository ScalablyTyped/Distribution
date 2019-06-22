package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "ordering")
@js.native
object orderingNs extends js.Object {
  val eqOrdering: fpDashTsLib.libEqMod.Eq[fpDashTsLib.libOrderingMod.Ordering] = js.native
  val semigroupOrdering: fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libOrderingMod.Ordering] = js.native
  val setoidOrdering: fpDashTsLib.libEqMod.Eq[fpDashTsLib.libOrderingMod.Ordering] = js.native
  def invert(O: fpDashTsLib.libOrderingMod.Ordering): fpDashTsLib.libOrderingMod.Ordering = js.native
  def sign(n: scala.Double): fpDashTsLib.libOrderingMod.Ordering = js.native
}

