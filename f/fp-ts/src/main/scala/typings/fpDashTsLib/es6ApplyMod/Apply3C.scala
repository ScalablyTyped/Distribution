package typings
package fpDashTsLib.es6ApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply3C[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L]
  extends fpDashTsLib.es6FunctorMod.Functor3C[F, U, L] {
  def ap[A, B](
    fab: fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]
  ): fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]
}

object Apply3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    ap: (fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any]
  ): Apply3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply3C[F, U, L]]
  }
}

