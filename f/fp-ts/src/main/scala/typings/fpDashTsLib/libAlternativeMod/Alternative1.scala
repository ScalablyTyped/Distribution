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
    alt: (fpDashTsLib.libHKTMod.Type[F, js.Any], fpDashTsLib.libHKTMod.Type[F, js.Any]) => fpDashTsLib.libHKTMod.Type[F, js.Any],
    ap: (fpDashTsLib.libHKTMod.Type[F, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type[F, js.Any]) => fpDashTsLib.libHKTMod.Type[F, js.Any],
    map: (fpDashTsLib.libHKTMod.Type[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type[F, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Type[F, js.Any],
    zero: () => fpDashTsLib.libHKTMod.Type[F, js.Any]
  ): Alternative1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Alternative1[F]]
  }
}

