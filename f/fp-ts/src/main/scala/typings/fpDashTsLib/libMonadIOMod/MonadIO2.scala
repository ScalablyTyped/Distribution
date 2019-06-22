package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO2[M /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libMonadMod.Monad2[M] {
  def fromIO[L, A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.Kind2[M, L, A]
}

object MonadIO2 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: M,
    ap: (fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    chain: (fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    fromIO: fpDashTsLib.libIOMod.IO[js.Any] => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any]
  ): MonadIO2[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadIO2[M]]
  }
}

