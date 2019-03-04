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
    fromIO: js.Function1[fpDashTsLib.libIOMod.IO[js.Any], fpDashTsLib.libHKTMod.Type2[M, L, js.Any]],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[M, L, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, L, js.Any]]
  ): MonadIO2C[M, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], ap = ap, chain = chain, fromIO = fromIO, map = map, of = of)
  
    __obj.asInstanceOf[MonadIO2C[M, L]]
  }
}

