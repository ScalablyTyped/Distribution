package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libExtendMod.Extend2[F] {
  def extract[L, A](ca: fpDashTsLib.libHKTMod.Type2[F, L, A]): A
}

object Comonad2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    extend: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    extract: js.Function1[fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], js.Any],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ]
  ): Comonad2[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("extend")(extend)
    __obj.updateDynamic("extract")(extract)
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Comonad2[F]]
  }
}

