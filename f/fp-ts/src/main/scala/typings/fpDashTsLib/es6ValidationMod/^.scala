package typings
package fpDashTsLib.es6ValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Validation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Validation = js.native
  val validation: fpDashTsLib.es6FunctorMod.Functor2[URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v2[URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v2[URI] = js.native
  def failure[L, A](l: L): Validation[L, A] = js.native
  def fromEither[L, A](e: fpDashTsLib.es6EitherMod.Either[L, A]): Validation[L, A] = js.native
  def fromPredicate[L, A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A], f: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, Validation[L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_LABA[L, A, B /* <: A */](predicate: fpDashTsLib.es6FunctionMod.Refinement[A, B], f: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, Validation[L, B]] = js.native
  def getAlt[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6AltMod.Alt2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  def getApplicative[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  def getCompactable[L](ML: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6CompactableMod.Compactable2C[URI, L] = js.native
  def getFilterable[L](ML: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6FilterableMod.Filterable2C[URI, L] = js.native
  def getMonad[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  def getMonadThrow[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6MonadThrowMod.MonadThrow2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  def getMonoid[L, A](SL: fpDashTsLib.es6SemigroupMod.Semigroup[L], SA: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[Validation[L, A]] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.es6SemigroupMod.Semigroup[L], SA: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[Validation[L, A]] = js.native
  def getSetoid[L, A](SL: fpDashTsLib.es6SetoidMod.Setoid[L], SA: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[Validation[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.es6ShowMod.Show[L], SA: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[Validation[L, A]] = js.native
  def getWitherable[L](ML: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6WitherableMod.Witherable2C[URI, L] = js.native
  def isFailure[L, A](fa: Validation[L, A]): /* is fp-ts.fp-ts/es6/Validation.Failure<L, A> */ scala.Boolean = js.native
  def isSuccess[L, A](fa: Validation[L, A]): /* is fp-ts.fp-ts/es6/Validation.Success<L, A> */ scala.Boolean = js.native
  def success[L, A](a: A): Validation[L, A] = js.native
  def tryCatch[L, A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onError: js.Function1[/* e */ js.Any, L]): Validation[L, A] = js.native
}

