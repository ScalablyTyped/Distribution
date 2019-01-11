package typings
package fpDashTsLib.libIxIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/IxIO", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* IxIO */ java.lang.String = js.native
  val ixIO: fpDashTsLib.libIxMonadMod.IxMonad3[fpDashTsLib.libIxIOMod.URI] = js.native
  def getMonad[I](): fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, I, I] = js.native
  def iof[I, A](a: A): fpDashTsLib.libIxIOMod.IxIO[I, I, A] = js.native
}

