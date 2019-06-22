package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableChain2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends PipeableApply2[F] {
  def chain[L, A, B](f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Kind2[F, L, B]]): js.Function1[
    /* ma */ fpDashTsLib.es6HKTMod.Kind2[F, L, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, B]
  ]
  def chainFirst[L, A, B](f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Kind2[F, L, B]]): js.Function1[
    /* ma */ fpDashTsLib.es6HKTMod.Kind2[F, L, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, A]
  ]
  def flatten[L, A](mma: fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6HKTMod.Kind2[F, L, A]]): fpDashTsLib.es6HKTMod.Kind2[F, L, A]
}

object PipeableChain2 {
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
    chain: js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]
    ],
    chainFirst: js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]
    ],
    flatten: fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]] => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, _, js.Any]
    ]
  ): PipeableChain2[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), chain = js.Any.fromFunction1(chain), chainFirst = js.Any.fromFunction1(chainFirst), flatten = js.Any.fromFunction1(flatten), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableChain2[F]]
  }
}

