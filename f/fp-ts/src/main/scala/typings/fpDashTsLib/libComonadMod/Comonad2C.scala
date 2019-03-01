package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libExtendMod.Extend2C[F, L] {
  def extract[A](ca: fpDashTsLib.libHKTMod.Type2[F, L, A]): A
}

object Comonad2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    extend: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, js.Any], js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    extract: js.Function1[fpDashTsLib.libHKTMod.Type2[F, L, js.Any], js.Any],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ]
  ): Comonad2C[F, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("extend")(extend)
    __obj.updateDynamic("extract")(extract)
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Comonad2C[F, L]]
  }
}

