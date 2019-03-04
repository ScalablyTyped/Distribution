package typings
package fpDashTsLib.libAlternativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libApplicativeMod.Applicative2C[F, L]
     with fpDashTsLib.libPlusMod.Plus2C[F, L]

object Alternative2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    alt: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[F, L, js.Any]],
    zero: js.Function0[fpDashTsLib.libHKTMod.Type2[F, L, js.Any]]
  ): Alternative2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], alt = alt, ap = ap, map = map, of = of, zero = zero)
  
    __obj.asInstanceOf[Alternative2C[F, L]]
  }
}

