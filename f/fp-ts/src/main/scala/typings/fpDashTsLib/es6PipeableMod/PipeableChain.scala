package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableChain[F] extends PipeableApply[F] {
  def chain[A, B](f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.HKT[F, B]]): js.Function1[/* ma */ fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, B]]
  def chainFirst[A, B](f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.HKT[F, B]]): js.Function1[/* ma */ fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, A]]
  def flatten[A](mma: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[F, A]]): fpDashTsLib.es6HKTMod.HKT[F, A]
}

object PipeableChain {
  @scala.inline
  def apply[F](
    ap: fpDashTsLib.es6HKTMod.HKT[F, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.es6HKTMod.HKT[F, js.Function1[js.Any, _]], 
      fpDashTsLib.es6HKTMod.HKT[F, _]
    ],
    apFirst: fpDashTsLib.es6HKTMod.HKT[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], fpDashTsLib.es6HKTMod.HKT[F, _]],
    apSecond: fpDashTsLib.es6HKTMod.HKT[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], fpDashTsLib.es6HKTMod.HKT[F, js.Any]],
    chain: js.Function1[js.Any, fpDashTsLib.es6HKTMod.HKT[F, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], 
      fpDashTsLib.es6HKTMod.HKT[F, js.Any]
    ],
    chainFirst: js.Function1[js.Any, fpDashTsLib.es6HKTMod.HKT[F, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], 
      fpDashTsLib.es6HKTMod.HKT[F, js.Any]
    ],
    flatten: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[F, js.Any]] => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], 
      fpDashTsLib.es6HKTMod.HKT[F, js.Any]
    ]
  ): PipeableChain[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), chain = js.Any.fromFunction1(chain), chainFirst = js.Any.fromFunction1(chainFirst), flatten = js.Any.fromFunction1(flatten), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableChain[F]]
  }
}

