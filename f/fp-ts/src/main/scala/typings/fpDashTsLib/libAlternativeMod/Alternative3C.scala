package typings
package fpDashTsLib.libAlternativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]
     with fpDashTsLib.libPlusMod.Plus3C[F, U, L]

object Alternative3C {
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
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]],
    zero: js.Function0[fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]]
  ): Alternative3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], alt = alt, ap = ap, map = map, of = of, zero = zero)
  
    __obj.asInstanceOf[Alternative3C[F, U, L]]
  }
}

