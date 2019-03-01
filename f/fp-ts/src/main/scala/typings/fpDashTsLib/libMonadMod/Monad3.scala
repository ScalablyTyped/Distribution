package typings
package fpDashTsLib.libMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad3[M /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libApplicativeMod.Applicative3[M]
     with fpDashTsLib.libChainMod.Chain3[M]

object Monad3 {
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
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Any]]
  ): Monad3[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("of")(of)
    __obj.asInstanceOf[Monad3[M]]
  }
}

