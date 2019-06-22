package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libExtendMod.Extend3C[F, U, L] {
  def extract[A](ca: fpDashTsLib.libHKTMod.Kind3[F, U, L, A]): A
}

object Comonad3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    extend: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any],
    extract: fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any] => js.Any,
    map: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]
  ): Comonad3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Comonad3C[F, U, L]]
  }
}

