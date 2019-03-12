package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libExtendMod.Extend2C[F, L] {
  def extract[A](ca: fpDashTsLib.libHKTMod.Type2[F, L, A]): A
}

object Comonad2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    extend: (fpDashTsLib.libHKTMod.Type2[F, L, js.Any], js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, js.Any], js.Any]) => fpDashTsLib.libHKTMod.Type2[F, L, js.Any],
    extract: fpDashTsLib.libHKTMod.Type2[F, L, js.Any] => js.Any,
    map: (fpDashTsLib.libHKTMod.Type2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
  ): Comonad2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Comonad2C[F, L]]
  }
}

