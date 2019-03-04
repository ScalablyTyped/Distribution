package typings
package fpDashTsLib.libAlternativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libApplicativeMod.Applicative2[F]
     with fpDashTsLib.libPlusMod.Plus2[F]

object Alternative2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    alt: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]],
    zero: js.Function0[fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]]
  ): Alternative2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = alt, ap = ap, map = map, of = of, zero = zero)
  
    __obj.asInstanceOf[Alternative2[F]]
  }
}

