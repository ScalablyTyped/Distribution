package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableChain4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */] extends PipeableApply4[F] {
  def chain[X, U, L, A, B](f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]]): js.Function1[
    /* ma */ fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]
  ]
  def chainFirst[X, U, L, A, B](f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]]): js.Function1[
    /* ma */ fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]
  ]
  def flatten[X, U, L, A](mma: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]]): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]
}

object PipeableChain4 {
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
    chain: js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ],
    chainFirst: js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ],
    flatten: fpDashTsLib.es6HKTMod.Kind4[
      F, 
      js.Any, 
      js.Any, 
      js.Any, 
      fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ] => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind4[F, _, _, _, js.Any], 
      fpDashTsLib.es6HKTMod.Kind4[F, _, _, _, js.Any]
    ]
  ): PipeableChain4[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), chain = js.Any.fromFunction1(chain), chainFirst = js.Any.fromFunction1(chainFirst), flatten = js.Any.fromFunction1(flatten), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableChain4[F]]
  }
}

