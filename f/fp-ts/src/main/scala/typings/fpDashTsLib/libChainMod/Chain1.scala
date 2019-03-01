package typings
package fpDashTsLib.libChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libApplyMod.Apply1[F] {
  def chain[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type[F, B]]): fpDashTsLib.libHKTMod.Type[F, B]
}

object Chain1 {
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
    ]
  ): Chain1[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Chain1[F]]
  }
}

