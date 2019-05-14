package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex1[F /* <: fpDashTsLib.es6HKTMod.URIS */, I]
  extends fpDashTsLib.es6FunctorMod.Functor1[F] {
  def mapWithIndex[A, B](fa: fpDashTsLib.es6HKTMod.Type[F, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.es6HKTMod.Type[F, B]
}

object FunctorWithIndex1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, I](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.Type[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    mapWithIndex: (fpDashTsLib.es6HKTMod.Type[F, js.Any], js.Function2[/* i */ I, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any]
  ): FunctorWithIndex1[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndex1[F, I]]
  }
}

