package typings
package fpDashTsLib.es6FunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorComposition3C1[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, G /* <: fpDashTsLib.es6HKTMod.URIS */, UF, LF] extends js.Object {
  def map[A, B](
    fa: fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, A]],
    f: js.Function1[/* a */ A, B]
  ): fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, B]]
}

object FunctorComposition3C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, G /* <: fpDashTsLib.es6HKTMod.URIS */, UF, LF](
    map: (fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]]
  ): FunctorComposition3C1[F, G, UF, LF] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[FunctorComposition3C1[F, G, UF, LF]]
  }
}

