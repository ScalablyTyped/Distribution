package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, I, L]
  extends fpDashTsLib.es6FunctorMod.Functor2C[F, L] {
  def mapWithIndex[A, B](fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.es6HKTMod.Kind2[F, L, B]
}

object FunctorWithIndex2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, I, L](
    URI: F,
    _L: L,
    map: (fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any],
    mapWithIndex: (fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], js.Function2[/* i */ I, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
  ): FunctorWithIndex2C[F, I, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndex2C[F, I, L]]
  }
}

