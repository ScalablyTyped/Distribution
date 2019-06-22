package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableProfunctor2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends PipeableFunctor2C[F, L] {
  def promap[A, C, D](f: js.Function1[/* a */ A, L], g: js.Function1[/* c */ C, D]): js.Function1[
    /* flc */ fpDashTsLib.es6HKTMod.Kind2[F, L, C], 
    fpDashTsLib.es6HKTMod.Kind2[F, A, D]
  ]
}

object PipeableProfunctor2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
    ],
    promap: (js.Function1[js.Any, L], js.Function1[js.Any, js.Any]) => js.Function1[
      /* flc */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]
    ]
  ): PipeableProfunctor2C[F, L] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), promap = js.Any.fromFunction2(promap))
  
    __obj.asInstanceOf[PipeableProfunctor2C[F, L]]
  }
}

