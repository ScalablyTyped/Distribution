package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableApply1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends PipeableFunctor1[F] {
  def ap[A](fa: fpDashTsLib.libHKTMod.Kind[F, A]): js.Function1[
    /* fab */ fpDashTsLib.libHKTMod.Kind[F, js.Function1[/* a */ A, _]], 
    fpDashTsLib.libHKTMod.Kind[F, _]
  ]
  def apFirst[B](fb: fpDashTsLib.libHKTMod.Kind[F, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, _], fpDashTsLib.libHKTMod.Kind[F, _]]
  def apSecond[B](fb: fpDashTsLib.libHKTMod.Kind[F, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, _], fpDashTsLib.libHKTMod.Kind[F, B]]
}

object PipeableApply1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    ap: fpDashTsLib.libHKTMod.Kind[F, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.libHKTMod.Kind[F, js.Function1[js.Any, _]], 
      fpDashTsLib.libHKTMod.Kind[F, _]
    ],
    apFirst: fpDashTsLib.libHKTMod.Kind[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, _], fpDashTsLib.libHKTMod.Kind[F, _]],
    apSecond: fpDashTsLib.libHKTMod.Kind[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, _], fpDashTsLib.libHKTMod.Kind[F, js.Any]],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[F, js.Any], 
      fpDashTsLib.libHKTMod.Kind[F, js.Any]
    ]
  ): PipeableApply1[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableApply1[F]]
  }
}

