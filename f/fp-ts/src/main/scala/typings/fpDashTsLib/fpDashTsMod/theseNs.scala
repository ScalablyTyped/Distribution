package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "these")
@js.native
object theseNs extends js.Object {
  @js.native
  class Both[L, A] protected ()
    extends fpDashTsLib.libTheseMod.Both[L, A] {
    def this(l: L, a: A) = this()
  }
  
  @js.native
  class That[L, A] protected ()
    extends fpDashTsLib.libTheseMod.That[L, A] {
    def this(value: A) = this()
  }
  
  @js.native
  class This[L, A] protected ()
    extends fpDashTsLib.libTheseMod.This[L, A] {
    def this(value: L) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.These = js.native
  val these: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.libTheseMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libTheseMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[fpDashTsLib.libTheseMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[fpDashTsLib.libTheseMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(foldMap, map, mapLeft, reduce, reduceRight) */ def bimap[L, A, M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.libTheseMod.These[L, A], fpDashTsLib.libTheseMod.These[M, B]] = js.native
  def both[L, A](l: L, a: A): fpDashTsLib.libTheseMod.These[L, A] = js.native
  def fold[E, A, R](
    onLeft: js.Function1[/* e */ E, R],
    onRight: js.Function1[/* a */ A, R],
    onBoth: js.Function2[/* e */ E, /* a */ A, R]
  ): js.Function1[/* fa */ fpDashTsLib.libTheseMod.These[E, A], R] = js.native
  def fromEither[L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): fpDashTsLib.libTheseMod.These[L, A] = js.native
  def fromOptions[L, A](fl: fpDashTsLib.libOptionMod.Option[L], fa: fpDashTsLib.libOptionMod.Option[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libTheseMod.These[L, A]] = js.native
  def fromThese[L, A](defaultThis: L, defaultThat: A): js.Function1[/* fa */ fpDashTsLib.libTheseMod.These[L, A], js.Tuple2[L, A]] = js.native
  def getEq[L, A](EL: fpDashTsLib.libEqMod.Eq[L], EA: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libTheseMod.These[L, A]] = js.native
  def getLeft[E, A](fa: fpDashTsLib.libTheseMod.These[E, A]): fpDashTsLib.libOptionMod.Option[E] = js.native
  def getLeftOnly[E, A](fa: fpDashTsLib.libTheseMod.These[E, A]): fpDashTsLib.libOptionMod.Option[E] = js.native
  def getMonad[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L] = js.native
  def getRight[E, A](fa: fpDashTsLib.libTheseMod.These[E, A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def getRightOnly[E, A](fa: fpDashTsLib.libTheseMod.These[E, A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.libSemigroupMod.Semigroup[L], SA: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libTheseMod.These[L, A]] = js.native
  def getSetoid[L, A](EL: fpDashTsLib.libEqMod.Eq[L], EA: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libTheseMod.These[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.libShowMod.Show[L], SA: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[fpDashTsLib.libTheseMod.These[L, A]] = js.native
  def isBoth[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): /* is fp-ts.fp-ts/lib/These.Both<L, A> */ scala.Boolean = js.native
  def isLeft[E, A](fa: fpDashTsLib.libTheseMod.These[E, A]): /* is fp-ts.fp-ts/lib/These.This<E, A> */ scala.Boolean = js.native
  def isRight[E, A](fa: fpDashTsLib.libTheseMod.These[E, A]): /* is fp-ts.fp-ts/lib/These.That<E, A> */ scala.Boolean = js.native
  def isThat[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): /* is fp-ts.fp-ts/lib/These.That<L, A> */ scala.Boolean = js.native
  def isThis[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): /* is fp-ts.fp-ts/lib/These.This<L, A> */ scala.Boolean = js.native
  def left[E](left: E): fpDashTsLib.libTheseMod.These[E, scala.Nothing] = js.native
  def leftOrBoth[E](defaultLeft: E): js.Function1[/* ma */ fpDashTsLib.libOptionMod.Option[_], fpDashTsLib.libTheseMod.These[E, _]] = js.native
  def right[A](right: A): fpDashTsLib.libTheseMod.These[scala.Nothing, A] = js.native
  def rightOrBoth[A](defaultRight: A): js.Function1[/* me */ fpDashTsLib.libOptionMod.Option[_], fpDashTsLib.libTheseMod.These[_, A]] = js.native
  def that[L, A](a: A): fpDashTsLib.libTheseMod.These[L, A] = js.native
  def thatOrBoth[L, A](defaultThat: A, ml: fpDashTsLib.libOptionMod.Option[L]): fpDashTsLib.libTheseMod.These[L, A] = js.native
  def theseLeft[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): fpDashTsLib.libOptionMod.Option[L] = js.native
  def theseRight[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def theseThat[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def theseThis[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): fpDashTsLib.libOptionMod.Option[L] = js.native
  def thisOrBoth[L, A](defaultThis: L, ma: fpDashTsLib.libOptionMod.Option[A]): fpDashTsLib.libTheseMod.These[L, A] = js.native
  def this_[L, A](l: L): fpDashTsLib.libTheseMod.These[L, A] = js.native
  def toTuple[E, A](e: E, a: A): js.Function1[/* fa */ fpDashTsLib.libTheseMod.These[E, A], js.Tuple2[E, A]] = js.native
}

