package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableApply3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends PipeableFunctor3[F] {
  def ap[U, L, A](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A]): js.Function1[
    /* fab */ fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Function1[/* a */ A, _]], 
    fpDashTsLib.libHKTMod.Kind3[F, U, L, _]
  ]
  def apFirst[U, L, B](fb: fpDashTsLib.libHKTMod.Kind3[F, U, L, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, U, L, _], 
    fpDashTsLib.libHKTMod.Kind3[F, U, L, _]
  ]
  def apSecond[U, L, B](fb: fpDashTsLib.libHKTMod.Kind3[F, U, L, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, U, L, _], 
    fpDashTsLib.libHKTMod.Kind3[F, U, L, B]
  ]
}

object PipeableApply3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    ap: fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Function1[js.Any, _]], 
      fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, _]
    ],
    apFirst: fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, _], 
      fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, _]
    ],
    apSecond: fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, _], 
      fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any]
    ]
  ): PipeableApply3[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableApply3[F]]
  }
}

