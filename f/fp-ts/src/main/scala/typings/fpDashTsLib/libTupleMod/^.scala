package typings
package fpDashTsLib.libTupleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Tuple", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Tuple = js.native
  val tuple: fpDashTsLib.libSemigroupoidMod.Semigroupoid2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libComonadMod.Comonad2[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(compose, duplicate, extend, foldMap, map, mapLeft, reduce, reduceRight) */ def bimap[L, A, M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Tuple[L, A], Tuple[M, B]] = js.native
  def fst[L, A](fa: Tuple[L, A]): L = js.native
  def getApplicative[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getApply[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getChain[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getChainRec[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libChainRecMod.ChainRec2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getEq[L, A](EL: fpDashTsLib.libEqMod.Eq[L], EA: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[Tuple[L, A]] = js.native
  def getMonad[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getMonoid[L, A](ML: fpDashTsLib.libMonoidMod.Monoid[L], MA: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[Tuple[L, A]] = js.native
  def getOrd[L, A](OL: fpDashTsLib.libOrdMod.Ord[L], OA: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libOrdMod.Ord[Tuple[L, A]] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.libSemigroupMod.Semigroup[L], SA: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[Tuple[L, A]] = js.native
  def getSetoid[L, A](EL: fpDashTsLib.libEqMod.Eq[L], EA: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[Tuple[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.libShowMod.Show[L], SA: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[Tuple[L, A]] = js.native
  def snd[L, A](fa: Tuple[L, A]): A = js.native
  def swap[L, A](sa: Tuple[L, A]): Tuple[A, L] = js.native
}

