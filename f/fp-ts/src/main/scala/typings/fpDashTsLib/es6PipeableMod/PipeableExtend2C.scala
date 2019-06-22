package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableExtend2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends PipeableFunctor2C[F, L] {
  def duplicate[A](ma: fpDashTsLib.es6HKTMod.Kind2[F, L, A]): fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6HKTMod.Kind2[F, L, A]]
  def extend[A, B](f: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, A], B]): js.Function1[
    /* ma */ fpDashTsLib.es6HKTMod.Kind2[F, L, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, L, B]
  ]
}

object PipeableExtend2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    duplicate: fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any] => fpDashTsLib.es6HKTMod.Kind2[F, L, fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]],
    extend: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], js.Any] => js.Function1[
      /* ma */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
    ]
  ): PipeableExtend2C[F, L] = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction1(duplicate), extend = js.Any.fromFunction1(extend), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableExtend2C[F, L]]
  }
}

