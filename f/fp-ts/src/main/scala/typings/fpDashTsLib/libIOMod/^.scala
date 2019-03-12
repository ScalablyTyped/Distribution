package typings
package fpDashTsLib.libIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/IO", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* IO */ java.lang.String = js.native
  val io: fpDashTsLib.libMonadMod.Monad1[URI] with fpDashTsLib.libMonadIOMod.MonadIO1[URI] = js.native
  def getMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[IO[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[IO[A]] = js.native
}

