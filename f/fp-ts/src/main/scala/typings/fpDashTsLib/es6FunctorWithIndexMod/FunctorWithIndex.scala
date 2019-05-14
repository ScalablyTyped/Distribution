package typings
package fpDashTsLib.es6FunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex[F, I]
  extends fpDashTsLib.es6FunctorMod.Functor[F] {
  def mapWithIndex[A, B](fa: fpDashTsLib.es6HKTMod.HKT[F, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.es6HKTMod.HKT[F, B]
}

object FunctorWithIndex {
  @scala.inline
  def apply[F, I](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    mapWithIndex: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function2[/* i */ I, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any]
  ): FunctorWithIndex[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndex[F, I]]
  }
}

