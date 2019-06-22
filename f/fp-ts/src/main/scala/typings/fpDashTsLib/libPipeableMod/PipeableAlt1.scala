package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableAlt1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def alt[A](that: js.Function0[fpDashTsLib.libHKTMod.Kind[F, A]]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, A]]
}

object PipeableAlt1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    alt: js.Function0[fpDashTsLib.libHKTMod.Kind[F, js.Any]] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[F, js.Any], 
      fpDashTsLib.libHKTMod.Kind[F, js.Any]
    ]
  ): PipeableAlt1[F] = {
    val __obj = js.Dynamic.literal(alt = js.Any.fromFunction1(alt))
  
    __obj.asInstanceOf[PipeableAlt1[F]]
  }
}

