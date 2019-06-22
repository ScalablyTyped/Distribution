package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableApply1[F /* <: fpDashTsLib.es6HKTMod.URIS */] extends PipeableFunctor1[F] {
  def ap[A](fa: fpDashTsLib.es6HKTMod.Kind[F, A]): js.Function1[
    /* fab */ fpDashTsLib.es6HKTMod.Kind[F, js.Function1[/* a */ A, _]], 
    fpDashTsLib.es6HKTMod.Kind[F, _]
  ]
  def apFirst[B](fb: fpDashTsLib.es6HKTMod.Kind[F, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], fpDashTsLib.es6HKTMod.Kind[F, _]]
  def apSecond[B](fb: fpDashTsLib.es6HKTMod.Kind[F, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], fpDashTsLib.es6HKTMod.Kind[F, B]]
}

object PipeableApply1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    ap: fpDashTsLib.es6HKTMod.Kind[F, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.es6HKTMod.Kind[F, js.Function1[js.Any, _]], 
      fpDashTsLib.es6HKTMod.Kind[F, _]
    ],
    apFirst: fpDashTsLib.es6HKTMod.Kind[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], fpDashTsLib.es6HKTMod.Kind[F, _]],
    apSecond: fpDashTsLib.es6HKTMod.Kind[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], fpDashTsLib.es6HKTMod.Kind[F, js.Any]],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], 
      fpDashTsLib.es6HKTMod.Kind[F, js.Any]
    ]
  ): PipeableApply1[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableApply1[F]]
  }
}

