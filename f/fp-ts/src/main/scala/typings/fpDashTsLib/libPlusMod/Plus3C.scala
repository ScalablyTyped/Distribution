package typings
package fpDashTsLib.libPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libAltMod.Alt3C[F, U, L] {
  def zero[A](): fpDashTsLib.libHKTMod.Kind3[F, U, L, A]
}

object Plus3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    alt: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any],
    zero: () => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]
  ): Plus3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Plus3C[F, U, L]]
  }
}

