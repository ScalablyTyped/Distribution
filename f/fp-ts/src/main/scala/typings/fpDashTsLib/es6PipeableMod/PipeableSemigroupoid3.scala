package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableSemigroupoid3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends js.Object {
  def compose[U, L, A](la: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]): js.Function1[
    /* ab */ fpDashTsLib.es6HKTMod.Kind3[F, U, A, _], 
    fpDashTsLib.es6HKTMod.Kind3[F, U, L, _]
  ]
}

object PipeableSemigroupoid3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    compose: fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any] => js.Function1[
      /* ab */ fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, _], 
      fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, _]
    ]
  ): PipeableSemigroupoid3[F] = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
  
    __obj.asInstanceOf[PipeableSemigroupoid3[F]]
  }
}

