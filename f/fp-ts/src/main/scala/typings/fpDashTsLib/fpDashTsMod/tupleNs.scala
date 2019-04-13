package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "tuple")
@js.native
object tupleNs extends js.Object {
  @js.native
  class Tuple[L, A] protected ()
    extends fpDashTsLib.libTupleMod.Tuple[L, A] {
    def this(fst: L, snd: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Tuple = js.native
  val tuple: fpDashTsLib.libSemigroupoidMod.Semigroupoid2[fpDashTsLib.libTupleMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libTupleMod.URI] with fpDashTsLib.libComonadMod.Comonad2[fpDashTsLib.libTupleMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[fpDashTsLib.libTupleMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[fpDashTsLib.libTupleMod.URI] = js.native
  def getApplicative[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getApply[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getChain[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getChainRec[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libChainRecMod.ChainRec2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getMonad[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getMonoid[L, A](ML: fpDashTsLib.libMonoidMod.Monoid[L], MA: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libTupleMod.Tuple[L, A]] = js.native
  def getOrd[L, A](OL: fpDashTsLib.libOrdMod.Ord[L], OA: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libOrdMod.Ord[fpDashTsLib.libTupleMod.Tuple[L, A]] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.libSemigroupMod.Semigroup[L], SA: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libTupleMod.Tuple[L, A]] = js.native
  def getSetoid[L, A](SA: fpDashTsLib.libSetoidMod.Setoid[L], SB: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libTupleMod.Tuple[L, A]] = js.native
}

