package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableProfunctor2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends PipeableFunctor2C[F, L] {
  def promap[A, C, D](f: js.Function1[/* a */ A, L], g: js.Function1[/* c */ C, D]): js.Function1[
    /* flc */ fpDashTsLib.libHKTMod.Kind2[F, L, C], 
    fpDashTsLib.libHKTMod.Kind2[F, A, D]
  ]
}

object PipeableProfunctor2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
    ],
    promap: (js.Function1[js.Any, L], js.Function1[js.Any, js.Any]) => js.Function1[
      /* flc */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
    ]
  ): PipeableProfunctor2C[F, L] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), promap = js.Any.fromFunction2(promap))
  
    __obj.asInstanceOf[PipeableProfunctor2C[F, L]]
  }
}

