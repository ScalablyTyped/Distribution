package typings
package fpDashTsLib.libOrderingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Ordering", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val eqOrdering: fpDashTsLib.libEqMod.Eq[Ordering] = js.native
  val semigroupOrdering: fpDashTsLib.libSemigroupMod.Semigroup[Ordering] = js.native
  val setoidOrdering: fpDashTsLib.libEqMod.Eq[Ordering] = js.native
  def invert(O: Ordering): Ordering = js.native
  def sign(n: scala.Double): Ordering = js.native
}

