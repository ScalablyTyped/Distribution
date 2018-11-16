package typings
package fpDashTsLib.libMonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MonadTask1[M /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libMonadMod.Monad1[M] {
  def fromTask[A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libHKTMod.Type[M, A]
}

