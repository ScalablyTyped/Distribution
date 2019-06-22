package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableSemigroupoid2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends js.Object {
  def compose[A](la: fpDashTsLib.es6HKTMod.Kind2[F, L, A]): js.Function1[
    /* ab */ fpDashTsLib.es6HKTMod.Kind2[F, A, _], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, _]
  ]
}

object PipeableSemigroupoid2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    compose: fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any] => js.Function1[
      /* ab */ fpDashTsLib.es6HKTMod.Kind2[F, js.Any, _], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, _]
    ]
  ): PipeableSemigroupoid2C[F, L] = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
  
    __obj.asInstanceOf[PipeableSemigroupoid2C[F, L]]
  }
}

