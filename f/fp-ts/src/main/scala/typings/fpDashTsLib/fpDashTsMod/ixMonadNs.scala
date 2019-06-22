package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "ixMonad")
@js.native
object ixMonadNs extends js.Object {
  def iapplyFirst[F](ixmonad: fpDashTsLib.libIxMonadMod.IxMonad[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.HKT3[F, _, _, _], 
    fpDashTsLib.libHKTMod.HKT3[F, _, _, _]
  ] = js.native
  @JSName("iapplyFirst")
  def iapplyFirst_IxIO(ixmonad: fpDashTsLib.libIxMonadMod.IxMonad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  @JSName("iapplyFirst")
  def iapplyFirst_ReaderTaskEither(ixmonad: fpDashTsLib.libIxMonadMod.IxMonad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  def iapplySecond[F](ixmonad: fpDashTsLib.libIxMonadMod.IxMonad[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.HKT3[F, _, _, _], 
    fpDashTsLib.libHKTMod.HKT3[F, _, _, _]
  ] = js.native
  @JSName("iapplySecond")
  def iapplySecond_IxIO(ixmonad: fpDashTsLib.libIxMonadMod.IxMonad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  @JSName("iapplySecond")
  def iapplySecond_ReaderTaskEither(ixmonad: fpDashTsLib.libIxMonadMod.IxMonad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
}

