package typings
package fpDashTsLib.es6TupleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Tuple", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Tuple = js.native
  val tuple: fpDashTsLib.es6SemigroupoidMod.Semigroupoid2[URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[URI] with fpDashTsLib.es6ComonadMod.Comonad2[URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v2[URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v2[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(compose, duplicate, extend, foldMap, map, mapLeft, reduce, reduceRight) */ def bimap[L, A, M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Tuple[L, A], Tuple[M, B]] = js.native
  def fst[L, A](fa: Tuple[L, A]): L = js.native
  def getApplicative[L](M: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getApply[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6ApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getChain[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getChainRec[L](M: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6ChainRecMod.ChainRec2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getEq[L, A](EL: fpDashTsLib.es6EqMod.Eq[L], EA: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[Tuple[L, A]] = js.native
  def getMonad[L](M: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getMonoid[L, A](ML: fpDashTsLib.es6MonoidMod.Monoid[L], MA: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[Tuple[L, A]] = js.native
  def getOrd[L, A](OL: fpDashTsLib.es6OrdMod.Ord[L], OA: fpDashTsLib.es6OrdMod.Ord[A]): fpDashTsLib.es6OrdMod.Ord[Tuple[L, A]] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.es6SemigroupMod.Semigroup[L], SA: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[Tuple[L, A]] = js.native
  def getSetoid[L, A](EL: fpDashTsLib.es6EqMod.Eq[L], EA: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[Tuple[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.es6ShowMod.Show[L], SA: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[Tuple[L, A]] = js.native
  def snd[L, A](fa: Tuple[L, A]): A = js.native
  def swap[L, A](sa: Tuple[L, A]): Tuple[A, L] = js.native
}

