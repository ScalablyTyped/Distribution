package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "pair")
@js.native
object pairNs extends js.Object {
  @js.native
  class Pair[A] protected ()
    extends fpDashTsLib.libPairMod.Pair[A] {
    def this(fst: A, snd: A) = this()
  }
  
  val URI: /* Pair */ java.lang.String = js.native
  val getMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libPairMod.Pair[js.Any]]
  ] = js.native
  val getOrd: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    fpDashTsLib.libOrdMod.Ord[fpDashTsLib.libPairMod.Pair[js.Any]]
  ] = js.native
  val getSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libPairMod.Pair[js.Any]]
  ] = js.native
  val getSetoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libPairMod.Pair[js.Any]]
  ] = js.native
  val pair: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.libPairMod.URI] with fpDashTsLib.libFoldableMod.Foldable1[fpDashTsLib.libPairMod.URI] with fpDashTsLib.libTraversableMod.Traversable1[fpDashTsLib.libPairMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libPairMod.URI] = js.native
}

