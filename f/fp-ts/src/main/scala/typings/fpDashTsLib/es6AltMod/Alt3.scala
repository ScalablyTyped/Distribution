package typings
package fpDashTsLib.es6AltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6FunctorMod.Functor3[F] {
  def alt[U, L, A](fx: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], fy: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]): fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]
}

object Alt3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    alt: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): Alt3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Alt3[F]]
  }
}

