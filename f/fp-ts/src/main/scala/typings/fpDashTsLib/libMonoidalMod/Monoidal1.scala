package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.Functor1[F] {
  def mult[A, B](fa: fpDashTsLib.libHKTMod.Kind[F, A], fb: fpDashTsLib.libHKTMod.Kind[F, B]): fpDashTsLib.libHKTMod.Kind[F, js.Tuple2[A, B]]
  def unit(): fpDashTsLib.libHKTMod.Kind[F, scala.Unit]
}

object Monoidal1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    map: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    mult: (fpDashTsLib.libHKTMod.Kind[F, js.Any], fpDashTsLib.libHKTMod.Kind[F, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Tuple2[js.Any, js.Any]],
    unit: () => fpDashTsLib.libHKTMod.Kind[F, scala.Unit]
  ): Monoidal1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mult = js.Any.fromFunction2(mult), unit = js.Any.fromFunction0(unit))
  
    __obj.asInstanceOf[Monoidal1[F]]
  }
}

