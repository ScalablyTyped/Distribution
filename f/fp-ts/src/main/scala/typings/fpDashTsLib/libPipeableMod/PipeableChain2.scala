package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableChain2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends PipeableApply2[F] {
  def chain[L, A, B](f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind2[F, L, B]]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind2[F, L, A], 
    fpDashTsLib.libHKTMod.Kind2[F, L, B]
  ]
  def chainFirst[L, A, B](f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind2[F, L, B]]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind2[F, L, A], 
    fpDashTsLib.libHKTMod.Kind2[F, L, A]
  ]
  def flatten[L, A](mma: fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind2[F, L, A]]): fpDashTsLib.libHKTMod.Kind2[F, L, A]
}

object PipeableChain2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    ap: fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Function1[js.Any, _]], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, _]
    ],
    apFirst: fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, _], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, _]
    ],
    apSecond: fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, _], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
    ],
    chain: js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
    ],
    chainFirst: js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
    ],
    flatten: fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]] => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, _, js.Any]
    ]
  ): PipeableChain2[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), chain = js.Any.fromFunction1(chain), chainFirst = js.Any.fromFunction1(chainFirst), flatten = js.Any.fromFunction1(flatten), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableChain2[F]]
  }
}

