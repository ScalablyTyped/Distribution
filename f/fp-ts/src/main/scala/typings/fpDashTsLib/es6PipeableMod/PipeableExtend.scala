package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableExtend[F] extends PipeableFunctor[F] {
  def duplicate[A](ma: fpDashTsLib.es6HKTMod.HKT[F, A]): fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[F, A]]
  def extend[A, B](f: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], B]): js.Function1[/* ma */ fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, B]]
}

object PipeableExtend {
  @scala.inline
  def apply[F](
    duplicate: fpDashTsLib.es6HKTMod.HKT[F, js.Any] => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[F, js.Any]],
    extend: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Any] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], 
      fpDashTsLib.es6HKTMod.HKT[F, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], 
      fpDashTsLib.es6HKTMod.HKT[F, js.Any]
    ]
  ): PipeableExtend[F] = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction1(duplicate), extend = js.Any.fromFunction1(extend), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableExtend[F]]
  }
}

