package typings
package fpDashTsLib.libMonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadTask3C[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libMonadMod.Monad3C[M, U, L] {
  def fromTask[A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libHKTMod.Type3[M, U, L, A]
}

object MonadTask3C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: M,
    _L: L,
    _U: U,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]
    ],
    fromTask: js.Function1[fpDashTsLib.libTaskMod.Task[js.Any], fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]]
  ): MonadTask3C[M, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = ap, chain = chain, fromTask = fromTask, map = map, of = of)
  
    __obj.asInstanceOf[MonadTask3C[M, U, L]]
  }
}

