package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableSemigroupoid[F] extends js.Object {
  def compose[L, A](la: fpDashTsLib.libHKTMod.HKT2[F, L, A]): js.Function1[/* ab */ fpDashTsLib.libHKTMod.HKT2[F, A, _], fpDashTsLib.libHKTMod.HKT2[F, L, _]]
}

object PipeableSemigroupoid {
  @scala.inline
  def apply[F](
    compose: fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any] => js.Function1[
      /* ab */ fpDashTsLib.libHKTMod.HKT2[F, js.Any, _], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, _]
    ]
  ): PipeableSemigroupoid[F] = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
  
    __obj.asInstanceOf[PipeableSemigroupoid[F]]
  }
}

