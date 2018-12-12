package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "io")
@js.native
object ioNs extends js.Object {
  @js.native
  class IO[A] protected ()
    extends fpDashTsLib.libIOMod.IO[A] {
    def this(run: fpDashTsLib.libFunctionMod.Lazy[A]) = this()
  }
  
  val URI: /* IO */ java.lang.String = js.native
  val io: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libIOMod.URI] with fpDashTsLib.libMonadIOMod.MonadIO1[fpDashTsLib.libIOMod.URI] = js.native
  def getMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libIOMod.IO[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libIOMod.IO[A]] = js.native
}

