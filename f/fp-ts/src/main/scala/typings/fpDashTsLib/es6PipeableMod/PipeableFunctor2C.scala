package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFunctor2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends js.Object {
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, B]
  ]
}

object PipeableFunctor2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
    ]
  ): PipeableFunctor2C[F, L] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableFunctor2C[F, L]]
  }
}

