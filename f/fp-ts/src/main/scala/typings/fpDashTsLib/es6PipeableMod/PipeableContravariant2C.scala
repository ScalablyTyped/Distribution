package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableContravariant2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends js.Object {
  def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, B]
  ]
}

object PipeableContravariant2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    contramap: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
    ]
  ): PipeableContravariant2C[F, L] = {
    val __obj = js.Dynamic.literal(contramap = js.Any.fromFunction1(contramap))
  
    __obj.asInstanceOf[PipeableContravariant2C[F, L]]
  }
}

