package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableApply[F] extends PipeableFunctor[F] {
  def ap[A](fa: fpDashTsLib.libHKTMod.HKT[F, A]): js.Function1[
    /* fab */ fpDashTsLib.libHKTMod.HKT[F, js.Function1[/* a */ A, _]], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ]
  def apFirst[B](fb: fpDashTsLib.libHKTMod.HKT[F, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libHKTMod.HKT[F, _]]
  def apSecond[B](fb: fpDashTsLib.libHKTMod.HKT[F, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libHKTMod.HKT[F, B]]
}

object PipeableApply {
  @scala.inline
  def apply[F](
    ap: fpDashTsLib.libHKTMod.HKT[F, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.libHKTMod.HKT[F, js.Function1[js.Any, _]], 
      fpDashTsLib.libHKTMod.HKT[F, _]
    ],
    apFirst: fpDashTsLib.libHKTMod.HKT[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libHKTMod.HKT[F, _]],
    apSecond: fpDashTsLib.libHKTMod.HKT[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libHKTMod.HKT[F, js.Any]],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ]
  ): PipeableApply[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableApply[F]]
  }
}

