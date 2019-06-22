package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition22C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG]
  extends fpDashTsLib.libFunctorMod.FunctorComposition22C[F, G, LG] {
  def compact[LF, A](
    fga: fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind2[G, LG, fpDashTsLib.libOptionMod.Option[A]]]
  ): fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind2[G, LG, A]]
  def separate[LF, A, B](
    fge: fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind2[G, LG, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind2[G, LG, A]], 
    fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind2[G, LG, B]]
  ]
}

object CompactableComposition22C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](
    compact: fpDashTsLib.libHKTMod.Kind2[
      F, 
      js.Any, 
      fpDashTsLib.libHKTMod.Kind2[G, LG, fpDashTsLib.libOptionMod.Option[js.Any]]
    ] => fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, LG, js.Any]],
    map: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, LG, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, LG, js.Any]],
    separate: fpDashTsLib.libHKTMod.Kind2[
      F, 
      js.Any, 
      fpDashTsLib.libHKTMod.Kind2[G, LG, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
    ] => Separated[
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, LG, js.Any]], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, LG, js.Any]]
    ]
  ): CompactableComposition22C[F, G, LG] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[CompactableComposition22C[F, G, LG]]
  }
}

