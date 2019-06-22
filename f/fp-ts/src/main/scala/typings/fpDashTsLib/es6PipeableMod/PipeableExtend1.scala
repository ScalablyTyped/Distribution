package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableExtend1[F /* <: fpDashTsLib.es6HKTMod.URIS */] extends PipeableFunctor1[F] {
  def duplicate[A](ma: fpDashTsLib.es6HKTMod.Kind[F, A]): fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[F, A]]
  def extend[A, B](f: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, A], B]): js.Function1[/* ma */ fpDashTsLib.es6HKTMod.Kind[F, A], fpDashTsLib.es6HKTMod.Kind[F, B]]
}

object PipeableExtend1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    duplicate: fpDashTsLib.es6HKTMod.Kind[F, js.Any] => fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[F, js.Any]],
    extend: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], 
      fpDashTsLib.es6HKTMod.Kind[F, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], 
      fpDashTsLib.es6HKTMod.Kind[F, js.Any]
    ]
  ): PipeableExtend1[F] = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction1(duplicate), extend = js.Any.fromFunction1(extend), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableExtend1[F]]
  }
}

