package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Compactable", JSImport.Namespace)
@js.native
object libCompactableModMembers extends js.Object {
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](
    F: fpDashTsLib.libFunctorMod.Functor1[F],
    G: Compactable1[G] with fpDashTsLib.libFunctorMod.Functor1[G]
  ): CompactableComposition11[F, G] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    F: fpDashTsLib.libFunctorMod.Functor1[F],
    G: Compactable2[G] with fpDashTsLib.libFunctorMod.Functor2[G]
  ): CompactableComposition12[F, G] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    F: fpDashTsLib.libFunctorMod.Functor2[F],
    G: Compactable2[G] with fpDashTsLib.libFunctorMod.Functor2[G]
  ): CompactableComposition22[F, G] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */](
    F: fpDashTsLib.libFunctorMod.Functor2[F],
    G: Compactable1[G] with fpDashTsLib.libFunctorMod.Functor1[G]
  ): CompactableComposition21[F, G] = js.native
  def getCompactableComposition[F, G](
    F: fpDashTsLib.libFunctorMod.Functor[F],
    G: Compactable[G] with fpDashTsLib.libFunctorMod.Functor[G]
  ): CompactableComposition[F, G] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](
    F: fpDashTsLib.libFunctorMod.Functor1[F],
    G: (Compactable2C[G, LG]) with (fpDashTsLib.libFunctorMod.Functor2C[G, LG])
  ): CompactableComposition12[F, G] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */, LF](
    F: fpDashTsLib.libFunctorMod.Functor2C[F, LF],
    G: Compactable1[G] with fpDashTsLib.libFunctorMod.Functor1[G]
  ): CompactableComposition2C1[F, G, LF] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](
    F: fpDashTsLib.libFunctorMod.Functor2[F],
    G: (Compactable2C[G, LG]) with (fpDashTsLib.libFunctorMod.Functor2C[G, LG])
  ): CompactableComposition22C[F, G, LG] = js.native
  def getCompactableComposition[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF](
    F: fpDashTsLib.libFunctorMod.Functor3C[F, UF, LF],
    G: Compactable1[G] with fpDashTsLib.libFunctorMod.Functor1[G]
  ): CompactableComposition3C1[F, G, UF, LF] = js.native
}

