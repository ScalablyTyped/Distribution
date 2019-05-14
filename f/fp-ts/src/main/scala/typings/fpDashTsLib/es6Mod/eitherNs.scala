package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "either")
@js.native
object eitherNs extends js.Object {
  @js.native
  class Left[L, A] protected ()
    extends fpDashTsLib.es6EitherMod.Left[L, A] {
    def this(value: L) = this()
  }
  
  @js.native
  class Right[L, A] protected ()
    extends fpDashTsLib.es6EitherMod.Right[L, A] {
    def this(value: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Either = js.native
  val either: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.es6EitherMod.URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v2[fpDashTsLib.es6EitherMod.URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v2[fpDashTsLib.es6EitherMod.URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[fpDashTsLib.es6EitherMod.URI] with fpDashTsLib.es6AltMod.Alt2[fpDashTsLib.es6EitherMod.URI] with fpDashTsLib.es6ExtendMod.Extend2[fpDashTsLib.es6EitherMod.URI] with fpDashTsLib.es6ChainRecMod.ChainRec2[fpDashTsLib.es6EitherMod.URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow2[fpDashTsLib.es6EitherMod.URI] = js.native
  def fromNullable[L](defaultValue: L): js.Function1[/* a */ js.UndefOr[js.Any | scala.Null], fpDashTsLib.es6EitherMod.Either[L, _]] = js.native
  def fromOption[L](defaultValue: L): js.Function1[/* fa */ fpDashTsLib.es6OptionMod.Option[_], fpDashTsLib.es6EitherMod.Either[L, _]] = js.native
  def fromOptionL[L](defaultValue: fpDashTsLib.es6FunctionMod.Lazy[L]): js.Function1[/* fa */ fpDashTsLib.es6OptionMod.Option[_], fpDashTsLib.es6EitherMod.Either[L, _]] = js.native
  def fromPredicate[L, A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_LABA[L, A, B /* <: A */](predicate: fpDashTsLib.es6FunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[L, B]] = js.native
  def fromRefinement[L, A, B /* <: A */](refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[L, B]] = js.native
  def fromValidation[L, A](fa: fpDashTsLib.es6ValidationMod.Validation[L, A]): fpDashTsLib.es6EitherMod.Either[L, A] = js.native
  def getApplyMonoid[L, A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
  def getApplySemigroup[L, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
  def getCompactable[L](ML: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6CompactableMod.Compactable2C[fpDashTsLib.es6EitherMod.URI, L] = js.native
  def getFilterable[L](ML: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6FilterableMod.Filterable2C[fpDashTsLib.es6EitherMod.URI, L] = js.native
  def getSemigroup[L, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
  def getSetoid[L, A](SL: fpDashTsLib.es6SetoidMod.Setoid[L], SA: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.es6ShowMod.Show[L], SA: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
  def getWitherable[L](ML: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6WitherableMod.Witherable2C[fpDashTsLib.es6EitherMod.URI, L] = js.native
  def isLeft[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): /* is fp-ts.fp-ts/es6/Either.Left<L, A> */ scala.Boolean = js.native
  def isRight[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): /* is fp-ts.fp-ts/es6/Either.Right<L, A> */ scala.Boolean = js.native
  def left[L, A](l: L): fpDashTsLib.es6EitherMod.Either[L, A] = js.native
  def parseJSON[L](s: java.lang.String, onError: js.Function1[/* reason */ js.Any, L]): fpDashTsLib.es6EitherMod.Either[L, _] = js.native
  def right[L, A](a: A): fpDashTsLib.es6EitherMod.Either[L, A] = js.native
  def stringifyJSON[L](u: js.Any, onError: js.Function1[/* reason */ js.Any, L]): fpDashTsLib.es6EitherMod.Either[L, java.lang.String] = js.native
  def toError(e: js.Any): stdLib.Error = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A]): fpDashTsLib.es6EitherMod.Either[stdLib.Error, A] = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onerror: js.Function1[/* e */ js.Any, stdLib.Error]): fpDashTsLib.es6EitherMod.Either[stdLib.Error, A] = js.native
  def tryCatch2v[L, A](f: fpDashTsLib.es6FunctionMod.Lazy[A], onerror: js.Function1[/* e */ js.Any, L]): fpDashTsLib.es6EitherMod.Either[L, A] = js.native
}

