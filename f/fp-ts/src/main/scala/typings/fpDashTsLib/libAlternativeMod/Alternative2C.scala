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
    alt: (fpDashTsLib.libHKTMod.Type2[F, L, js.Any], fpDashTsLib.libHKTMod.Type2[F, L, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, L, js.Any],
    ap: (fpDashTsLib.libHKTMod.Type2[F, L, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type2[F, L, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Type2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, L, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Type2[F, L, js.Any],
    zero: () => fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
  ): Alternative2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Alternative2C[F, L]]
  }
}

