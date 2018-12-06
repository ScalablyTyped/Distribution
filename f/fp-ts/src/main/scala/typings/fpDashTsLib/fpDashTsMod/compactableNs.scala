package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "compactable")
@js.native
object compactableNs extends js.Object {
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](
    F: fpDashTsLib.libFunctorMod.Functor1[F],
    G: fpDashTsLib.libCompactableMod.Compactable1[G] with fpDashTsLib.libFunctorMod.Functor1[G]
  ): fpDashTsLib.libCompactableMod.CompactableComposition11[F, G] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    F: fpDashTsLib.libFunctorMod.Functor1[F],
    G: fpDashTsLib.libCompactableMod.Compactable2[G] with fpDashTsLib.libFunctorMod.Functor2[G]
  ): fpDashTsLib.libCompactableMod.CompactableComposition12[F, G] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    F: fpDashTsLib.libFunctorMod.Functor2[F],
    G: fpDashTsLib.libCompactableMod.Compactable2[G] with fpDashTsLib.libFunctorMod.Functor2[G]
  ): fpDashTsLib.libCompactableMod.CompactableComposition22[F, G] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */](
    F: fpDashTsLib.libFunctorMod.Functor2[F],
    G: fpDashTsLib.libCompactableMod.Compactable1[G] with fpDashTsLib.libFunctorMod.Functor1[G]
  ): fpDashTsLib.libCompactableMod.CompactableComposition21[F, G] = js.native
  def getCompactableComposition[F, G](
    F: fpDashTsLib.libFunctorMod.Functor[F],
    G: fpDashTsLib.libCompactableMod.Compactable[G] with fpDashTsLib.libFunctorMod.Functor[G]
  ): fpDashTsLib.libCompactableMod.CompactableComposition[F, G] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](
    F: fpDashTsLib.libFunctorMod.Functor1[F],
    G: (fpDashTsLib.libCompactableMod.Compactable2C[G, LG]) with (fpDashTsLib.libFunctorMod.Functor2C[G, LG])
  ): fpDashTsLib.libCompactableMod.CompactableComposition12[F, G] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */, LF](
    F: fpDashTsLib.libFunctorMod.Functor2C[F, LF],
    G: fpDashTsLib.libCompactableMod.Compactable1[G] with fpDashTsLib.libFunctorMod.Functor1[G]
  ): fpDashTsLib.libCompactableMod.CompactableComposition2C1[F, G, LF] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](
    F: fpDashTsLib.libFunctorMod.Functor2[F],
    G: (fpDashTsLib.libCompactableMod.Compactable2C[G, LG]) with (fpDashTsLib.libFunctorMod.Functor2C[G, LG])
  ): fpDashTsLib.libCompactableMod.CompactableComposition22C[F, G, LG] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF](
    F: fpDashTsLib.libFunctorMod.Functor3C[F, UF, LF],
    G: fpDashTsLib.libCompactableMod.Compactable1[G] with fpDashTsLib.libFunctorMod.Functor1[G]
  ): fpDashTsLib.libCompactableMod.CompactableComposition3C1[F, G, UF, LF] = js.native
}

