package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableSemigroupoid2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def compose[L, A](la: fpDashTsLib.libHKTMod.Kind2[F, L, A]): js.Function1[
    /* ab */ fpDashTsLib.libHKTMod.Kind2[F, A, _], 
    fpDashTsLib.libHKTMod.Kind2[F, L, _]
  ]
}

object PipeableSemigroupoid2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    compose: fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any] => js.Function1[
      /* ab */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, _], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, _]
    ]
  ): PipeableSemigroupoid2[F] = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
  
    __obj.asInstanceOf[PipeableSemigroupoid2[F]]
  }
}

