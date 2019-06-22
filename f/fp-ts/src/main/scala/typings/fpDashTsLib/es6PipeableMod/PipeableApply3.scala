package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableApply3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends PipeableFunctor3[F] {
  def ap[U, L, A](fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]): js.Function1[
    /* fab */ fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Function1[/* a */ A, _]], 
    fpDashTsLib.es6HKTMod.Kind3[F, U, L, _]
  ]
  def apFirst[U, L, B](fb: fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, U, L, _], 
    fpDashTsLib.es6HKTMod.Kind3[F, U, L, _]
  ]
  def apSecond[U, L, B](fb: fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, U, L, _], 
    fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]
  ]
}

object PipeableApply3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    ap: fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Function1[js.Any, _]], 
      fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, _]
    ],
    apFirst: fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, _], 
      fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, _]
    ],
    apSecond: fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, _], 
      fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, _, _, js.Any], 
      fpDashTsLib.es6HKTMod.Kind3[F, _, _, js.Any]
    ]
  ): PipeableApply3[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableApply3[F]]
  }
}

