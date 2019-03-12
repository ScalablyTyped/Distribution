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
    ap: (fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any],
    chain: (fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any],
    fromTask: fpDashTsLib.libTaskMod.Task[js.Any] => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]
  ): MonadTask3[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadTask3[M]]
  }
}

