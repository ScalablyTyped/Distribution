package typings
package fpDashTsLib.es6IxIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/IxIO", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.IxIO = js.native
  val ixIO: fpDashTsLib.es6IxMonadMod.IxMonad3[URI] = js.native
  def getMonad[I](): fpDashTsLib.es6MonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, I, I] = js.native
  def iof[I, A](a: A): IxIO[I, I, A] = js.native
}

