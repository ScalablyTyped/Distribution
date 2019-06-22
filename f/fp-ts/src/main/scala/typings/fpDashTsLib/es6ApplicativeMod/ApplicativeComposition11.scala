package typings
package fpDashTsLib.es6ApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicativeComposition11[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition11[F, G] {
  def ap[A, B](
    fgab: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, A]]
  ): fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, B]]
  def of[A](a: A): fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, A]]
}

object ApplicativeComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS */](
    ap: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, js.Function1[js.Any, js.Any]]], fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, js.Any]]) => fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, js.Any]],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, js.Any]]
  ): ApplicativeComposition11[F, G] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[ApplicativeComposition11[F, G]]
  }
}

