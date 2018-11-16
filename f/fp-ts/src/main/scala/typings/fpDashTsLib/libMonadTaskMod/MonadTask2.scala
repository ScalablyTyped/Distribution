package typings
package fpDashTsLib.libMonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MonadTask2[M /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libMonadMod.Monad2[M] {
  def fromTask[L, A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libHKTMod.Type2[M, L, A]
}

