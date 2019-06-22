package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableContravariant4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A], 
    fpDashTsLib.libHKTMod.Kind4[F, _, _, _, B]
  ]
}

object PipeableContravariant4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    contramap: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, js.Any]
    ]
  ): PipeableContravariant4[F] = {
    val __obj = js.Dynamic.literal(contramap = js.Any.fromFunction1(contramap))
  
    __obj.asInstanceOf[PipeableContravariant4[F]]
  }
}

