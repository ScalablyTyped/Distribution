package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "choice")
@js.native
object choiceNs extends js.Object {
  def fanin[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libCategoryMod.Category3[F] with fpDashTsLib.libChoiceMod.Choice3[F]): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  def fanin[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libCategoryMod.Category2[F] with fpDashTsLib.libChoiceMod.Choice2[F]): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  def fanin[F](F: fpDashTsLib.libCategoryMod.Category[F] with fpDashTsLib.libChoiceMod.Choice[F]): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    fpDashTsLib.libHKTMod.HKT2[F, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  def splitChoice[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libCategoryMod.Category2[F] with fpDashTsLib.libChoiceMod.Choice2[F]): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, fpDashTsLib.libEitherMod.Either[_, _], fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def splitChoice[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libCategoryMod.Category3[F] with fpDashTsLib.libChoiceMod.Choice3[F]): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, fpDashTsLib.libEitherMod.Either[_, _], fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def splitChoice[F](F: fpDashTsLib.libCategoryMod.Category[F] with fpDashTsLib.libChoiceMod.Choice[F]): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    fpDashTsLib.libHKTMod.HKT2[F, fpDashTsLib.libEitherMod.Either[_, _], fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
}

