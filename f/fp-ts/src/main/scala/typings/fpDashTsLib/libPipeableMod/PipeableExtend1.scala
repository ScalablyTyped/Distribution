package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableExtend1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends PipeableFunctor1[F] {
  def duplicate[A](ma: fpDashTsLib.libHKTMod.Kind[F, A]): fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[F, A]]
  def extend[A, B](f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, A], B]): js.Function1[/* ma */ fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, B]]
}

object PipeableExtend1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    duplicate: fpDashTsLib.libHKTMod.Kind[F, js.Any] => fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[F, js.Any]],
    extend: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Any] => js.Function1[
      /* ma */ fpDashTsLib.libHKTMod.Kind[F, js.Any], 
      fpDashTsLib.libHKTMod.Kind[F, js.Any]
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[F, js.Any], 
      fpDashTsLib.libHKTMod.Kind[F, js.Any]
    ]
  ): PipeableExtend1[F] = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction1(duplicate), extend = js.Any.fromFunction1(extend), map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[PipeableExtend1[F]]
  }
}

