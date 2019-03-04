package typings
package fpDashTsLib.libMonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadTask2C[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libMonadMod.Monad2C[M, L] {
  def fromTask[A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libHKTMod.Type2[M, L, A]
}

object MonadTask2C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: M,
    _L: L,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, L, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[M, L, js.Any], 
      fpDashTsLib.libHKTMod.Type2[M, L, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, L, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, L, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[M, L, js.Any]
    ],
    fromTask: js.Function1[fpDashTsLib.libTaskMod.Task[js.Any], fpDashTsLib.libHKTMod.Type2[M, L, js.Any]],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[M, L, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, L, js.Any]]
  ): MonadTask2C[M, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], ap = ap, chain = chain, fromTask = fromTask, map = map, of = of)
  
    __obj.asInstanceOf[MonadTask2C[M, L]]
  }
}

