package typings
package fpDashTsLib.es6FunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorComposition22[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends js.Object {
  def map[LF, LG, A, B](
    fa: fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type2[G, LG, A]],
    f: js.Function1[/* a */ A, B]
  ): fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type2[G, LG, B]]
}

object FunctorComposition22 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    map: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[G, js.Any, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[G, js.Any, js.Any]]
  ): FunctorComposition22[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[FunctorComposition22[F, G]]
  }
}

