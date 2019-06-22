package typings
package fpDashTsLib.es6ApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6FunctorMod.Functor2[F] {
  def ap[L, A, B](
    fab: fpDashTsLib.es6HKTMod.Kind2[F, L, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A]
  ): fpDashTsLib.es6HKTMod.Kind2[F, L, B]
}

object Apply2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]
  ): Apply2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply2[F]]
  }
}

