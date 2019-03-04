package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO2[M /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libMonadMod.Monad2[M] {
  def fromIO[L, A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.Type2[M, L, A]
}

object MonadIO2 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: M,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]
    ],
    fromIO: js.Function1[fpDashTsLib.libIOMod.IO[js.Any], fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]]
  ): MonadIO2[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = ap, chain = chain, fromIO = fromIO, map = map, of = of)
  
    __obj.asInstanceOf[MonadIO2[M]]
  }
}

