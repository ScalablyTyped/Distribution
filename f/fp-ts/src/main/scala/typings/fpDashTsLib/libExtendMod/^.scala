package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Extend", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def duplicate[F](E: Extend[F]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  def duplicate[F /* <: fpDashTsLib.libHKTMod.URIS */](E: Extend1[F]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[F, _]]
  ] = js.native
  def duplicate[F /* <: fpDashTsLib.libHKTMod.URIS2 */](E: Extend2[F]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type2[F, _, _]]
  ] = js.native
  def duplicate[F /* <: fpDashTsLib.libHKTMod.URIS3 */](E: Extend3[F]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libHKTMod.Type3[F, _, _, _]]
  ] = js.native
  def duplicate[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](E: Extend2C[F, L]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[F, L, _]]
  ] = js.native
  def duplicate[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](E: Extend3C[F, U, L]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libHKTMod.Type3[F, U, L, _]]
  ] = js.native
}

