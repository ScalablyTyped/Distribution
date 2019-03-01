package typings
package fpDashTsLib.libMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad2[M /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libApplicativeMod.Applicative2[M]
     with fpDashTsLib.libChainMod.Chain2[M]

object Monad2 {
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
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]]
  ): Monad2[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("of")(of)
    __obj.asInstanceOf[Monad2[M]]
  }
}

