package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicativeComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.FunctorComposition11[F, G] {
  def ap[A, B](
    fgab: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, A]]
  ): fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, B]]
  def of[A](a: A): fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, A]]
}

object ApplicativeComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](
    ap: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Function1[js.Any, js.Any]]], fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]]) => fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    map: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    of: js.Any => fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]]
  ): ApplicativeComposition11[F, G] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[ApplicativeComposition11[F, G]]
  }
}

