package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFunctor2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends js.Object {
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, _, B]
  ]
}

object PipeableFunctor2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, _, js.Any]
    ]
  ): PipeableFunctor2[F] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableFunctor2[F]]
  }
}

