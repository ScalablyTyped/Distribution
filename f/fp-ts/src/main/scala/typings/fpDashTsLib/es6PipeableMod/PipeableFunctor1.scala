package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFunctor1[F /* <: fpDashTsLib.es6HKTMod.URIS */] extends js.Object {
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, A], fpDashTsLib.es6HKTMod.Kind[F, B]]
}

object PipeableFunctor1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], 
      fpDashTsLib.es6HKTMod.Kind[F, js.Any]
    ]
  ): PipeableFunctor1[F] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableFunctor1[F]]
  }
}

