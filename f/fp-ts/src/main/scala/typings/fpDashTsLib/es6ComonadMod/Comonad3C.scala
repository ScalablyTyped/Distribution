package typings
package fpDashTsLib.es6ComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad3C[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L]
  extends fpDashTsLib.es6ExtendMod.Extend3C[F, U, L] {
  def extract[A](ca: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]): A
}

object Comonad3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    extend: (fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any], js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any], js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any],
    extract: fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any] => js.Any,
    map: (fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any]
  ): Comonad3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Comonad3C[F, U, L]]
  }
}

