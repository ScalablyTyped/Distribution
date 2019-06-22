package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableSemigroupoid4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */] extends js.Object {
  def compose[X, U, L, A](la: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]): js.Function1[
    /* ab */ fpDashTsLib.es6HKTMod.Kind4[F, X, U, A, _], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, _]
  ]
}

object PipeableSemigroupoid4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    compose: fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any] => js.Function1[
      /* ab */ fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, _], 
      fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, _]
    ]
  ): PipeableSemigroupoid4[F] = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
  
    __obj.asInstanceOf[PipeableSemigroupoid4[F]]
  }
}

