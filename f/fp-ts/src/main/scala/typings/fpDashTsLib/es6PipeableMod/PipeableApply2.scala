package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableApply2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends PipeableFunctor2[F] {
  def ap[L, A](fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A]): js.Function1[
    /* fab */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Function1[/* a */ A, _]], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, _]
  ]
  def apFirst[L, B](fb: fpDashTsLib.es6HKTMod.Kind2[F, L, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, _]
  ]
  def apSecond[L, B](fb: fpDashTsLib.es6HKTMod.Kind2[F, L, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, B]
  ]
}

object PipeableApply2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    ap: fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Function1[js.Any, _]], 
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, _]
    ],
    apFirst: fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, js.Any, _], 
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, _]
    ],
    apSecond: fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, js.Any, _], 
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, _, js.Any]
    ]
  ): PipeableApply2[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableApply2[F]]
  }
}

