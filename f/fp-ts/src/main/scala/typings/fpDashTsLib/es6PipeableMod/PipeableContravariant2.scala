package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableContravariant2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends js.Object {
  def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, _, B]
  ]
}

object PipeableContravariant2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    contramap: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, _, js.Any]
    ]
  ): PipeableContravariant2[F] = {
    val __obj = js.Dynamic.literal(contramap = js.Any.fromFunction1(contramap))
  
    __obj.asInstanceOf[PipeableContravariant2[F]]
  }
}

