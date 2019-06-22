package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableChain2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends PipeableApply2C[F, L] {
  def chain[A, B](f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Kind2[F, L, B]]): js.Function1[
    /* ma */ fpDashTsLib.es6HKTMod.Kind2[F, L, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, B]
  ]
  def chainFirst[A, B](f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Kind2[F, L, B]]): js.Function1[
    /* ma */ fpDashTsLib.es6HKTMod.Kind2[F, L, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, A]
  ]
  def flatten[A](mma: fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6HKTMod.Kind2[F, L, A]]): fpDashTsLib.es6HKTMod.Kind2[F, L, A]
}

object PipeableChain2C {
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
    chain: js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
    ],
    chainFirst: js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
    ],
    flatten: fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]] => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
    ]
  ): PipeableChain2C[F, L] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), chain = js.Any.fromFunction1(chain), chainFirst = js.Any.fromFunction1(chainFirst), flatten = js.Any.fromFunction1(flatten), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableChain2C[F, L]]
  }
}

