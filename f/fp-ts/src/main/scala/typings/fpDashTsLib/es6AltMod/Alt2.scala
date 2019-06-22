package typings
package fpDashTsLib.es6AltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6FunctorMod.Functor2[F] {
  def alt[L, A](fx: fpDashTsLib.es6HKTMod.Kind2[F, L, A], fy: fpDashTsLib.es6HKTMod.Kind2[F, L, A]): fpDashTsLib.es6HKTMod.Kind2[F, L, A]
}

object Alt2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    alt: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]
  ): Alt2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Alt2[F]]
  }
}

