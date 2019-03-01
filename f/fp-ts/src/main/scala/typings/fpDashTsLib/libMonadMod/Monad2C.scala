package typings
package fpDashTsLib.libMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad2C[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libApplicativeMod.Applicative2C[M, L]
     with fpDashTsLib.libChainMod.Chain2C[M, L]

object Monad2C {
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
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[M, L, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, L, js.Any]]
  ): Monad2C[M, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("of")(of)
    __obj.asInstanceOf[Monad2C[M, L]]
  }
}

