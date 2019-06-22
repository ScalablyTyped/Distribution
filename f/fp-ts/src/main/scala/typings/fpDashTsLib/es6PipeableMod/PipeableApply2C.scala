package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableApply2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends PipeableFunctor2C[F, L] {
  def ap[A](fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A]): js.Function1[
    /* fab */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Function1[/* a */ A, _]], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, _]
  ]
  def apFirst[A](fb: fpDashTsLib.es6HKTMod.Kind2[F, L, A]): js.Function1[
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[F, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, A]
  ]
  def apSecond[A](fb: fpDashTsLib.es6HKTMod.Kind2[F, L, A]): js.Function1[
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[F, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, _]
  ]
}

object PipeableApply2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    ap: fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Function1[js.Any, _]], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, _]
    ],
    apFirst: fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any] => js.Function1[
      /* fb */ fpDashTsLib.es6HKTMod.Kind2[F, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
    ],
    apSecond: fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any] => js.Function1[
      /* fb */ fpDashTsLib.es6HKTMod.Kind2[F, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, _]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
    ]
  ): PipeableApply2C[F, L] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableApply2C[F, L]]
  }
}

