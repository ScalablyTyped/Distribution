package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableExtend2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends PipeableFunctor2[F] {
  def duplicate[L, A](ma: fpDashTsLib.libHKTMod.Kind2[F, L, A]): fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind2[F, L, A]]
  def extend[L, A, B](f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, A], B]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind2[F, L, A], 
    fpDashTsLib.libHKTMod.Kind2[F, L, B]
  ]
}

object PipeableExtend2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    duplicate: fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any] => fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]],
    extend: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], js.Any] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, _, js.Any]
    ]
  ): PipeableExtend2[F] = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction1(duplicate), extend = js.Any.fromFunction1(extend), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableExtend2[F]]
  }
}

