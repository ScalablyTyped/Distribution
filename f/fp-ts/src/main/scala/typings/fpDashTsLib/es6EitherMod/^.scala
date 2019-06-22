package typings
package fpDashTsLib.es6EitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Either", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Either = js.native
  val either: fpDashTsLib.es6MonadMod.Monad2[URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v2[URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v2[URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[URI] with fpDashTsLib.es6AltMod.Alt2[URI] with fpDashTsLib.es6ExtendMod.Extend2[URI] with fpDashTsLib.es6ChainRecMod.ChainRec2[URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow2[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, bimap, chain, chainFirst, duplicate, extend, flatten, foldMap, map, mapLeft, reduce, reduceRight, fromPredicate, filterOrElse) */ def alt[L, A](that: js.Function0[Either[L, A]]): js.Function1[/* fa */ Either[L, A], Either[L, A]] = js.native
  def elem[A](E: fpDashTsLib.es6EqMod.Eq[A]): js.Function1[/* a */ A, js.Function1[/* ma */ Either[_, A], scala.Boolean]] = js.native
  def fold[E, A, R](onLeft: js.Function1[/* e */ E, R], onRight: js.Function1[/* a */ A, R]): js.Function1[/* ma */ Either[E, A], R] = js.native
  def fromNullable[L](defaultValue: L): js.Function1[/* a */ js.UndefOr[js.Any | scala.Null], Either[L, _]] = js.native
  def fromOption[L](onNone: L): js.Function1[/* fa */ fpDashTsLib.es6OptionMod.Option[_], Either[L, _]] = js.native
  def fromOptionL[L](onNone: fpDashTsLib.es6FunctionMod.Lazy[L]): js.Function1[/* fa */ fpDashTsLib.es6OptionMod.Option[_], Either[L, _]] = js.native
  def fromRefinement[L, A, B /* <: A */](refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, Either[L, B]] = js.native
  def fromValidation[L, A](fa: fpDashTsLib.es6ValidationMod.Validation[L, A]): Either[L, A] = js.native
  def getApplyMonoid[L, A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[Either[L, A]] = js.native
  def getApplySemigroup[L, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[Either[L, A]] = js.native
  def getCompactable[L](ML: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6CompactableMod.Compactable2C[URI, L] = js.native
  def getEq[L, A](EL: fpDashTsLib.es6EqMod.Eq[L], EA: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[Either[L, A]] = js.native
  def getFilterable[L](ML: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6FilterableMod.Filterable2C[URI, L] = js.native
  def getOrElse[E, A](f: js.Function1[/* e */ E, A]): js.Function1[/* ma */ Either[E, A], A] = js.native
  def getSemigroup[L, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[Either[L, A]] = js.native
  def getSetoid[L, A](EL: fpDashTsLib.es6EqMod.Eq[L], EA: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[Either[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.es6ShowMod.Show[L], SA: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[Either[L, A]] = js.native
  def getValidation[E](S: fpDashTsLib.es6SemigroupMod.Semigroup[E]): (fpDashTsLib.es6MonadMod.Monad2C[URI, E]) with (fpDashTsLib.es6AltMod.Alt2C[URI, E]) = js.native
  def getValidationMonoid[E, A](SE: fpDashTsLib.es6SemigroupMod.Semigroup[E], SA: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[Either[E, A]] = js.native
  def getValidationSemigroup[E, A](SE: fpDashTsLib.es6SemigroupMod.Semigroup[E], SA: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[Either[E, A]] = js.native
  def getWitherable[L](ML: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6WitherableMod.Witherable2C[URI, L] = js.native
  def isLeft[L, A](fa: Either[L, A]): /* is fp-ts.fp-ts/es6/Either.Left<L, A> */ scala.Boolean = js.native
  def isRight[L, A](fa: Either[L, A]): /* is fp-ts.fp-ts/es6/Either.Right<L, A> */ scala.Boolean = js.native
  def left[L, A](l: L): Either[L, A] = js.native
  def orElse[E, A, M](f: js.Function1[/* e */ E, Either[M, A]]): js.Function1[/* ma */ Either[E, A], Either[M, A]] = js.native
  def parseJSON[L](s: java.lang.String, onError: js.Function1[/* reason */ js.Any, L]): Either[L, _] = js.native
  def right[L, A](a: A): Either[L, A] = js.native
  def stringifyJSON[L](u: js.Any, onError: js.Function1[/* reason */ js.Any, L]): Either[L, java.lang.String] = js.native
  def toError(e: js.Any): stdLib.Error = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A]): Either[stdLib.Error, A] = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onerror: js.Function1[/* e */ js.Any, stdLib.Error]): Either[stdLib.Error, A] = js.native
  def tryCatch2v[L, A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onerror: js.Function1[/* e */ js.Any, L]): Either[L, A] = js.native
}

