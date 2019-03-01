package typings
package fpDashTsLib.libPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libAltMod.Alt2C[F, L] {
  def zero[A](): fpDashTsLib.libHKTMod.Type2[F, L, A]
}

object Plus2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    alt: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    zero: js.Function0[fpDashTsLib.libHKTMod.Type2[F, L, js.Any]]
  ): Plus2C[F, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("alt")(alt)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[Plus2C[F, L]]
  }
}

