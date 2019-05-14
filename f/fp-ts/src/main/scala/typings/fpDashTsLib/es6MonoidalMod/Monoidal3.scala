package typings
package fpDashTsLib.es6MonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6FunctorMod.Functor3[F] {
  def mult[U, L, A, B](fa: fpDashTsLib.es6HKTMod.Type3[F, U, L, A], fb: fpDashTsLib.es6HKTMod.Type3[F, U, L, B]): fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Tuple2[A, B]]
  def unit[U, L](): fpDashTsLib.es6HKTMod.Type3[F, U, L, scala.Unit]
}

object Monoidal3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any],
    mult: (fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any], fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Tuple2[js.Any, js.Any]],
    unit: () => fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, scala.Unit]
  ): Monoidal3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mult = js.Any.fromFunction2(mult), unit = js.Any.fromFunction0(unit))
  
    __obj.asInstanceOf[Monoidal3[F]]
  }
}

