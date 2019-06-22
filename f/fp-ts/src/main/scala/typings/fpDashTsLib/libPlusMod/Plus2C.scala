package typings
package fpDashTsLib.libPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libAltMod.Alt2C[F, L] {
  def zero[A](): fpDashTsLib.libHKTMod.Kind2[F, L, A]
}

object Plus2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    alt: (fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, L, js.Any],
    zero: () => fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
  ): Plus2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Plus2C[F, L]]
  }
}

