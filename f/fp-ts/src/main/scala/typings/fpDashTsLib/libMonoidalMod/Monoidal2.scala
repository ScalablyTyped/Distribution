package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.Functor2[F] {
  def mult[L, A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], fb: fpDashTsLib.libHKTMod.Type2[F, L, B]): fpDashTsLib.libHKTMod.Type2[F, L, js.Tuple2[A, B]]
  def unit[L](): fpDashTsLib.libHKTMod.Type2[F, L, scala.Unit]
}

object Monoidal2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    mult: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Tuple2[js.Any, js.Any]]
    ],
    unit: js.Function0[fpDashTsLib.libHKTMod.Type2[F, js.Any, scala.Unit]]
  ): Monoidal2[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("mult")(mult)
    __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Monoidal2[F]]
  }
}

