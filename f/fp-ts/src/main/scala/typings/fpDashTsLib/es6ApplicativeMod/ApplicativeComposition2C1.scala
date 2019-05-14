package typings
package fpDashTsLib.es6ApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicativeComposition2C1[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS */, LF]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition2C1[F, G, LF] {
  def ap[A, B](
    fgab: fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type[G, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type[G, A]]
  ): fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type[G, B]]
  def of[A](a: A): fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type[G, A]]
}

object ApplicativeComposition2C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS */, LF](
    ap: (fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type[G, js.Function1[js.Any, js.Any]]], fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type[G, js.Any]]) => fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type[G, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type[G, js.Any]],
    of: js.Any => fpDashTsLib.es6HKTMod.Type2[F, LF, fpDashTsLib.es6HKTMod.Type[G, js.Any]]
  ): ApplicativeComposition2C1[F, G, LF] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[ApplicativeComposition2C1[F, G, LF]]
  }
}

