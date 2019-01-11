package typings
package fpDashTsLib.libChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Chain", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flatten[F](chain: fpDashTsLib.libChainMod.Chain[F]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def flatten[F /* <: fpDashTsLib.libHKTMod.URIS */](chain: fpDashTsLib.libChainMod.Chain1[F]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def flatten[F /* <: fpDashTsLib.libHKTMod.URIS2 */](chain: fpDashTsLib.libChainMod.Chain2[F]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def flatten[F /* <: fpDashTsLib.libHKTMod.URIS3 */](chain: fpDashTsLib.libChainMod.Chain3[F]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def flatten[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](chain: fpDashTsLib.libChainMod.Chain2C[F, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libHKTMod.Type2[F, L, _]], 
    fpDashTsLib.libHKTMod.Type2[F, L, _]
  ] = js.native
  def flatten[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](chain: fpDashTsLib.libChainMod.Chain3C[F, U, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libHKTMod.Type3[F, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, _]
  ] = js.native
}

