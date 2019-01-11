package typings
package fpDashTsLib.libOrderingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Ordering", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val semigroupOrdering: fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libOrderingMod.Ordering] = js.native
  val setoidOrdering: fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libOrderingMod.Ordering] = js.native
  def invert(O: fpDashTsLib.libOrderingMod.Ordering): fpDashTsLib.libOrderingMod.Ordering = js.native
  def sign(n: scala.Double): fpDashTsLib.libOrderingMod.Ordering = js.native
}

