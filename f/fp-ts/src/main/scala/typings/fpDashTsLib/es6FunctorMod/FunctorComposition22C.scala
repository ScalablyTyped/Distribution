package typings
package fpDashTsLib.es6FunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorComposition22C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, LG] extends js.Object {
  def map[LF, A, B](
    fa: fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type2[G, LG, A]],
    f: js.Function1[/* a */ A, B]
  ): fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type2[G, LG, B]]
}

object FunctorComposition22C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, LG](
    map: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]]
  ): FunctorComposition22C[F, G, LG] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[FunctorComposition22C[F, G, LG]]
  }
}

