package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */, I]
  extends fpDashTsLib.es6FunctorMod.Functor4[F] {
  def mapWithIndex[X, U, L, A, B](fa: fpDashTsLib.es6HKTMod.Type4[F, X, U, L, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.es6HKTMod.Type4[F, X, U, L, B]
}

object FunctorWithIndex4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */, I](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any],
    mapWithIndex: (fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], js.Function2[/* i */ I, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any]
  ): FunctorWithIndex4[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndex4[F, I]]
  }
}

