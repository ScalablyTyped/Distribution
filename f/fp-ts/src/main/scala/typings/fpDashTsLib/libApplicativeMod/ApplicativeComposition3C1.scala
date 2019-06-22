package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicativeComposition3C1[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF]
  extends fpDashTsLib.libFunctorMod.FunctorComposition3C1[F, G, UF, LF] {
  def ap[A, B](
    fgab: fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, A]]
  ): fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, B]]
  def of[A](a: A): fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, A]]
}

object ApplicativeComposition3C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF](
    ap: (fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Function1[js.Any, js.Any]]], fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]]) => fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    map: (fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    of: js.Any => fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]]
  ): ApplicativeComposition3C1[F, G, UF, LF] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[ApplicativeComposition3C1[F, G, UF, LF]]
  }
}

