package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "ixIO")
@js.native
object ixIONs extends js.Object {
  @js.native
  class IxIO[I, O, A] protected ()
    extends fpDashTsLib.es6IxIOMod.IxIO[I, O, A] {
    def this(value: fpDashTsLib.es6IOMod.IO[A]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.IxIO = js.native
  val ixIO: fpDashTsLib.es6IxMonadMod.IxMonad3[fpDashTsLib.es6IxIOMod.URI] = js.native
  def getMonad[I](): fpDashTsLib.es6MonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, I, I] = js.native
  def iof[I, A](a: A): fpDashTsLib.es6IxIOMod.IxIO[I, I, A] = js.native
}

