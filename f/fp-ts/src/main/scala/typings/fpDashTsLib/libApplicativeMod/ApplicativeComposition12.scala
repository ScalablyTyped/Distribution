package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicativeComposition12[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.FunctorComposition12[F, G] {
  def ap[LG, A, B](
    fgab: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, A]]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, B]]
  def of[LG, A](a: A): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, A]]
}

object ApplicativeComposition12 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Function1[js.Any, js.Any]]], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ],
    of: js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ]
  ): ApplicativeComposition12[F, G] = {
    val __obj = js.Dynamic.literal(ap = ap, map = map, of = of)
  
    __obj.asInstanceOf[ApplicativeComposition12[F, G]]
  }
}

