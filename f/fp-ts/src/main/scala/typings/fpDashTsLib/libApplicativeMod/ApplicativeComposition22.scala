package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicativeComposition22[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.FunctorComposition22[F, G] {
  def ap[L, M, A, B](
    fgab: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[G, M, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[G, M, A]]
  ): fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[G, M, B]]
  def of[LF, LG, A](a: A): fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]]
}

object ApplicativeComposition22 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Function1[js.Any, js.Any]]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ],
    of: js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ]
  ): ApplicativeComposition22[F, G] = {
    val __obj = js.Dynamic.literal(ap = ap, map = map, of = of)
  
    __obj.asInstanceOf[ApplicativeComposition22[F, G]]
  }
}

