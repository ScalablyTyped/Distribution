package typings
package fpDashTsLib.es6ApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6FunctorMod.Functor1[F] {
  def ap[A, B](
    fab: fpDashTsLib.es6HKTMod.Kind[F, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.es6HKTMod.Kind[F, A]
  ): fpDashTsLib.es6HKTMod.Kind[F, B]
}

object Apply1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Kind[F, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind[F, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any]
  ): Apply1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply1[F]]
  }
}

