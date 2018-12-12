package typings
package fpDashTsLib.libTheseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/These", JSImport.Namespace)
@js.native
object libTheseModMembers extends js.Object {
  val URI: /* These */ java.lang.String = js.native
  val these: fpDashTsLib.libFunctorMod.Functor2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[URI] = js.native
  def both[L, A](l: L, a: A): These[L, A] = js.native
  def fromThese[L, A](defaultThis: L, defaultThat: A): js.Function1[/* fa */ These[L, A], js.Tuple2[L, A]] = js.native
  def getMonad[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.libSemigroupMod.Semigroup[L], SA: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[These[L, A]] = js.native
  def getSetoid[L, A](SL: fpDashTsLib.libSetoidMod.Setoid[L], SA: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[These[L, A]] = js.native
  def isBoth[L, A](fa: These[L, A]): /* is Both */scala.Boolean = js.native
  def isThat[L, A](fa: These[L, A]): /* is That */scala.Boolean = js.native
  def isThis[L, A](fa: These[L, A]): /* is This */scala.Boolean = js.native
  def that[L, A](a: A): These[L, A] = js.native
  def theseLeft[L, A](fa: These[L, A]): fpDashTsLib.libOptionMod.Option[L] = js.native
  def theseRight[L, A](fa: These[L, A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def `this_`[L, A](l: L): These[L, A] = js.native
}

