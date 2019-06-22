package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableApply2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends PipeableFunctor2[F] {
  def ap[L, A](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A]): js.Function1[
    /* fab */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Function1[/* a */ A, _]], 
    fpDashTsLib.libHKTMod.Kind2[F, L, _]
  ]
  def apFirst[L, B](fb: fpDashTsLib.libHKTMod.Kind2[F, L, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, _], 
    fpDashTsLib.libHKTMod.Kind2[F, L, _]
  ]
  def apSecond[L, B](fb: fpDashTsLib.libHKTMod.Kind2[F, L, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, _], 
    fpDashTsLib.libHKTMod.Kind2[F, L, B]
  ]
}

object PipeableApply2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    ap: fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Function1[js.Any, _]], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, _]
    ],
    apFirst: fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, _], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, _]
    ],
    apSecond: fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, _], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, _, js.Any]
    ]
  ): PipeableApply2[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableApply2[F]]
  }
}

