package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableApply[F] extends PipeableFunctor[F] {
  def ap[A](fa: fpDashTsLib.es6HKTMod.HKT[F, A]): js.Function1[
    /* fab */ fpDashTsLib.es6HKTMod.HKT[F, js.Function1[/* a */ A, _]], 
    fpDashTsLib.es6HKTMod.HKT[F, _]
  ]
  def apFirst[B](fb: fpDashTsLib.es6HKTMod.HKT[F, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], fpDashTsLib.es6HKTMod.HKT[F, _]]
  def apSecond[B](fb: fpDashTsLib.es6HKTMod.HKT[F, B]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], fpDashTsLib.es6HKTMod.HKT[F, B]]
}

object PipeableApply {
  @scala.inline
  def apply[F](
    ap: fpDashTsLib.es6HKTMod.HKT[F, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.es6HKTMod.HKT[F, js.Function1[js.Any, _]], 
      fpDashTsLib.es6HKTMod.HKT[F, _]
    ],
    apFirst: fpDashTsLib.es6HKTMod.HKT[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], fpDashTsLib.es6HKTMod.HKT[F, _]],
    apSecond: fpDashTsLib.es6HKTMod.HKT[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], fpDashTsLib.es6HKTMod.HKT[F, js.Any]],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], 
      fpDashTsLib.es6HKTMod.HKT[F, js.Any]
    ]
  ): PipeableApply[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableApply[F]]
  }
}

