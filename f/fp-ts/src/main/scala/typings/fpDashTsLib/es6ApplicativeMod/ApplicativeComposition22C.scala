package typings
package fpDashTsLib.es6ApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicativeComposition22C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, LG]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition22C[F, G, LG] {
  def ap[LF, A, B](
    fgab: fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]]
  ): fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, B]]
  def of[LF, A](a: A): fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]]
}

object ApplicativeComposition22C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, LG](
    ap: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Function1[js.Any, js.Any]]], fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]]
  ): ApplicativeComposition22C[F, G, LG] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[ApplicativeComposition22C[F, G, LG]]
  }
}

