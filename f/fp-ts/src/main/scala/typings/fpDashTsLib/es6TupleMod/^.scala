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
  def getApplicative[L](M: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getApply[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6ApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getChain[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getChainRec[L](M: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6ChainRecMod.ChainRec2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getMonad[L](M: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  def getMonoid[L, A](ML: fpDashTsLib.es6MonoidMod.Monoid[L], MA: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[Tuple[L, A]] = js.native
  def getOrd[L, A](OL: fpDashTsLib.es6OrdMod.Ord[L], OA: fpDashTsLib.es6OrdMod.Ord[A]): fpDashTsLib.es6OrdMod.Ord[Tuple[L, A]] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.es6SemigroupMod.Semigroup[L], SA: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[Tuple[L, A]] = js.native
  def getSetoid[L, A](SA: fpDashTsLib.es6SetoidMod.Setoid[L], SB: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[Tuple[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.es6ShowMod.Show[L], SA: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[Tuple[L, A]] = js.native
}

