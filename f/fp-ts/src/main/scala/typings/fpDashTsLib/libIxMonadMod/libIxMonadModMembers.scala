package typings
package fpDashTsLib.libIxMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/IxMonad", JSImport.Namespace)
@js.native
object libIxMonadModMembers extends js.Object {
  def iapplyFirst[F](ixmonad: IxMonad[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.HKT3[F, _, _, _], 
    fpDashTsLib.libHKTMod.HKT3[F, _, _, _]
  ] = js.native
  def iapplyFirst[F /* <: fpDashTsLib.libHKTMod.URIS3 */](ixmonad: IxMonad3[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def iapplySecond[F](ixmonad: IxMonad[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.HKT3[F, _, _, _], 
    fpDashTsLib.libHKTMod.HKT3[F, _, _, _]
  ] = js.native
  def iapplySecond[F /* <: fpDashTsLib.libHKTMod.URIS3 */](ixmonad: IxMonad3[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
}

