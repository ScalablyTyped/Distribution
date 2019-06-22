package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableExtend2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends PipeableFunctor2C[F, L] {
  def duplicate[A](ma: fpDashTsLib.libHKTMod.Kind2[F, L, A]): fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind2[F, L, A]]
  def extend[A, B](f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, A], B]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind2[F, L, A], 
    fpDashTsLib.libHKTMod.Kind2[F, L, B]
  ]
}

object PipeableExtend2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    duplicate: fpDashTsLib.libHKTMod.Kind2[F, L, js.Any] => fpDashTsLib.libHKTMod.Kind2[F, L, fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]],
    extend: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], js.Any] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, L, js.Any]
    ]
  ): PipeableExtend2C[F, L] = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction1(duplicate), extend = js.Any.fromFunction1(extend), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableExtend2C[F, L]]
  }
}

