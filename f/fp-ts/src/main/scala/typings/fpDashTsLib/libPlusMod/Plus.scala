package typings
package fpDashTsLib.libPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus[F]
  extends fpDashTsLib.libAltMod.Alt[F] {
  def zero[A](): fpDashTsLib.libHKTMod.HKT[F, A]
}

object Plus {
  @scala.inline
  def apply[F](
    URI: F,
    alt: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    zero: js.Function0[fpDashTsLib.libHKTMod.HKT[F, js.Any]]
  ): Plus[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = alt, map = map, zero = zero)
  
    __obj.asInstanceOf[Plus[F]]
  }
}

