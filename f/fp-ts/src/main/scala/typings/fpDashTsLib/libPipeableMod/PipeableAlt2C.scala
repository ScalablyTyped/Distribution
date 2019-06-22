package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableAlt2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends js.Object {
  def alt[A](that: js.Function0[fpDashTsLib.libHKTMod.Kind2[F, L, A]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, A], 
    fpDashTsLib.libHKTMod.Kind2[F, L, A]
  ]
}

object PipeableAlt2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    alt: js.Function0[fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
    ]
  ): PipeableAlt2C[F, L] = {
    val __obj = js.Dynamic.literal(alt = js.Any.fromFunction1(alt))
  
    __obj.asInstanceOf[PipeableAlt2C[F, L]]
  }
}

