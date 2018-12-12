package typings
package fpDashTsLib.libValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Validation", JSImport.Namespace)
@js.native
object libValidationModMembers extends js.Object {
  val URI: /* Validation */ java.lang.String = js.native
  val validation: fpDashTsLib.libFunctorMod.Functor2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[URI] = js.native
  def failure[L, A](l: L): Validation[L, A] = js.native
  def fromEither[L, A](e: fpDashTsLib.libEitherMod.Either[L, A]): Validation[L, A] = js.native
  def fromPredicate[L, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], f: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, Validation[L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_LABA[L, A, B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B], f: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, Validation[L, B]] = js.native
  def getAlt[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libAltMod.Alt2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  def getApplicative[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  def getCompactable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libCompactableMod.Compactable2C[URI, L] = js.native
  def getFilterable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libFilterableMod.Filterable2C[URI, L] = js.native
  def getMonad[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  def getMonoid[L, A](SL: fpDashTsLib.libSemigroupMod.Semigroup[L], SA: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[Validation[L, A]] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.libSemigroupMod.Semigroup[L], SA: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[Validation[L, A]] = js.native
  def getSetoid[L, A](SL: fpDashTsLib.libSetoidMod.Setoid[L], SA: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[Validation[L, A]] = js.native
  def getWitherable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libWitherableMod.Witherable2C[URI, L] = js.native
  def isFailure[L, A](fa: Validation[L, A]): /* is Failure */scala.Boolean = js.native
  def isSuccess[L, A](fa: Validation[L, A]): /* is Success */scala.Boolean = js.native
  def success[L, A](a: A): Validation[L, A] = js.native
}

