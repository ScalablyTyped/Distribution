package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libFunctorMod.Functor3[F] {
  def ap[U, L, A, B](
    fab: fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A]
  ): fpDashTsLib.libHKTMod.Kind3[F, U, L, B]
}

object Apply3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): Apply3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply3[F]]
  }
}

