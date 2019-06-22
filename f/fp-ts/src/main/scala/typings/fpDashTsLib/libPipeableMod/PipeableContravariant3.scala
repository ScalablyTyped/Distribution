package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableContravariant3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libHKTMod.Kind3[F, _, _, B]
  ]
}

object PipeableContravariant3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    contramap: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any]
    ]
  ): PipeableContravariant3[F] = {
    val __obj = js.Dynamic.literal(contramap = js.Any.fromFunction1(contramap))
  
    __obj.asInstanceOf[PipeableContravariant3[F]]
  }
}

