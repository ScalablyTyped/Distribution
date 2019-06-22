package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableSemigroupoid3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def compose[U, L, A](la: fpDashTsLib.libHKTMod.Kind3[F, U, L, A]): js.Function1[
    /* ab */ fpDashTsLib.libHKTMod.Kind3[F, U, A, _], 
    fpDashTsLib.libHKTMod.Kind3[F, U, L, _]
  ]
}

object PipeableSemigroupoid3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    compose: fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any] => js.Function1[
      /* ab */ fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, _], 
      fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, _]
    ]
  ): PipeableSemigroupoid3[F] = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
  
    __obj.asInstanceOf[PipeableSemigroupoid3[F]]
  }
}

