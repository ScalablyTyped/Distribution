package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFunctorMod.Functor2C[F, L] {
  def extend[A, B](
    ea: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, A], B]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

object Extend2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    extend: (fpDashTsLib.libHKTMod.Type2[F, L, js.Any], js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[F, L, js.Any], js.Any]) => fpDashTsLib.libHKTMod.Type2[F, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Type2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
  ): Extend2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Extend2C[F, L]]
  }
}

