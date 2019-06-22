package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableAlt4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */] extends js.Object {
  def alt[X, U, L, A](that: js.Function0[fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]
  ]
}

object PipeableAlt4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    alt: js.Function0[fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ]
  ): PipeableAlt4[F] = {
    val __obj = js.Dynamic.literal(alt = js.Any.fromFunction1(alt))
  
    __obj.asInstanceOf[PipeableAlt4[F]]
  }
}

