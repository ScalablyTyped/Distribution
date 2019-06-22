package typings
package fpDashTsLib.es6ApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicativeComposition3C1[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, G /* <: fpDashTsLib.es6HKTMod.URIS */, UF, LF]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition3C1[F, G, UF, LF] {
  def ap[A, B](
    fgab: fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, A]]
  ): fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, B]]
  def of[A](a: A): fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, A]]
}

object ApplicativeComposition3C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, G /* <: fpDashTsLib.es6HKTMod.URIS */, UF, LF](
    ap: (fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Function1[js.Any, js.Any]]], fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]]) => fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]]
  ): ApplicativeComposition3C1[F, G, UF, LF] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[ApplicativeComposition3C1[F, G, UF, LF]]
  }
}

