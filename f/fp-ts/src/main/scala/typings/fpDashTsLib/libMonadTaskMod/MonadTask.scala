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
    ap: js.Function2[
      fpDashTsLib.libHKTMod.HKT[M, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.HKT[M, js.Any], 
      fpDashTsLib.libHKTMod.HKT[M, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.HKT[M, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]], 
      fpDashTsLib.libHKTMod.HKT[M, js.Any]
    ],
    fromTask: js.Function1[fpDashTsLib.libTaskMod.Task[js.Any], fpDashTsLib.libHKTMod.HKT[M, js.Any]],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[M, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[M, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]]
  ): MonadTask[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("fromTask")(fromTask)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("of")(of)
    __obj.asInstanceOf[MonadTask[M]]
  }
}

