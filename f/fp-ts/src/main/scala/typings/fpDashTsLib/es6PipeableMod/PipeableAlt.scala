package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableAlt[F] extends js.Object {
  def alt[A](that: js.Function0[fpDashTsLib.es6HKTMod.HKT[F, A]]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, A]]
}

object PipeableAlt {
  @scala.inline
  def apply[F](
    alt: js.Function0[fpDashTsLib.es6HKTMod.HKT[F, js.Any]] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], 
      fpDashTsLib.es6HKTMod.HKT[F, js.Any]
    ]
  ): PipeableAlt[F] = {
    val __obj = js.Dynamic.literal(alt = js.Any.fromFunction1(alt))
  
    __obj.asInstanceOf[PipeableAlt[F]]
  }
}

