package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableSemigroupoid[F] extends js.Object {
  def compose[L, A](la: fpDashTsLib.es6HKTMod.HKT2[F, L, A]): js.Function1[/* ab */ fpDashTsLib.es6HKTMod.HKT2[F, A, _], fpDashTsLib.es6HKTMod.HKT2[F, L, _]]
}

object PipeableSemigroupoid {
  @scala.inline
  def apply[F](
    compose: fpDashTsLib.es6HKTMod.HKT2[F, js.Any, js.Any] => js.Function1[
      /* ab */ fpDashTsLib.es6HKTMod.HKT2[F, js.Any, _], 
      fpDashTsLib.es6HKTMod.HKT2[F, js.Any, _]
    ]
  ): PipeableSemigroupoid[F] = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
  
    __obj.asInstanceOf[PipeableSemigroupoid[F]]
  }
}

