package typings
package fpDashTsLib.es6OrderingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Ordering", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val semigroupOrdering: fpDashTsLib.es6SemigroupMod.Semigroup[Ordering] = js.native
  val setoidOrdering: fpDashTsLib.es6SetoidMod.Setoid[Ordering] = js.native
  def invert(O: Ordering): Ordering = js.native
  def sign(n: scala.Double): Ordering = js.native
}

