package typings
package fpDashTsLib.es6ApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L]
  extends fpDashTsLib.es6ApplyMod.Apply2C[F, L] {
  def of[A](a: A): fpDashTsLib.es6HKTMod.Type2[F, L, A]
}

object Applicative2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    ap: (fpDashTsLib.es6HKTMod.Type2[F, L, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type2[F, L, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, L, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, L, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Type2[F, L, js.Any]
  ): Applicative2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Applicative2C[F, L]]
  }
}

