package typings
package fpDashTsLib.libMonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadTask3[M /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libMonadMod.Monad3[M] {
  def fromTask[U, L, A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libHKTMod.Type3[M, U, L, A]
}

object MonadTask3 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: M,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]
    ],
    fromTask: js.Function1[
      fpDashTsLib.libTaskMod.Task[js.Any], 
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]]
  ): MonadTask3[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = ap, chain = chain, fromTask = fromTask, map = map, of = of)
  
    __obj.asInstanceOf[MonadTask3[M]]
  }
}

