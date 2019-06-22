package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableAlt3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def alt[U, L, A](that: js.Function0[fpDashTsLib.libHKTMod.Kind3[F, U, L, A]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, U, L, A], 
    fpDashTsLib.libHKTMod.Kind3[F, U, L, A]
  ]
}

object PipeableAlt3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    alt: js.Function0[fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]
    ]
  ): PipeableAlt3[F] = {
    val __obj = js.Dynamic.literal(alt = js.Any.fromFunction1(alt))
  
    __obj.asInstanceOf[PipeableAlt3[F]]
  }
}

