package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFunctorMod.Functor2C[F, L] {
  def ap[A, B](
    fab: fpDashTsLib.libHKTMod.Type2[F, L, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

object Apply2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ]
  ): Apply2C[F, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Apply2C[F, L]]
  }
}

