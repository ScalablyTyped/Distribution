package typings
package fpDashTsLib.libPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libAltMod.Alt3C[F, U, L] {
  def zero[A](): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
}

object Plus3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    alt: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    zero: js.Function0[fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]]
  ): Plus3C[F, U, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("_U")(_U.asInstanceOf[js.Any])
    __obj.updateDynamic("alt")(alt)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[Plus3C[F, U, L]]
  }
}

