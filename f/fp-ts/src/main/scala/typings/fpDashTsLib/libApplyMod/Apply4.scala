package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply4[F /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libFunctorMod.Functor4[F] {
  def ap[X, U, L, A, B](
    fab: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]
  ): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B]
}

object Apply4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Apply4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply4[F]]
  }
}

