package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "extend")
@js.native
object extendNs extends js.Object {
  def duplicate[F](E: fpDashTsLib.libExtendMod.Extend[F]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  def duplicate[F /* <: fpDashTsLib.libHKTMod.URIS */](E: fpDashTsLib.libExtendMod.Extend1[F]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[F, _]]
  ] = js.native
  def duplicate[F /* <: fpDashTsLib.libHKTMod.URIS2 */](E: fpDashTsLib.libExtendMod.Extend2[F]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type2[F, _, _]]
  ] = js.native
  def duplicate[F /* <: fpDashTsLib.libHKTMod.URIS3 */](E: fpDashTsLib.libExtendMod.Extend3[F]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libHKTMod.Type3[F, _, _, _]]
  ] = js.native
  def duplicate[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](E: fpDashTsLib.libExtendMod.Extend2C[F, L]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[F, L, _]]
  ] = js.native
  def duplicate[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](E: fpDashTsLib.libExtendMod.Extend3C[F, U, L]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libHKTMod.Type3[F, U, L, _]]
  ] = js.native
}

