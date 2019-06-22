package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "tuple")
@js.native
object tupleNs extends js.Object {
  @js.native
  class Tuple[L, A] protected ()
    extends fpDashTsLib.es6TupleMod.Tuple[L, A] {
    def this(fst: L, snd: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Tuple = js.native
  val tuple: fpDashTsLib.es6SemigroupoidMod.Semigroupoid2[fpDashTsLib.es6TupleMod.URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[fpDashTsLib.es6TupleMod.URI] with fpDashTsLib.es6ComonadMod.Comonad2[fpDashTsLib.es6TupleMod.URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v2[fpDashTsLib.es6TupleMod.URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v2[fpDashTsLib.es6TupleMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(compose, duplicate, extend, foldMap, map, mapLeft, reduce, reduceRight) */ def bimap[L, A, M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.es6TupleMod.Tuple[L, A], fpDashTsLib.es6TupleMod.Tuple[M, B]] = js.native
  def fst[L, A](fa: fpDashTsLib.es6TupleMod.Tuple[L, A]): L = js.native
  def getApplicative[L](M: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getApply[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6ApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getChain[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getChainRec[L](M: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6ChainRecMod.ChainRec2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getEq[L, A](EL: fpDashTsLib.es6EqMod.Eq[L], EA: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[fpDashTsLib.es6TupleMod.Tuple[L, A]] = js.native
  def getMonad[L](M: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getMonoid[L, A](ML: fpDashTsLib.es6MonoidMod.Monoid[L], MA: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6TupleMod.Tuple[L, A]] = js.native
  def getOrd[L, A](OL: fpDashTsLib.es6OrdMod.Ord[L], OA: fpDashTsLib.es6OrdMod.Ord[A]): fpDashTsLib.es6OrdMod.Ord[fpDashTsLib.es6TupleMod.Tuple[L, A]] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.es6SemigroupMod.Semigroup[L], SA: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6TupleMod.Tuple[L, A]] = js.native
  def getSetoid[L, A](EL: fpDashTsLib.es6EqMod.Eq[L], EA: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[fpDashTsLib.es6TupleMod.Tuple[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.es6ShowMod.Show[L], SA: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[fpDashTsLib.es6TupleMod.Tuple[L, A]] = js.native
  def snd[L, A](fa: fpDashTsLib.es6TupleMod.Tuple[L, A]): A = js.native
  def swap[L, A](sa: fpDashTsLib.es6TupleMod.Tuple[L, A]): fpDashTsLib.es6TupleMod.Tuple[A, L] = js.native
}

