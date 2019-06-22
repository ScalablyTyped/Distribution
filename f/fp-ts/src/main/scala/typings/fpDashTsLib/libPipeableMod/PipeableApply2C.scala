package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableApply2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends PipeableFunctor2C[F, L] {
  def ap[A](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A]): js.Function1[
    /* fab */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Function1[/* a */ A, _]], 
    fpDashTsLib.libHKTMod.Kind2[F, L, _]
  ]
  def apFirst[A](fb: fpDashTsLib.libHKTMod.Kind2[F, L, A]): js.Function1[
    /* fb */ fpDashTsLib.libHKTMod.Kind2[F, L, _], 
    fpDashTsLib.libHKTMod.Kind2[F, L, A]
  ]
  def apSecond[A](fb: fpDashTsLib.libHKTMod.Kind2[F, L, A]): js.Function1[
    /* fb */ fpDashTsLib.libHKTMod.Kind2[F, L, _], 
    fpDashTsLib.libHKTMod.Kind2[F, L, _]
  ]
}

object PipeableApply2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    ap: fpDashTsLib.libHKTMod.Kind2[F, L, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Function1[js.Any, _]], 
      fpDashTsLib.libHKTMod.Kind2[F, L, _]
    ],
    apFirst: fpDashTsLib.libHKTMod.Kind2[F, L, js.Any] => js.Function1[
      /* fb */ fpDashTsLib.libHKTMod.Kind2[F, L, _], 
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
    ],
    apSecond: fpDashTsLib.libHKTMod.Kind2[F, L, js.Any] => js.Function1[
      /* fb */ fpDashTsLib.libHKTMod.Kind2[F, L, _], 
      fpDashTsLib.libHKTMod.Kind2[F, L, _]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
    ]
  ): PipeableApply2C[F, L] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableApply2C[F, L]]
  }
}

