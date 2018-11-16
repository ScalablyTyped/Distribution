package typings
package fpDashTsLib.libPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Pair", JSImport.Namespace)
@js.native
object libPairModMembers extends js.Object {
  val URI: /* Pair */ java.lang.String = js.native
  val getMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[Pair[js.Any]]
  ] = js.native
  val getOrd: js.Function1[/* O */ fpDashTsLib.libOrdMod.Ord[js.Any], fpDashTsLib.libOrdMod.Ord[Pair[js.Any]]] = js.native
  val getSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[Pair[js.Any]]
  ] = js.native
  val getSetoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[Pair[js.Any]]
  ] = js.native
  val pair: fpDashTsLib.libApplicativeMod.Applicative1[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[URI] with fpDashTsLib.libComonadMod.Comonad1[URI] = js.native
}

