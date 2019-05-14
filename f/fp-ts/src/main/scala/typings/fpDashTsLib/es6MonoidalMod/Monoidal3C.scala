package typings
package fpDashTsLib.es6MonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal3C[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L]
  extends fpDashTsLib.es6FunctorMod.Functor3C[F, U, L] {
  def mult[A, B](fa: fpDashTsLib.es6HKTMod.Type3[F, U, L, A], fb: fpDashTsLib.es6HKTMod.Type3[F, U, L, B]): fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Tuple2[A, B]]
  def unit(): fpDashTsLib.es6HKTMod.Type3[F, U, L, scala.Unit]
}

object Monoidal3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    map: (fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Any],
    mult: (fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Any], fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Tuple2[js.Any, js.Any]],
    unit: () => fpDashTsLib.es6HKTMod.Type3[F, U, L, scala.Unit]
  ): Monoidal3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mult = js.Any.fromFunction2(mult), unit = js.Any.fromFunction0(unit))
  
    __obj.asInstanceOf[Monoidal3C[F, U, L]]
  }
}

