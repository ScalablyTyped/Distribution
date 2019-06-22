package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFunctor[F] extends js.Object {
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, B]]
}

object PipeableFunctor {
  @scala.inline
  def apply[F](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], 
      fpDashTsLib.es6HKTMod.HKT[F, js.Any]
    ]
  ): PipeableFunctor[F] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableFunctor[F]]
  }
}

