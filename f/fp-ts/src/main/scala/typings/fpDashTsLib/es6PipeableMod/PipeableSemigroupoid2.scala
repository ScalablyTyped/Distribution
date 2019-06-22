package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableSemigroupoid2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends js.Object {
  def compose[L, A](la: fpDashTsLib.es6HKTMod.Kind2[F, L, A]): js.Function1[
    /* ab */ fpDashTsLib.es6HKTMod.Kind2[F, A, _], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, _]
  ]
}

object PipeableSemigroupoid2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    compose: fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any] => js.Function1[
      /* ab */ fpDashTsLib.es6HKTMod.Kind2[F, js.Any, _], 
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, _]
    ]
  ): PipeableSemigroupoid2[F] = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
  
    __obj.asInstanceOf[PipeableSemigroupoid2[F]]
  }
}

