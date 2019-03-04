package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO3C[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libMonadMod.Monad3C[M, U, L] {
  def fromIO[A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.Type3[M, U, L, A]
}

object MonadIO3C {
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
    fromIO: js.Function1[fpDashTsLib.libIOMod.IO[js.Any], fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Any]]
  ): MonadIO3C[M, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = ap, chain = chain, fromIO = fromIO, map = map, of = of)
  
    __obj.asInstanceOf[MonadIO3C[M, U, L]]
  }
}

