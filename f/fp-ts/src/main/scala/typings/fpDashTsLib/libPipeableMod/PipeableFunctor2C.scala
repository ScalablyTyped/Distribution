package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFunctor2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends js.Object {
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, A], 
    fpDashTsLib.libHKTMod.Kind2[F, L, B]
  ]
}

object PipeableFunctor2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
    ]
  ): PipeableFunctor2C[F, L] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableFunctor2C[F, L]]
  }
}

