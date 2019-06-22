package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableChain[F] extends PipeableApply[F] {
  def chain[A, B](f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[F, B]]): js.Function1[/* ma */ fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libHKTMod.HKT[F, B]]
  def chainFirst[A, B](f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[F, B]]): js.Function1[/* ma */ fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libHKTMod.HKT[F, A]]
  def flatten[A](mma: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[F, A]]): fpDashTsLib.libHKTMod.HKT[F, A]
}

object PipeableChain {
  @scala.inline
  def apply[F](
    ap: fpDashTsLib.libHKTMod.HKT[F, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.libHKTMod.HKT[F, js.Function1[js.Any, _]], 
      fpDashTsLib.libHKTMod.HKT[F, _]
    ],
    apFirst: fpDashTsLib.libHKTMod.HKT[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libHKTMod.HKT[F, _]],
    apSecond: fpDashTsLib.libHKTMod.HKT[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libHKTMod.HKT[F, js.Any]],
    chain: js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    chainFirst: js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    flatten: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[F, js.Any]] => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ]
  ): PipeableChain[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), chain = js.Any.fromFunction1(chain), chainFirst = js.Any.fromFunction1(chainFirst), flatten = js.Any.fromFunction1(flatten), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableChain[F]]
  }
}

