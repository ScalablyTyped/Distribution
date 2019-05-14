package typings
package fpDashTsLib.es6MonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal[F]
  extends fpDashTsLib.es6FunctorMod.Functor[F] {
  def mult[A, B](fa: fpDashTsLib.es6HKTMod.HKT[F, A], fb: fpDashTsLib.es6HKTMod.HKT[F, B]): fpDashTsLib.es6HKTMod.HKT[F, js.Tuple2[A, B]]
  def unit(): fpDashTsLib.es6HKTMod.HKT[F, scala.Unit]
}

object Monoidal {
  @scala.inline
  def apply[F](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    mult: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], fpDashTsLib.es6HKTMod.HKT[F, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Tuple2[js.Any, js.Any]],
    unit: () => fpDashTsLib.es6HKTMod.HKT[F, scala.Unit]
  ): Monoidal[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mult = js.Any.fromFunction2(mult), unit = js.Any.fromFunction0(unit))
  
    __obj.asInstanceOf[Monoidal[F]]
  }
}

