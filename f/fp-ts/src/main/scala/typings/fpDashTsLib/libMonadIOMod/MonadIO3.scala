package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO3[M /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libMonadMod.Monad3[M] {
  def fromIO[U, L, A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.Type3[M, U, L, A]
}

object MonadIO3 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: M,
    ap: (fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any],
    chain: (fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any],
    fromIO: fpDashTsLib.libIOMod.IO[js.Any] => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]
  ): MonadIO3[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadIO3[M]]
  }
}

