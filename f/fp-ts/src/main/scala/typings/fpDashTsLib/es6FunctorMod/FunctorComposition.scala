package typings
package fpDashTsLib.es6FunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorComposition[F, G] extends js.Object {
  def map[A, B](fa: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, A]], f: js.Function1[/* a */ A, B]): fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, B]]
}

object FunctorComposition {
  @scala.inline
  def apply[F, G](
    map: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]]
  ): FunctorComposition[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[FunctorComposition[F, G]]
  }
}

