package typings
package fpDashTsLib.es6MonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6FunctorMod.Functor2[F] {
  def mult[L, A, B](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], fb: fpDashTsLib.es6HKTMod.Type2[F, L, B]): fpDashTsLib.es6HKTMod.Type2[F, L, js.Tuple2[A, B]]
  def unit[L](): fpDashTsLib.es6HKTMod.Type2[F, L, scala.Unit]
}

object Monoidal2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    mult: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Tuple2[js.Any, js.Any]],
    unit: () => fpDashTsLib.es6HKTMod.Type2[F, js.Any, scala.Unit]
  ): Monoidal2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mult = js.Any.fromFunction2(mult), unit = js.Any.fromFunction0(unit))
  
    __obj.asInstanceOf[Monoidal2[F]]
  }
}

