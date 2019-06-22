package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableApply4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */] extends PipeableFunctor4[F] {
  def ap[X, U, L, A](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]): js.Function1[
    /* fab */ fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, js.Function1[/* a */ A, _]], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, _]
  ]
  def apFirst[X, U, L, B](fb: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, _], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, _]
  ]
  def apSecond[X, U, L, B](fb: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, _], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]
  ]
}

object PipeableApply4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    ap: fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Function1[js.Any, _]], 
      fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, _]
    ],
    apFirst: fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, _], 
      fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, _]
    ],
    apSecond: fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, _], 
      fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind4[F, _, _, _, js.Any], 
      fpDashTsLib.es6HKTMod.Kind4[F, _, _, _, js.Any]
    ]
  ): PipeableApply4[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableApply4[F]]
  }
}

