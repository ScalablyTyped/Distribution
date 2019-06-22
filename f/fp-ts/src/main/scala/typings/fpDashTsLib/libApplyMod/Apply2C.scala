package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFunctorMod.Functor2C[F, L] {
  def ap[A, B](
    fab: fpDashTsLib.libHKTMod.Kind2[F, L, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.libHKTMod.Kind2[F, L, A]
  ): fpDashTsLib.libHKTMod.Kind2[F, L, B]
}

object Apply2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    ap: (fpDashTsLib.libHKTMod.Kind2[F, L, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
  ): Apply2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply2C[F, L]]
  }
}

