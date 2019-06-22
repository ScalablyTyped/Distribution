package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableBifunctor[F] extends js.Object {
  def bimap[L, A, M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT2[F, L, A], fpDashTsLib.libHKTMod.HKT2[F, M, B]]
  def mapLeft[L, A, M](f: js.Function1[/* l */ L, M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT2[F, L, A], fpDashTsLib.libHKTMod.HKT2[F, M, A]]
}

object PipeableBifunctor {
  @scala.inline
  def apply[F](
    bimap: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]
    ],
    mapLeft: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]
    ]
  ): PipeableBifunctor[F] = {
    val __obj = js.Dynamic.literal(bimap = js.Any.fromFunction2(bimap), mapLeft = js.Any.fromFunction1(mapLeft))
  
    __obj.asInstanceOf[PipeableBifunctor[F]]
  }
}

