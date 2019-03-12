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
    ap: (fpDashTsLib.libHKTMod.Type3[M, U, L, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]) => fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any],
    chain: (fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]]) => fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any],
    fromTask: fpDashTsLib.libTaskMod.Task[js.Any] => fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]
  ): MonadTask3C[M, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadTask3C[M, U, L]]
  }
}

