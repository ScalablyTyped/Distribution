package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.FunctorComposition11[F, G] {
  def compact[A](
    fga: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libOptionMod.Option[A]]]
  ): fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, A]]
  def separate[A, B](
    fge: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, A]], 
    fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, B]]
  ]
}

object CompactableComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](
    compact: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libOptionMod.Option[js.Any]]] => fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    map: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    separate: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]] => Separated[
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]], 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, js.Any]]
    ]
  ): CompactableComposition11[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[CompactableComposition11[F, G]]
  }
}

