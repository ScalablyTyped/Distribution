package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "io")
@js.native
object ioNs extends js.Object {
  @js.native
  class IO[A] protected ()
    extends fpDashTsLib.es6IOMod.IO[A] {
    def this(run: fpDashTsLib.es6FunctionMod.Lazy[A]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.IO = js.native
  val io: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.es6IOMod.URI] with fpDashTsLib.es6MonadIOMod.MonadIO1[fpDashTsLib.es6IOMod.URI] = js.native
  def getMonoid[A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6IOMod.IO[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6IOMod.IO[A]] = js.native
}

