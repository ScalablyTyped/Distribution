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
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(compose, duplicate, extend, foldMap, map, mapLeft, reduce, reduceRight) */ def bimap[L, A, M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.libTupleMod.Tuple[L, A], fpDashTsLib.libTupleMod.Tuple[M, B]] = js.native
  def fst[L, A](fa: fpDashTsLib.libTupleMod.Tuple[L, A]): L = js.native
  def getApplicative[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getApply[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getChain[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getChainRec[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libChainRecMod.ChainRec2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getEq[L, A](EL: fpDashTsLib.libEqMod.Eq[L], EA: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libTupleMod.Tuple[L, A]] = js.native
  def getMonad[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getMonoid[L, A](ML: fpDashTsLib.libMonoidMod.Monoid[L], MA: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libTupleMod.Tuple[L, A]] = js.native
  def getOrd[L, A](OL: fpDashTsLib.libOrdMod.Ord[L], OA: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libOrdMod.Ord[fpDashTsLib.libTupleMod.Tuple[L, A]] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.libSemigroupMod.Semigroup[L], SA: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libTupleMod.Tuple[L, A]] = js.native
  def getSetoid[L, A](EL: fpDashTsLib.libEqMod.Eq[L], EA: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libTupleMod.Tuple[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.libShowMod.Show[L], SA: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[fpDashTsLib.libTupleMod.Tuple[L, A]] = js.native
  def snd[L, A](fa: fpDashTsLib.libTupleMod.Tuple[L, A]): A = js.native
  def swap[L, A](sa: fpDashTsLib.libTupleMod.Tuple[L, A]): fpDashTsLib.libTupleMod.Tuple[A, L] = js.native
}

