package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "ixIO")
@js.native
object ixIONs extends js.Object {
  @js.native
  class IxIO[I, O, A] protected ()
    extends fpDashTsLib.libIxIOMod.IxIO[I, O, A] {
    def this(value: fpDashTsLib.libIOMod.IO[A]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.IxIO = js.native
  val ixIO: fpDashTsLib.libIxMonadMod.IxMonad3[fpDashTsLib.libIxIOMod.URI] = js.native
  def getMonad[I](): fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, I, I] = js.native
  def iof[I, A](a: A): fpDashTsLib.libIxIOMod.IxIO[I, I, A] = js.native
}

