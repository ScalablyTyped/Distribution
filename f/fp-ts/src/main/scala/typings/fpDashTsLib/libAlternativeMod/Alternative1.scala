package typings
package fpDashTsLib.libAlternativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libApplicativeMod.Applicative1[F]
     with fpDashTsLib.libPlusMod.Plus1[F]

object Alternative1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    alt: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[F, js.Any]],
    zero: js.Function0[fpDashTsLib.libHKTMod.Type[F, js.Any]]
  ): Alternative1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = alt, ap = ap, map = map, of = of, zero = zero)
  
    __obj.asInstanceOf[Alternative1[F]]
  }
}

