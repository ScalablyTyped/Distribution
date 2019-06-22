package typings
package fpDashTsLib.es6AltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L]
  extends fpDashTsLib.es6FunctorMod.Functor2C[F, L] {
  def alt[A](fx: fpDashTsLib.es6HKTMod.Kind2[F, L, A], fy: fpDashTsLib.es6HKTMod.Kind2[F, L, A]): fpDashTsLib.es6HKTMod.Kind2[F, L, A]
}

object Alt2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    alt: (fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
  ): Alt2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Alt2C[F, L]]
  }
}

