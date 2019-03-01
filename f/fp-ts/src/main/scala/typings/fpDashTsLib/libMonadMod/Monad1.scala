package typings
package fpDashTsLib.libMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libApplicativeMod.Applicative1[F]
     with fpDashTsLib.libChainMod.Chain1[F]

object Monad1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[F, js.Any]], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[F, js.Any]]
  ): Monad1[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("of")(of)
    __obj.asInstanceOf[Monad1[F]]
  }
}

