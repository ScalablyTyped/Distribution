package typings
package fpDashTsLib.es6ApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative3C[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L]
  extends fpDashTsLib.es6ApplyMod.Apply3C[F, U, L] {
  def of[A](a: A): fpDashTsLib.es6HKTMod.Type3[F, U, L, A]
}

object Applicative3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    ap: (fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Type3[F, U, L, js.Any]
  ): Applicative3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Applicative3C[F, U, L]]
  }
}

