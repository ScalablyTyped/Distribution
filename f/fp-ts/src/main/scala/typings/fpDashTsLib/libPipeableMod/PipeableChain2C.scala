package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableChain2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends PipeableApply2C[F, L] {
  def chain[A, B](f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind2[F, L, B]]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind2[F, L, A], 
    fpDashTsLib.libHKTMod.Kind2[F, L, B]
  ]
  def chainFirst[A, B](f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind2[F, L, B]]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind2[F, L, A], 
    fpDashTsLib.libHKTMod.Kind2[F, L, A]
  ]
  def flatten[A](mma: fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind2[F, L, A]]): fpDashTsLib.libHKTMod.Kind2[F, L, A]
}

object PipeableChain2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    ap: fpDashTsLib.libHKTMod.Kind2[F, L, js.Any] => js.Function1[
      /* fab */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Function1[js.Any, _]], 
      fpDashTsLib.libHKTMod.Kind2[F, L, _]
    ],
    apFirst: fpDashTsLib.libHKTMod.Kind2[F, L, js.Any] => js.Function1[
      /* fb */ fpDashTsLib.libHKTMod.Kind2[F, L, _], 
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
    ],
    apSecond: fpDashTsLib.libHKTMod.Kind2[F, L, js.Any] => js.Function1[
      /* fb */ fpDashTsLib.libHKTMod.Kind2[F, L, _], 
      fpDashTsLib.libHKTMod.Kind2[F, L, _]
    ],
    chain: js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
    ],
    chainFirst: js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
    ],
    flatten: fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]] => fpDashTsLib.libHKTMod.Kind2[F, L, js.Any],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
    ]
  ): PipeableChain2C[F, L] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), chain = js.Any.fromFunction1(chain), chainFirst = js.Any.fromFunction1(chainFirst), flatten = js.Any.fromFunction1(flatten), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableChain2C[F, L]]
  }
}

