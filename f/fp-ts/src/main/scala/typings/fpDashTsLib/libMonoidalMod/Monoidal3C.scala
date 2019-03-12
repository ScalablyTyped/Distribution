package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libFunctorMod.Functor3C[F, U, L] {
  def mult[A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], fb: fpDashTsLib.libHKTMod.Type3[F, U, L, B]): fpDashTsLib.libHKTMod.Type3[F, U, L, js.Tuple2[A, B]]
  def unit(): fpDashTsLib.libHKTMod.Type3[F, U, L, scala.Unit]
}

object Monoidal3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    map: (fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any],
    mult: (fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, U, L, js.Tuple2[js.Any, js.Any]],
    unit: () => fpDashTsLib.libHKTMod.Type3[F, U, L, scala.Unit]
  ): Monoidal3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mult = js.Any.fromFunction2(mult), unit = js.Any.fromFunction0(unit))
  
    __obj.asInstanceOf[Monoidal3C[F, U, L]]
  }
}

