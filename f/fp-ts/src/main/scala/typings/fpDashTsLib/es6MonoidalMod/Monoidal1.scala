package typings
package fpDashTsLib.es6MonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6FunctorMod.Functor1[F] {
  def mult[A, B](fa: fpDashTsLib.es6HKTMod.Kind[F, A], fb: fpDashTsLib.es6HKTMod.Kind[F, B]): fpDashTsLib.es6HKTMod.Kind[F, js.Tuple2[A, B]]
  def unit(): fpDashTsLib.es6HKTMod.Kind[F, scala.Unit]
}

object Monoidal1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any],
    mult: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], fpDashTsLib.es6HKTMod.Kind[F, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Tuple2[js.Any, js.Any]],
    unit: () => fpDashTsLib.es6HKTMod.Kind[F, scala.Unit]
  ): Monoidal1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mult = js.Any.fromFunction2(mult), unit = js.Any.fromFunction0(unit))
  
    __obj.asInstanceOf[Monoidal1[F]]
  }
}

