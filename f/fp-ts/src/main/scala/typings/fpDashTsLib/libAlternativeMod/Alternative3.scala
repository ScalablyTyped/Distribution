package typings
package fpDashTsLib.libAlternativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libApplicativeMod.Applicative3[F]
     with fpDashTsLib.libPlusMod.Plus3[F]

object Alternative3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    alt: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any],
    ap: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any],
    zero: () => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): Alternative3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Alternative3[F]]
  }
}

