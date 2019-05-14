package typings
package fpDashTsLib.es6PlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus[F]
  extends fpDashTsLib.es6AltMod.Alt[F] {
  def zero[A](): fpDashTsLib.es6HKTMod.HKT[F, A]
}

object Plus {
  @scala.inline
  def apply[F](
    URI: F,
    alt: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], fpDashTsLib.es6HKTMod.HKT[F, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    zero: () => fpDashTsLib.es6HKTMod.HKT[F, js.Any]
  ): Plus[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Plus[F]]
  }
}

