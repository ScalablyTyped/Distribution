package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableBifunctor3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def bimap[L, A, M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, L, A], 
    fpDashTsLib.libHKTMod.Kind3[F, _, M, B]
  ]
  def mapLeft[L, A, M](f: js.Function1[/* l */ L, M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, L, A], 
    fpDashTsLib.libHKTMod.Kind3[F, _, M, A]
  ]
}

object PipeableBifunctor3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    bimap: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind3[F, _, js.Any, js.Any]
    ],
    mapLeft: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind3[F, _, js.Any, js.Any]
    ]
  ): PipeableBifunctor3[F] = {
    val __obj = js.Dynamic.literal(bimap = js.Any.fromFunction2(bimap), mapLeft = js.Any.fromFunction1(mapLeft))
  
    __obj.asInstanceOf[PipeableBifunctor3[F]]
  }
}

