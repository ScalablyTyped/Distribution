package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableAlt1[F /* <: fpDashTsLib.es6HKTMod.URIS */] extends js.Object {
  def alt[A](that: js.Function0[fpDashTsLib.es6HKTMod.Kind[F, A]]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, A], fpDashTsLib.es6HKTMod.Kind[F, A]]
}

object PipeableAlt1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    alt: js.Function0[fpDashTsLib.es6HKTMod.Kind[F, js.Any]] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], 
      fpDashTsLib.es6HKTMod.Kind[F, js.Any]
    ]
  ): PipeableAlt1[F] = {
    val __obj = js.Dynamic.literal(alt = js.Any.fromFunction1(alt))
  
    __obj.asInstanceOf[PipeableAlt1[F]]
  }
}

