package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableExtend4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends PipeableFunctor4[F] {
  def duplicate[X, U, L, A](ma: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]]
  def extend[X, U, L, A, B](f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], B]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B]
  ]
}

object PipeableExtend4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    duplicate: fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any] => fpDashTsLib.libHKTMod.Kind4[
      F, 
      js.Any, 
      js.Any, 
      js.Any, 
      fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ],
    extend: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Any] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, js.Any]
    ]
  ): PipeableExtend4[F] = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction1(duplicate), extend = js.Any.fromFunction1(extend), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableExtend4[F]]
  }
}

