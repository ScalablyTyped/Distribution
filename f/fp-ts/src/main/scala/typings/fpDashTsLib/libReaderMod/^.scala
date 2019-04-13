package typings
package fpDashTsLib.libReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Reader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Reader = js.native
  val reader: fpDashTsLib.libMonadMod.Monad2[URI] with fpDashTsLib.libProfunctorMod.Profunctor2[URI] with fpDashTsLib.libCategoryMod.Category2[URI] with fpDashTsLib.libStrongMod.Strong2[URI] with fpDashTsLib.libChoiceMod.Choice2[URI] = js.native
  def ask[E](): Reader[E, E] = js.native
  def asks[E, A](f: js.Function1[/* e */ E, A]): Reader[E, A] = js.native
  def getMonoid[E, A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[Reader[E, A]] = js.native
  def getSemigroup[E, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[Reader[E, A]] = js.native
  def local[E, E2](f: js.Function1[/* e */ E2, E]): js.Function1[/* fa */ Reader[E, _], Reader[E2, _]] = js.native
}

