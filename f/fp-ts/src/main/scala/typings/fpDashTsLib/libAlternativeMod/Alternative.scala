package typings
package fpDashTsLib.libAlternativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative[F]
  extends fpDashTsLib.libApplicativeMod.Applicative[F]
     with fpDashTsLib.libPlusMod.Plus[F]

object Alternative {
  @scala.inline
  def apply[F](
    URI: F,
    alt: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    ap: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Any]],
    zero: js.Function0[fpDashTsLib.libHKTMod.HKT[F, js.Any]]
  ): Alternative[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = alt, ap = ap, map = map, of = of, zero = zero)
  
    __obj.asInstanceOf[Alternative[F]]
  }
}

