package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.Functor2[F] {
  def ap[L, A, B](
    fab: fpDashTsLib.libHKTMod.Type2[F, L, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

object Apply2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
  ): Apply2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply2[F]]
  }
}

