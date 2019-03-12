package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO2C[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libMonadMod.Monad2C[M, L] {
  def fromIO[A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.Type2[M, L, A]
}

object MonadIO2C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: M,
    _L: L,
    ap: (fpDashTsLib.libHKTMod.Type2[M, L, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type2[M, L, js.Any]) => fpDashTsLib.libHKTMod.Type2[M, L, js.Any],
    chain: (fpDashTsLib.libHKTMod.Type2[M, L, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, L, js.Any]]) => fpDashTsLib.libHKTMod.Type2[M, L, js.Any],
    fromIO: fpDashTsLib.libIOMod.IO[js.Any] => fpDashTsLib.libHKTMod.Type2[M, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Type2[M, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[M, L, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Type2[M, L, js.Any]
  ): MonadIO2C[M, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadIO2C[M, L]]
  }
}

