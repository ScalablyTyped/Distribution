package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.Functor2[F] {
  def extend[L, A, B](
    ea: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], B]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

object Extend2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    extend: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ]
  ): Extend2[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("extend")(extend)
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Extend2[F]]
  }
}

