package typings
package fpDashTsLib.libEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Either", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Either = js.native
  val either: fpDashTsLib.libMonadMod.Monad2[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libAltMod.Alt2[URI] with fpDashTsLib.libExtendMod.Extend2[URI] with fpDashTsLib.libChainRecMod.ChainRec2[URI] with fpDashTsLib.libMonadThrowMod.MonadThrow2[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, bimap, chain, chainFirst, duplicate, extend, flatten, foldMap, map, mapLeft, reduce, reduceRight, fromPredicate, filterOrElse) */ def alt[L, A](that: js.Function0[Either[L, A]]): js.Function1[/* fa */ Either[L, A], Either[L, A]] = js.native
  def elem[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function1[/* a */ A, js.Function1[/* ma */ Either[_, A], scala.Boolean]] = js.native
  def fold[E, A, R](onLeft: js.Function1[/* e */ E, R], onRight: js.Function1[/* a */ A, R]): js.Function1[/* ma */ Either[E, A], R] = js.native
  def fromNullable[L](defaultValue: L): js.Function1[/* a */ js.UndefOr[js.Any | scala.Null], Either[L, _]] = js.native
  def fromOption[L](onNone: L): js.Function1[/* fa */ fpDashTsLib.libOptionMod.Option[_], Either[L, _]] = js.native
  def fromOptionL[L](onNone: fpDashTsLib.libFunctionMod.Lazy[L]): js.Function1[/* fa */ fpDashTsLib.libOptionMod.Option[_], Either[L, _]] = js.native
  def fromRefinement[L, A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, Either[L, B]] = js.native
  def fromValidation[L, A](fa: fpDashTsLib.libValidationMod.Validation[L, A]): Either[L, A] = js.native
  def getApplyMonoid[L, A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[Either[L, A]] = js.native
  def getApplySemigroup[L, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[Either[L, A]] = js.native
  def getCompactable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libCompactableMod.Compactable2C[URI, L] = js.native
  def getEq[L, A](EL: fpDashTsLib.libEqMod.Eq[L], EA: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[Either[L, A]] = js.native
  def getFilterable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libFilterableMod.Filterable2C[URI, L] = js.native
  def getOrElse[E, A](f: js.Function1[/* e */ E, A]): js.Function1[/* ma */ Either[E, A], A] = js.native
  def getSemigroup[L, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[Either[L, A]] = js.native
  def getSetoid[L, A](EL: fpDashTsLib.libEqMod.Eq[L], EA: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[Either[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.libShowMod.Show[L], SA: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[Either[L, A]] = js.native
  def getValidation[E](S: fpDashTsLib.libSemigroupMod.Semigroup[E]): (fpDashTsLib.libMonadMod.Monad2C[URI, E]) with (fpDashTsLib.libAltMod.Alt2C[URI, E]) = js.native
  def getValidationMonoid[E, A](SE: fpDashTsLib.libSemigroupMod.Semigroup[E], SA: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[Either[E, A]] = js.native
  def getValidationSemigroup[E, A](SE: fpDashTsLib.libSemigroupMod.Semigroup[E], SA: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[Either[E, A]] = js.native
  def getWitherable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libWitherableMod.Witherable2C[URI, L] = js.native
  def isLeft[L, A](fa: Either[L, A]): /* is fp-ts.fp-ts/lib/Either.Left<L, A> */ scala.Boolean = js.native
  def isRight[L, A](fa: Either[L, A]): /* is fp-ts.fp-ts/lib/Either.Right<L, A> */ scala.Boolean = js.native
  def left[L, A](l: L): Either[L, A] = js.native
  def orElse[E, A, M](f: js.Function1[/* e */ E, Either[M, A]]): js.Function1[/* ma */ Either[E, A], Either[M, A]] = js.native
  def parseJSON[L](s: java.lang.String, onError: js.Function1[/* reason */ js.Any, L]): Either[L, _] = js.native
  def right[L, A](a: A): Either[L, A] = js.native
  def stringifyJSON[L](u: js.Any, onError: js.Function1[/* reason */ js.Any, L]): Either[L, java.lang.String] = js.native
  def toError(e: js.Any): stdLib.Error = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A]): Either[stdLib.Error, A] = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A], onerror: js.Function1[/* e */ js.Any, stdLib.Error]): Either[stdLib.Error, A] = js.native
  def tryCatch2v[L, A](f: fpDashTsLib.libFunctionMod.Lazy[A], onerror: js.Function1[/* e */ js.Any, L]): Either[L, A] = js.native
}

