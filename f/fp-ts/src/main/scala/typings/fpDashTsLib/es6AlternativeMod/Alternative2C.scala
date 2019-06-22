package typings
package fpDashTsLib.es6AlternativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L]
  extends fpDashTsLib.es6ApplicativeMod.Applicative2C[F, L]
     with fpDashTsLib.es6PlusMod.Plus2C[F, L]

object Alternative2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    alt: (fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any],
    ap: (fpDashTsLib.es6HKTMod.Kind2[F, L, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any],
    zero: () => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
  ): Alternative2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Alternative2C[F, L]]
  }
}

