package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableAlt4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  def alt[X, U, L, A](that: js.Function0[fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]
  ]
}

object PipeableAlt4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    alt: js.Function0[fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ]
  ): PipeableAlt4[F] = {
    val __obj = js.Dynamic.literal(alt = js.Any.fromFunction1(alt))
  
    __obj.asInstanceOf[PipeableAlt4[F]]
  }
}

