package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableChain1[F /* <: fpDashTsLib.es6HKTMod.URIS */] extends PipeableApply1[F] {
  def chain[A, B](f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Kind[F, B]]): js.Function1[/* ma */ fpDashTsLib.es6HKTMod.Kind[F, A], fpDashTsLib.es6HKTMod.Kind[F, B]]
  def chainFirst[A, B](f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Kind[F, B]]): js.Function1[/* ma */ fpDashTsLib.es6HKTMod.Kind[F, A], fpDashTsLib.es6HKTMod.Kind[F, A]]
  def flatten[A](mma: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[F, A]]): fpDashTsLib.es6HKTMod.Kind[F, A]
}

object PipeableChain1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    ap: fpDashTsLib.es6HKTMod.Kind[F, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.es6HKTMod.Kind[F, js.Function1[js.Any, _]], 
      fpDashTsLib.es6HKTMod.Kind[F, _]
    ],
    apFirst: fpDashTsLib.es6HKTMod.Kind[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], fpDashTsLib.es6HKTMod.Kind[F, _]],
    apSecond: fpDashTsLib.es6HKTMod.Kind[F, js.Any] => js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], fpDashTsLib.es6HKTMod.Kind[F, js.Any]],
    chain: js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind[F, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], 
      fpDashTsLib.es6HKTMod.Kind[F, js.Any]
    ],
    chainFirst: js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind[F, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], 
      fpDashTsLib.es6HKTMod.Kind[F, js.Any]
    ],
    flatten: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[F, js.Any]] => fpDashTsLib.es6HKTMod.Kind[F, js.Any],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], 
      fpDashTsLib.es6HKTMod.Kind[F, js.Any]
    ]
  ): PipeableChain1[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), chain = js.Any.fromFunction1(chain), chainFirst = js.Any.fromFunction1(chainFirst), flatten = js.Any.fromFunction1(flatten), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableChain1[F]]
  }
}

