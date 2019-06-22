package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.Functor2[F] {
  def mult[L, A, B](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], fb: fpDashTsLib.libHKTMod.Kind2[F, L, B]): fpDashTsLib.libHKTMod.Kind2[F, L, js.Tuple2[A, B]]
  def unit[L](): fpDashTsLib.libHKTMod.Kind2[F, L, scala.Unit]
}

object Monoidal2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    map: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any],
    mult: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Tuple2[js.Any, js.Any]],
    unit: () => fpDashTsLib.libHKTMod.Kind2[F, js.Any, scala.Unit]
  ): Monoidal2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mult = js.Any.fromFunction2(mult), unit = js.Any.fromFunction0(unit))
  
    __obj.asInstanceOf[Monoidal2[F]]
  }
}

