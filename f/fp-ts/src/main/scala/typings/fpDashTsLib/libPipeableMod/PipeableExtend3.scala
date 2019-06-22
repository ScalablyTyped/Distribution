package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableExtend3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends PipeableFunctor3[F] {
  def duplicate[U, L, A](ma: fpDashTsLib.libHKTMod.Kind3[F, U, L, A]): fpDashTsLib.libHKTMod.Kind3[F, U, L, fpDashTsLib.libHKTMod.Kind3[F, U, L, A]]
  def extend[U, L, A, B](f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, U, L, A], B]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind3[F, U, L, A], 
    fpDashTsLib.libHKTMod.Kind3[F, U, L, B]
  ]
}

object PipeableExtend3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    duplicate: fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any] => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]],
    extend: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Any] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any]
    ]
  ): PipeableExtend3[F] = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction1(duplicate), extend = js.Any.fromFunction1(extend), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableExtend3[F]]
  }
}

