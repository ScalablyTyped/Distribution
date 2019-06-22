package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableProfunctor3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends PipeableFunctor3[F] {
  def promap[U, A, B, C, D](f: js.Function1[/* a */ A, B], g: js.Function1[/* c */ C, D]): js.Function1[
    /* fbc */ fpDashTsLib.es6HKTMod.Kind3[F, U, B, C], 
    fpDashTsLib.es6HKTMod.Kind3[F, U, A, D]
  ]
}

object PipeableProfunctor3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, _, _, js.Any], 
      fpDashTsLib.es6HKTMod.Kind3[F, _, _, js.Any]
    ],
    promap: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
      /* fbc */ fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]
    ]
  ): PipeableProfunctor3[F] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), promap = js.Any.fromFunction2(promap))
  
    __obj.asInstanceOf[PipeableProfunctor3[F]]
  }
}

