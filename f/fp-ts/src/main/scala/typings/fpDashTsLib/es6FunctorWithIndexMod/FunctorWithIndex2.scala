package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, I]
  extends fpDashTsLib.es6FunctorMod.Functor2[F] {
  def mapWithIndex[L, A, B](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.es6HKTMod.Type2[F, L, B]
}

object FunctorWithIndex2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, I](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    mapWithIndex: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], js.Function2[/* i */ I, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]
  ): FunctorWithIndex2[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndex2[F, I]]
  }
}

