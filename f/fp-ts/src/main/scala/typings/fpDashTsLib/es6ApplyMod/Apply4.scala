package typings
package fpDashTsLib.es6ApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */]
  extends fpDashTsLib.es6FunctorMod.Functor4[F] {
  def ap[X, U, L, A, B](
    fab: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]
  ): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]
}

object Apply4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Apply4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Apply4[F]]
  }
}

