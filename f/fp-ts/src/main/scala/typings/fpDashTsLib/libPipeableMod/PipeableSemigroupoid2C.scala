package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableSemigroupoid2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends js.Object {
  def compose[A](la: fpDashTsLib.libHKTMod.Kind2[F, L, A]): js.Function1[
    /* ab */ fpDashTsLib.libHKTMod.Kind2[F, A, _], 
    fpDashTsLib.libHKTMod.Kind2[F, L, _]
  ]
}

object PipeableSemigroupoid2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    compose: fpDashTsLib.libHKTMod.Kind2[F, L, js.Any] => js.Function1[
      /* ab */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, _], 
      fpDashTsLib.libHKTMod.Kind2[F, L, _]
    ]
  ): PipeableSemigroupoid2C[F, L] = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
  
    __obj.asInstanceOf[PipeableSemigroupoid2C[F, L]]
  }
}

