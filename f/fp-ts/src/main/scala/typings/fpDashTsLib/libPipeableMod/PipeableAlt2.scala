package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableAlt2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def alt[L, A](that: js.Function0[fpDashTsLib.libHKTMod.Kind2[F, L, A]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, A], 
    fpDashTsLib.libHKTMod.Kind2[F, L, A]
  ]
}

object PipeableAlt2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    alt: js.Function0[fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
    ]
  ): PipeableAlt2[F] = {
    val __obj = js.Dynamic.literal(alt = js.Any.fromFunction1(alt))
  
    __obj.asInstanceOf[PipeableAlt2[F]]
  }
}

