package typings
package fpDashTsLib.libMonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadTask3[M /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libMonadMod.Monad3[M] {
  def fromTask[U, L, A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libHKTMod.Type3[M, U, L, A]
}

