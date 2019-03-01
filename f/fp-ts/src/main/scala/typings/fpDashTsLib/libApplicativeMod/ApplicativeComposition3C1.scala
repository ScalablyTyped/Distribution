package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicativeComposition3C1[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF]
  extends fpDashTsLib.libFunctorMod.FunctorComposition3C1[F, G, UF, LF] {
  def ap[A, B](
    fgab: fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, A]]
  ): fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, B]]
  def of[A](a: A): fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, A]]
}

object ApplicativeComposition3C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF](
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Function1[js.Any, js.Any]]], 
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    of: js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ]
  ): ApplicativeComposition3C1[F, G, UF, LF] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("of")(of)
    __obj.asInstanceOf[ApplicativeComposition3C1[F, G, UF, LF]]
  }
}

