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
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = ap, chain = chain, fromTask = fromTask, map = map, of = of)
  
    __obj.asInstanceOf[MonadTask[M]]
  }
}

