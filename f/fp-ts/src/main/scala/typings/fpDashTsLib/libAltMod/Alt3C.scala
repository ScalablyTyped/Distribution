package typings
package fpDashTsLib.libAltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libFunctorMod.Functor3C[F, U, L] {
  def alt[A](fx: fpDashTsLib.libHKTMod.Kind3[F, U, L, A], fy: fpDashTsLib.libHKTMod.Kind3[F, U, L, A]): fpDashTsLib.libHKTMod.Kind3[F, U, L, A]
}

object Alt3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    alt: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]
  ): Alt3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Alt3C[F, U, L]]
  }
}

