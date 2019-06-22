package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableBifunctor4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  def bimap[L, A, M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, L, A], 
    fpDashTsLib.libHKTMod.Kind4[F, _, _, M, B]
  ]
  def mapLeft[L, A, M](f: js.Function1[/* l */ L, M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, L, A], 
    fpDashTsLib.libHKTMod.Kind4[F, _, _, M, A]
  ]
}

object PipeableBifunctor4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    bimap: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind4[F, _, _, js.Any, js.Any]
    ],
    mapLeft: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind4[F, _, _, js.Any, js.Any]
    ]
  ): PipeableBifunctor4[F] = {
    val __obj = js.Dynamic.literal(bimap = js.Any.fromFunction2(bimap), mapLeft = js.Any.fromFunction1(mapLeft))
  
    __obj.asInstanceOf[PipeableBifunctor4[F]]
  }
}

