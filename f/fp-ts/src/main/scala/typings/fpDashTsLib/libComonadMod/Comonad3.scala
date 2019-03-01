package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libExtendMod.Extend3[F] {
  def extract[U, L, A](ca: fpDashTsLib.libHKTMod.Type3[F, U, L, A]): A
}

object Comonad3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    extend: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    extract: js.Function1[fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Any],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ]
  ): Comonad3[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("extend")(extend)
    __obj.updateDynamic("extract")(extract)
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Comonad3[F]]
  }
}

