package typings
package fpDashTsLib.es6FunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorComposition11[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS */] extends js.Object {
  def map[A, B](fa: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, A]], f: js.Function1[/* a */ A, B]): fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, B]]
}

object FunctorComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS */](
    map: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]]
  ): FunctorComposition11[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[FunctorComposition11[F, G]]
  }
}

