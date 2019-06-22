package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L] extends js.Object {
  val URI: F
  val _L: L
  val _U: U
  def map[A, B](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.Kind3[F, U, L, B]
}

object Functor3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    map: (fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Any]
  ): Functor3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Functor3C[F, U, L]]
  }
}

