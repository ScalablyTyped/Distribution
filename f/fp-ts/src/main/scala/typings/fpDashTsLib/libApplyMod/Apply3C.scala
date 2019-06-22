package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libFunctorMod.Functor3C[F, U, L] {
  def ap[A, B](
    fab: fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A]
  ): fpDashTsLib.libHKTMod.Kind3[F, U, L, B]
}

object Apply3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    ap: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]
  ): Apply3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply3C[F, U, L]]
  }
}

