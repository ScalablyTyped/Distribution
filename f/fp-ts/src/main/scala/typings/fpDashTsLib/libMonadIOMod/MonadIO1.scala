package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO1[M /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libMonadMod.Monad1[M] {
  def fromIO[A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.Type[M, A]
}

object MonadIO1 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: M,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type[M, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type[M, js.Any], 
      fpDashTsLib.libHKTMod.Type[M, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type[M, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]], 
      fpDashTsLib.libHKTMod.Type[M, js.Any]
    ],
    fromIO: js.Function1[fpDashTsLib.libIOMod.IO[js.Any], fpDashTsLib.libHKTMod.Type[M, js.Any]],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[M, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[M, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]]
  ): MonadIO1[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = ap, chain = chain, fromIO = fromIO, map = map, of = of)
  
    __obj.asInstanceOf[MonadIO1[M]]
  }
}

