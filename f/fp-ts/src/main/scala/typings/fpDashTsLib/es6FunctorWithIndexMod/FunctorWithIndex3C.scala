package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex3C[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, I, U, L]
  extends fpDashTsLib.es6FunctorMod.Functor3C[F, U, L] {
  def mapWithIndex[A, B](fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]
}

object FunctorWithIndex3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, I, U, L](
    URI: F,
    _L: L,
    _U: U,
    map: (fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any],
    mapWithIndex: (fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any], js.Function2[/* i */ I, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any]
  ): FunctorWithIndex3C[F, I, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndex3C[F, I, U, L]]
  }
}

