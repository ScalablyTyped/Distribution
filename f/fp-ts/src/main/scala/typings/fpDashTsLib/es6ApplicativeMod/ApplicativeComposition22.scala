package typings
package fpDashTsLib.es6ApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicativeComposition22[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition22[F, G] {
  def ap[L, M, A, B](
    fgab: fpDashTsLib.es6HKTMod.Type2[F, L, fpDashTsLib.es6HKTMod.Type2[G, M, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.es6HKTMod.Type2[F, L, fpDashTsLib.es6HKTMod.Type2[G, M, A]]
  ): fpDashTsLib.es6HKTMod.Type2[F, L, fpDashTsLib.es6HKTMod.Type2[G, M, B]]
  def of[LF, LG, A](a: A): fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type2[G, LG, A]]
}

object ApplicativeComposition22 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    ap: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[G, js.Any, js.Function1[js.Any, js.Any]]], fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[G, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[G, js.Any, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[G, js.Any, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[G, js.Any, js.Any]],
    of: js.Any => fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[G, js.Any, js.Any]]
  ): ApplicativeComposition22[F, G] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[ApplicativeComposition22[F, G]]
  }
}

