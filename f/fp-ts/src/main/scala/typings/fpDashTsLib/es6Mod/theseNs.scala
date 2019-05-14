package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "these")
@js.native
object theseNs extends js.Object {
  @js.native
  class Both[L, A] protected ()
    extends fpDashTsLib.es6TheseMod.Both[L, A] {
    def this(l: L, a: A) = this()
  }
  
  @js.native
  class That[L, A] protected ()
    extends fpDashTsLib.es6TheseMod.That[L, A] {
    def this(value: A) = this()
  }
  
  @js.native
  class This[L, A] protected ()
    extends fpDashTsLib.es6TheseMod.This[L, A] {
    def this(value: L) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.These = js.native
  val these: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.es6TheseMod.URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[fpDashTsLib.es6TheseMod.URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v2[fpDashTsLib.es6TheseMod.URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v2[fpDashTsLib.es6TheseMod.URI] = js.native
  def both[L, A](l: L, a: A): fpDashTsLib.es6TheseMod.These[L, A] = js.native
  def fromEither[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): fpDashTsLib.es6TheseMod.These[L, A] = js.native
  def fromOptions[L, A](fl: fpDashTsLib.es6OptionMod.Option[L], fa: fpDashTsLib.es6OptionMod.Option[A]): fpDashTsLib.es6OptionMod.Option[fpDashTsLib.es6TheseMod.These[L, A]] = js.native
  def fromThese[L, A](defaultThis: L, defaultThat: A): js.Function1[/* fa */ fpDashTsLib.es6TheseMod.These[L, A], js.Tuple2[L, A]] = js.native
  def getMonad[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.es6SemigroupMod.Semigroup[L], SA: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6TheseMod.These[L, A]] = js.native
  def getSetoid[L, A](SL: fpDashTsLib.es6SetoidMod.Setoid[L], SA: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[fpDashTsLib.es6TheseMod.These[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.es6ShowMod.Show[L], SA: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[fpDashTsLib.es6TheseMod.These[L, A]] = js.native
  def isBoth[L, A](fa: fpDashTsLib.es6TheseMod.These[L, A]): /* is fp-ts.fp-ts/es6/These.Both<L, A> */ scala.Boolean = js.native
  def isThat[L, A](fa: fpDashTsLib.es6TheseMod.These[L, A]): /* is fp-ts.fp-ts/es6/These.That<L, A> */ scala.Boolean = js.native
  def isThis[L, A](fa: fpDashTsLib.es6TheseMod.These[L, A]): /* is fp-ts.fp-ts/es6/These.This<L, A> */ scala.Boolean = js.native
  def that[L, A](a: A): fpDashTsLib.es6TheseMod.These[L, A] = js.native
  def thatOrBoth[L, A](defaultThat: A, ml: fpDashTsLib.es6OptionMod.Option[L]): fpDashTsLib.es6TheseMod.These[L, A] = js.native
  def theseLeft[L, A](fa: fpDashTsLib.es6TheseMod.These[L, A]): fpDashTsLib.es6OptionMod.Option[L] = js.native
  def theseRight[L, A](fa: fpDashTsLib.es6TheseMod.These[L, A]): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def theseThat[L, A](fa: fpDashTsLib.es6TheseMod.These[L, A]): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def theseThis[L, A](fa: fpDashTsLib.es6TheseMod.These[L, A]): fpDashTsLib.es6OptionMod.Option[L] = js.native
  def thisOrBoth[L, A](defaultThis: L, ma: fpDashTsLib.es6OptionMod.Option[A]): fpDashTsLib.es6TheseMod.These[L, A] = js.native
  def this_[L, A](l: L): fpDashTsLib.es6TheseMod.These[L, A] = js.native
}

