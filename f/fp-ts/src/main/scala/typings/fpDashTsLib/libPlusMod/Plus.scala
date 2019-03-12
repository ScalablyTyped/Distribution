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
    alt: (fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    zero: () => fpDashTsLib.libHKTMod.HKT[F, js.Any]
  ): Plus[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Plus[F]]
  }
}

