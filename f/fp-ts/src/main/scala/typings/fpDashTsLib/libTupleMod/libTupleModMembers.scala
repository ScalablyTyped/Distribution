package typings
package fpDashTsLib.libTupleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Tuple", JSImport.Namespace)
@js.native
object libTupleModMembers extends js.Object {
  val URI: /* Tuple */ java.lang.String = js.native
  val getApplicative: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, js.Any]
  ] = js.native
  val getApply: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Tuple, js.Any]
  ] = js.native
  val getChain: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Tuple, js.Any]
  ] = js.native
  val getChainRec: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libChainRecMod.ChainRec2C[fpDashTsLib.fpDashTsLibStrings.Tuple, js.Any]
  ] = js.native
  val getMonad: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, js.Any]
  ] = js.native
  val getMonoid: js.Function2[
    /* ML */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    /* MA */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[Tuple[js.Any, js.Any]]
  ] = js.native
  val getOrd: js.Function2[
    /* OL */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    /* OA */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    fpDashTsLib.libOrdMod.Ord[Tuple[js.Any, js.Any]]
  ] = js.native
  val getSemigroup: js.Function2[
    /* SL */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    /* SA */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[Tuple[js.Any, js.Any]]
  ] = js.native
  val getSetoid: js.Function2[
    /* SA */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    /* SB */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[Tuple[js.Any, js.Any]]
  ] = js.native
  val tuple: fpDashTsLib.libSemigroupoidMod.Semigroupoid2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libComonadMod.Comonad2[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[URI] = js.native
}

