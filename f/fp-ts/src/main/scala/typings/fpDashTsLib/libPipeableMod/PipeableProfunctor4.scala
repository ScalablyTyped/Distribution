package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableProfunctor4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends PipeableFunctor4[F] {
  def promap[X, U, A, B, C, D](f: js.Function1[/* a */ A, B], g: js.Function1[/* c */ C, D]): js.Function1[
    /* fbc */ fpDashTsLib.libHKTMod.Kind4[F, X, U, B, C], 
    fpDashTsLib.libHKTMod.Kind4[F, X, U, A, D]
  ]
}

object PipeableProfunctor4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, js.Any]
    ],
    promap: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
      /* fbc */ fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ]
  ): PipeableProfunctor4[F] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), promap = js.Any.fromFunction2(promap))
  
    __obj.asInstanceOf[PipeableProfunctor4[F]]
  }
}

