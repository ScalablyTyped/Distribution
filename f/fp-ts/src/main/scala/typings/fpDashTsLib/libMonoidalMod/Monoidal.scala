package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal[F]
  extends fpDashTsLib.libFunctorMod.Functor[F] {
  def mult[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], fb: fpDashTsLib.libHKTMod.HKT[F, B]): fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[A, B]]
  def unit(): fpDashTsLib.libHKTMod.HKT[F, scala.Unit]
}

object Monoidal {
  @scala.inline
  def apply[F](
    URI: F,
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    mult: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[js.Any, js.Any]]
    ],
    unit: js.Function0[fpDashTsLib.libHKTMod.HKT[F, scala.Unit]]
  ): Monoidal[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = map, mult = mult, unit = unit)
  
    __obj.asInstanceOf[Monoidal[F]]
  }
}

