package typings
package fpDashTsLib.libOrderingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Ordering", JSImport.Namespace)
@js.native
object libOrderingModMembers extends js.Object {
  val invert: js.Function1[/* O */ Ordering, Ordering] = js.native
  val semigroupOrdering: fpDashTsLib.libSemigroupMod.Semigroup[Ordering] = js.native
  val setoidOrdering: fpDashTsLib.libSetoidMod.Setoid[Ordering] = js.native
  val sign: js.Function1[/* n */ scala.Double, Ordering] = js.native
}

