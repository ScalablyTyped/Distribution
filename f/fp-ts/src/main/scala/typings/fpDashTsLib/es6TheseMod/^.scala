package typings
package fpDashTsLib.es6TheseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/These", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.These = js.native
  val these: fpDashTsLib.es6FunctorMod.Functor2[URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v2[URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v2[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(foldMap, map, mapLeft, reduce, reduceRight) */ def bimap[L, A, M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ These[L, A], These[M, B]] = js.native
  def both[L, A](l: L, a: A): These[L, A] = js.native
  def fold[E, A, R](
    onLeft: js.Function1[/* e */ E, R],
    onRight: js.Function1[/* a */ A, R],
    onBoth: js.Function2[/* e */ E, /* a */ A, R]
  ): js.Function1[/* fa */ These[E, A], R] = js.native
  def fromEither[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): These[L, A] = js.native
  def fromOptions[L, A](fl: fpDashTsLib.es6OptionMod.Option[L], fa: fpDashTsLib.es6OptionMod.Option[A]): fpDashTsLib.es6OptionMod.Option[These[L, A]] = js.native
  def fromThese[L, A](defaultThis: L, defaultThat: A): js.Function1[/* fa */ These[L, A], js.Tuple2[L, A]] = js.native
  def getEq[L, A](EL: fpDashTsLib.es6EqMod.Eq[L], EA: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[These[L, A]] = js.native
  def getLeft[E, A](fa: These[E, A]): fpDashTsLib.es6OptionMod.Option[E] = js.native
  def getLeftOnly[E, A](fa: These[E, A]): fpDashTsLib.es6OptionMod.Option[E] = js.native
  def getMonad[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L] = js.native
  def getRight[E, A](fa: These[E, A]): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def getRightOnly[E, A](fa: These[E, A]): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.es6SemigroupMod.Semigroup[L], SA: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[These[L, A]] = js.native
  def getSetoid[L, A](EL: fpDashTsLib.es6EqMod.Eq[L], EA: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[These[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.es6ShowMod.Show[L], SA: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[These[L, A]] = js.native
  def isBoth[L, A](fa: These[L, A]): /* is fp-ts.fp-ts/es6/These.Both<L, A> */ scala.Boolean = js.native
  def isLeft[E, A](fa: These[E, A]): /* is fp-ts.fp-ts/es6/These.This<E, A> */ scala.Boolean = js.native
  def isRight[E, A](fa: These[E, A]): /* is fp-ts.fp-ts/es6/These.That<E, A> */ scala.Boolean = js.native
  def isThat[L, A](fa: These[L, A]): /* is fp-ts.fp-ts/es6/These.That<L, A> */ scala.Boolean = js.native
  def isThis[L, A](fa: These[L, A]): /* is fp-ts.fp-ts/es6/These.This<L, A> */ scala.Boolean = js.native
  def left[E](left: E): These[E, scala.Nothing] = js.native
  def leftOrBoth[E](defaultLeft: E): js.Function1[/* ma */ fpDashTsLib.es6OptionMod.Option[_], These[E, _]] = js.native
  def right[A](right: A): These[scala.Nothing, A] = js.native
  def rightOrBoth[A](defaultRight: A): js.Function1[/* me */ fpDashTsLib.es6OptionMod.Option[_], These[_, A]] = js.native
  def that[L, A](a: A): These[L, A] = js.native
  def thatOrBoth[L, A](defaultThat: A, ml: fpDashTsLib.es6OptionMod.Option[L]): These[L, A] = js.native
  def theseLeft[L, A](fa: These[L, A]): fpDashTsLib.es6OptionMod.Option[L] = js.native
  def theseRight[L, A](fa: These[L, A]): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def theseThat[L, A](fa: These[L, A]): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def theseThis[L, A](fa: These[L, A]): fpDashTsLib.es6OptionMod.Option[L] = js.native
  def thisOrBoth[L, A](defaultThis: L, ma: fpDashTsLib.es6OptionMod.Option[A]): These[L, A] = js.native
  def this_[L, A](l: L): These[L, A] = js.native
  def toTuple[E, A](e: E, a: A): js.Function1[/* fa */ These[E, A], js.Tuple2[E, A]] = js.native
}

