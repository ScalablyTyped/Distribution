package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "either")
@js.native
object eitherNs extends js.Object {
  @js.native
  class Left[L, A] protected ()
    extends fpDashTsLib.libEitherMod.Left[L, A] {
    def this(value: L) = this()
  }
  
  @js.native
  class Right[L, A] protected ()
    extends fpDashTsLib.libEitherMod.Right[L, A] {
    def this(value: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Either = js.native
  val either: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libAltMod.Alt2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libExtendMod.Extend2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libChainRecMod.ChainRec2[fpDashTsLib.libEitherMod.URI] with fpDashTsLib.libMonadThrowMod.MonadThrow2[fpDashTsLib.libEitherMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, bimap, chain, chainFirst, duplicate, extend, flatten, foldMap, map, mapLeft, reduce, reduceRight, fromPredicate, filterOrElse) */ def alt[L, A](that: js.Function0[fpDashTsLib.libEitherMod.Either[L, A]]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[L, A], 
    fpDashTsLib.libEitherMod.Either[L, A]
  ] = js.native
  def elem[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function1[
    /* a */ A, 
    js.Function1[/* ma */ fpDashTsLib.libEitherMod.Either[_, A], scala.Boolean]
  ] = js.native
  def fold[E, A, R](onLeft: js.Function1[/* e */ E, R], onRight: js.Function1[/* a */ A, R]): js.Function1[/* ma */ fpDashTsLib.libEitherMod.Either[E, A], R] = js.native
  def fromNullable[L](defaultValue: L): js.Function1[/* a */ js.UndefOr[js.Any | scala.Null], fpDashTsLib.libEitherMod.Either[L, _]] = js.native
  def fromOption[L](onNone: L): js.Function1[/* fa */ fpDashTsLib.libOptionMod.Option[_], fpDashTsLib.libEitherMod.Either[L, _]] = js.native
  def fromOptionL[L](onNone: fpDashTsLib.libFunctionMod.Lazy[L]): js.Function1[/* fa */ fpDashTsLib.libOptionMod.Option[_], fpDashTsLib.libEitherMod.Either[L, _]] = js.native
  def fromRefinement[L, A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[L, B]] = js.native
  def fromValidation[L, A](fa: fpDashTsLib.libValidationMod.Validation[L, A]): fpDashTsLib.libEitherMod.Either[L, A] = js.native
  def getApplyMonoid[L, A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libEitherMod.Either[L, A]] = js.native
  def getApplySemigroup[L, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libEitherMod.Either[L, A]] = js.native
  def getCompactable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libCompactableMod.Compactable2C[fpDashTsLib.libEitherMod.URI, L] = js.native
  def getEq[L, A](EL: fpDashTsLib.libEqMod.Eq[L], EA: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libEitherMod.Either[L, A]] = js.native
  def getFilterable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libFilterableMod.Filterable2C[fpDashTsLib.libEitherMod.URI, L] = js.native
  def getOrElse[E, A](f: js.Function1[/* e */ E, A]): js.Function1[/* ma */ fpDashTsLib.libEitherMod.Either[E, A], A] = js.native
  def getSemigroup[L, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libEitherMod.Either[L, A]] = js.native
  def getSetoid[L, A](EL: fpDashTsLib.libEqMod.Eq[L], EA: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libEitherMod.Either[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.libShowMod.Show[L], SA: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[fpDashTsLib.libEitherMod.Either[L, A]] = js.native
  def getValidation[E](S: fpDashTsLib.libSemigroupMod.Semigroup[E]): (fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.libEitherMod.URI, E]) with (fpDashTsLib.libAltMod.Alt2C[fpDashTsLib.libEitherMod.URI, E]) = js.native
  def getValidationMonoid[E, A](SE: fpDashTsLib.libSemigroupMod.Semigroup[E], SA: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libEitherMod.Either[E, A]] = js.native
  def getValidationSemigroup[E, A](SE: fpDashTsLib.libSemigroupMod.Semigroup[E], SA: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libEitherMod.Either[E, A]] = js.native
  def getWitherable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libWitherableMod.Witherable2C[fpDashTsLib.libEitherMod.URI, L] = js.native
  def isLeft[L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): /* is fp-ts.fp-ts/lib/Either.Left<L, A> */ scala.Boolean = js.native
  def isRight[L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): /* is fp-ts.fp-ts/lib/Either.Right<L, A> */ scala.Boolean = js.native
  def left[L, A](l: L): fpDashTsLib.libEitherMod.Either[L, A] = js.native
  def orElse[E, A, M](f: js.Function1[/* e */ E, fpDashTsLib.libEitherMod.Either[M, A]]): js.Function1[
    /* ma */ fpDashTsLib.libEitherMod.Either[E, A], 
    fpDashTsLib.libEitherMod.Either[M, A]
  ] = js.native
  def parseJSON[L](s: java.lang.String, onError: js.Function1[/* reason */ js.Any, L]): fpDashTsLib.libEitherMod.Either[L, _] = js.native
  def right[L, A](a: A): fpDashTsLib.libEitherMod.Either[L, A] = js.native
  def stringifyJSON[L](u: js.Any, onError: js.Function1[/* reason */ js.Any, L]): fpDashTsLib.libEitherMod.Either[L, java.lang.String] = js.native
  def toError(e: js.Any): stdLib.Error = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A]): fpDashTsLib.libEitherMod.Either[stdLib.Error, A] = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A], onerror: js.Function1[/* e */ js.Any, stdLib.Error]): fpDashTsLib.libEitherMod.Either[stdLib.Error, A] = js.native
  def tryCatch2v[L, A](f: fpDashTsLib.libFunctionMod.Lazy[A], onerror: js.Function1[/* e */ js.Any, L]): fpDashTsLib.libEitherMod.Either[L, A] = js.native
}

