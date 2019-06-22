package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFunctorWithIndex[F, I] extends PipeableFunctor[F] {
  def mapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, B]]
}

object PipeableFunctorWithIndex {
  @scala.inline
  def apply[F, I](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], 
      fpDashTsLib.es6HKTMod.HKT[F, js.Any]
    ],
    mapWithIndex: js.Function2[/* i */ I, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], 
      fpDashTsLib.es6HKTMod.HKT[F, js.Any]
    ]
  ): PipeableFunctorWithIndex[F, I] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), mapWithIndex = js.Any.fromFunction1(mapWithIndex))
  
    __obj.asInstanceOf[PipeableFunctorWithIndex[F, I]]
  }
}

