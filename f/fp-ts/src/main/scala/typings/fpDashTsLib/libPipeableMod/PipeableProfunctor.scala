package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableProfunctor[F] extends js.Object {
  def map[L, A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT2[F, L, A], fpDashTsLib.libHKTMod.HKT2[F, L, B]]
  def promap[A, B, C, D](f: js.Function1[/* a */ A, B], g: js.Function1[/* c */ C, D]): js.Function1[/* fbc */ fpDashTsLib.libHKTMod.HKT2[F, B, C], fpDashTsLib.libHKTMod.HKT2[F, A, D]]
}

object PipeableProfunctor {
  @scala.inline
  def apply[F](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]
    ],
    promap: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
      /* fbc */ fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]
    ]
  ): PipeableProfunctor[F] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), promap = js.Any.fromFunction2(promap))
  
    __obj.asInstanceOf[PipeableProfunctor[F]]
  }
}

