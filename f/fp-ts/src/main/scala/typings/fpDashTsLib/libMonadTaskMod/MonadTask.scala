package typings
package fpDashTsLib.libMonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadTask[M]
  extends fpDashTsLib.libMonadMod.Monad[M] {
  def fromTask[A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libHKTMod.HKT[M, A]
}

object MonadTask {
  @scala.inline
  def apply[M](
    URI: M,
    ap: (fpDashTsLib.libHKTMod.HKT[M, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.HKT[M, js.Any]) => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    chain: (fpDashTsLib.libHKTMod.HKT[M, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]]) => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    fromTask: fpDashTsLib.libTaskMod.Task[js.Any] => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    map: (fpDashTsLib.libHKTMod.HKT[M, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.HKT[M, js.Any]
  ): MonadTask[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadTask[M]]
  }
}

