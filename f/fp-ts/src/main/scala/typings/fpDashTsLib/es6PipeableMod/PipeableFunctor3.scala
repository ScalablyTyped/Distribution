package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFunctor3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends js.Object {
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.es6HKTMod.Kind3[F, _, _, B]
  ]
}

object PipeableFunctor3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, _, _, js.Any], 
      fpDashTsLib.es6HKTMod.Kind3[F, _, _, js.Any]
    ]
  ): PipeableFunctor3[F] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableFunctor3[F]]
  }
}

