package typings
package fpDashTsLib.es6AltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */]
  extends fpDashTsLib.es6FunctorMod.Functor4[F] {
  def alt[X, U, L, A](
    fx: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A],
    fy: js.Function0[fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]]
  ): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]
}

object Alt4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    URI: F,
    alt: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function0[fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Alt4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Alt4[F]]
  }
}

