package typings
package fpDashTsLib.libMonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MonadTask2C[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libMonadMod.Monad2C[M, L] {
  def fromTask[A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libHKTMod.Type2[M, L, A]
}

