package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "profunctor")
@js.native
object profunctorNs extends js.Object {
  def lmap[F](profunctor: fpDashTsLib.libProfunctorMod.Profunctor[F]): js.Function2[
    /* fbc */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    /* f */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.HKT2[F, _, _]
  ] = js.native
  def lmap[F /* <: fpDashTsLib.libHKTMod.URIS2 */](profunctor: fpDashTsLib.libProfunctorMod.Profunctor2[F]): js.Function2[
    /* fbc */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* f */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def lmap[F /* <: fpDashTsLib.libHKTMod.URIS3 */](profunctor: fpDashTsLib.libProfunctorMod.Profunctor3[F]): js.Function2[
    /* fbc */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* f */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def rmap[F](profunctor: fpDashTsLib.libProfunctorMod.Profunctor[F]): js.Function2[
    /* fbc */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    /* g */ js.Function1[/* c */ js.Any, _], 
    fpDashTsLib.libHKTMod.HKT2[F, _, _]
  ] = js.native
  def rmap[F /* <: fpDashTsLib.libHKTMod.URIS2 */](profunctor: fpDashTsLib.libProfunctorMod.Profunctor2[F]): js.Function2[
    /* fbc */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* g */ js.Function1[/* c */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def rmap[F /* <: fpDashTsLib.libHKTMod.URIS3 */](profunctor: fpDashTsLib.libProfunctorMod.Profunctor3[F]): js.Function2[
    /* fbc */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* g */ js.Function1[/* c */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
}

