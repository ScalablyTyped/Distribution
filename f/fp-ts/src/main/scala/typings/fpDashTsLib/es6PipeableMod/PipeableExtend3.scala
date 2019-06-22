package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableExtend3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends PipeableFunctor3[F] {
  def duplicate[U, L, A](ma: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]): fpDashTsLib.es6HKTMod.Kind3[F, U, L, fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]]
  def extend[U, L, A, B](f: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], B]): js.Function1[
    /* ma */ fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], 
    fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]
  ]
}

object PipeableExtend3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    duplicate: fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any] => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]],
    extend: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Any] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, _, _, js.Any], 
      fpDashTsLib.es6HKTMod.Kind3[F, _, _, js.Any]
    ]
  ): PipeableExtend3[F] = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction1(duplicate), extend = js.Any.fromFunction1(extend), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableExtend3[F]]
  }
}

