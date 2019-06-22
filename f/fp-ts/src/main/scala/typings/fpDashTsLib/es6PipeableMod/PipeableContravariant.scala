package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableContravariant[F] extends js.Object {
  def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, B]]
}

object PipeableContravariant {
  @scala.inline
  def apply[F](
    contramap: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.HKT[F, js.Any], 
      fpDashTsLib.es6HKTMod.HKT[F, js.Any]
    ]
  ): PipeableContravariant[F] = {
    val __obj = js.Dynamic.literal(contramap = js.Any.fromFunction1(contramap))
  
    __obj.asInstanceOf[PipeableContravariant[F]]
  }
}

