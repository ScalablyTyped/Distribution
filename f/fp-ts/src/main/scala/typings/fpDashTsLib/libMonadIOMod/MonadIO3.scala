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
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]
    ],
    fromIO: js.Function1[
      fpDashTsLib.libIOMod.IO[js.Any], 
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]]
  ): MonadIO3[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("fromIO")(fromIO)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("of")(of)
    __obj.asInstanceOf[MonadIO3[M]]
  }
}

