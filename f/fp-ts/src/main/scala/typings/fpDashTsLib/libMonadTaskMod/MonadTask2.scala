package typings
package fpDashTsLib.libMonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadTask2[M /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libMonadMod.Monad2[M] {
  def fromTask[L, A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libHKTMod.Type2[M, L, A]
}

object MonadTask2 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: M,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]
    ],
    fromTask: js.Function1[
      fpDashTsLib.libTaskMod.Task[js.Any], 
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]]
  ): MonadTask2[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = ap, chain = chain, fromTask = fromTask, map = map, of = of)
  
    __obj.asInstanceOf[MonadTask2[M]]
  }
}

