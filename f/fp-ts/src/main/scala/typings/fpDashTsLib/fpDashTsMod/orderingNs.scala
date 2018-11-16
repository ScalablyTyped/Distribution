package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "ordering")
@js.native
object orderingNs extends js.Object {
  val invert: js.Function1[/* O */ fpDashTsLib.libOrderingMod.Ordering, fpDashTsLib.libOrderingMod.Ordering] = js.native
  val semigroupOrdering: fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libOrderingMod.Ordering] = js.native
  val setoidOrdering: fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libOrderingMod.Ordering] = js.native
  val sign: js.Function1[/* n */ scala.Double, fpDashTsLib.libOrderingMod.Ordering] = js.native
}

