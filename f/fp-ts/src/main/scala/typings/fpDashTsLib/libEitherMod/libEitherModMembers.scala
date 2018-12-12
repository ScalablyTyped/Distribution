package typings
package fpDashTsLib.libEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Either", JSImport.Namespace)
@js.native
object libEitherModMembers extends js.Object {
  val URI: /* Either */ java.lang.String = js.native
  val either: fpDashTsLib.libMonadMod.Monad2[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libAltMod.Alt2[URI] with fpDashTsLib.libExtendMod.Extend2[URI] with fpDashTsLib.libChainRecMod.ChainRec2[URI] = js.native
  def fromNullable[L](defaultValue: L): js.Function1[/* a */ js.UndefOr[js.Any | scala.Null], Either[L, _]] = js.native
  def fromOption[L](defaultValue: L): js.Function1[/* fa */ fpDashTsLib.libOptionMod.Option[_], Either[L, _]] = js.native
  def fromOptionL[L](defaultValue: fpDashTsLib.libFunctionMod.Lazy[L]): js.Function1[/* fa */ fpDashTsLib.libOptionMod.Option[_], Either[L, _]] = js.native
  def fromPredicate[L, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], whenFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, Either[L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_LABA[L, A, B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B], whenFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, Either[L, B]] = js.native
  def fromRefinement[L, A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B], whenFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, Either[L, B]] = js.native
  def fromValidation[L, A](fa: fpDashTsLib.libValidationMod.Validation[L, A]): Either[L, A] = js.native
  def getApplyMonoid[L, A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[Either[L, A]] = js.native
  def getApplySemigroup[L, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[Either[L, A]] = js.native
  def getCompactable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libCompactableMod.Compactable2C[URI, L] = js.native
  def getFilterable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libFilterableMod.Filterable2C[URI, L] = js.native
  def getSemigroup[L, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[Either[L, A]] = js.native
  def getSetoid[L, A](SL: fpDashTsLib.libSetoidMod.Setoid[L], SA: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[Either[L, A]] = js.native
  def getWitherable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libWitherableMod.Witherable2C[URI, L] = js.native
  def isLeft[L, A](fa: Either[L, A]): /* is Left */scala.Boolean = js.native
  def isRight[L, A](fa: Either[L, A]): /* is Right */scala.Boolean = js.native
  def left[L, A](l: L): Either[L, A] = js.native
  def right[L, A](a: A): Either[L, A] = js.native
  def toError(e: js.Any): stdLib.Error = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A]): Either[stdLib.Error, A] = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A], onerror: js.Function1[/* e */ js.Any, stdLib.Error]): Either[stdLib.Error, A] = js.native
  def tryCatch2v[L, A](f: fpDashTsLib.libFunctionMod.Lazy[A], onerror: js.Function1[/* e */ js.Any, L]): Either[L, A] = js.native
}

