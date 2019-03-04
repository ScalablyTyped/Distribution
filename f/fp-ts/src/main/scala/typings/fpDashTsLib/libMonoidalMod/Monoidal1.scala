package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.Functor1[F] {
  def mult[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], fb: fpDashTsLib.libHKTMod.Type[F, B]): fpDashTsLib.libHKTMod.Type[F, js.Tuple2[A, B]]
  def unit(): fpDashTsLib.libHKTMod.Type[F, scala.Unit]
}

object Monoidal1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    mult: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Tuple2[js.Any, js.Any]]
    ],
    unit: js.Function0[fpDashTsLib.libHKTMod.Type[F, scala.Unit]]
  ): Monoidal1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = map, mult = mult, unit = unit)
  
    __obj.asInstanceOf[Monoidal1[F]]
  }
}

