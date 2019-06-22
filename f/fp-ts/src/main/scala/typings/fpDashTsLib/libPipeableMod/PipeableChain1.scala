package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableChain1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends PipeableApply1[F] {
  def chain[A, B](f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind[F, B]]): js.Function1[/* ma */ fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, B]]
  def chainFirst[A, B](f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind[F, B]]): js.Function1[/* ma */ fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, A]]
  def flatten[A](mma: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[F, A]]): fpDashTsLib.libHKTMod.Kind[F, A]
}

object PipeableChain1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    ap: fpDashTsLib.libHKTMod.Kind[F, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.libHKTMod.Kind[F, js.Function1[js.Any, _]], 
      fpDashTsLib.libHKTMod.Kind[F, _]
    ],
    apFirst: fpDashTsLib.libHKTMod.Kind[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, _], fpDashTsLib.libHKTMod.Kind[F, _]],
    apSecond: fpDashTsLib.libHKTMod.Kind[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, _], fpDashTsLib.libHKTMod.Kind[F, js.Any]],
    chain: js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[F, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.Kind[F, js.Any], 
      fpDashTsLib.libHKTMod.Kind[F, js.Any]
    ],
    chainFirst: js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[F, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.Kind[F, js.Any], 
      fpDashTsLib.libHKTMod.Kind[F, js.Any]
    ],
    flatten: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[F, js.Any]] => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[F, js.Any], 
      fpDashTsLib.libHKTMod.Kind[F, js.Any]
    ]
  ): PipeableChain1[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), chain = js.Any.fromFunction1(chain), chainFirst = js.Any.fromFunction1(chainFirst), flatten = js.Any.fromFunction1(flatten), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableChain1[F]]
  }
}

