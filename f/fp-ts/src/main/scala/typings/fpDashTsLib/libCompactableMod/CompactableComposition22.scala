package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition22[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.FunctorComposition22[F, G] {
  def compact[LF, LG, A](
    fga: fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind2[G, LG, fpDashTsLib.libOptionMod.Option[A]]]
  ): fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind2[G, LG, A]]
  def separate[LF, LG, A, B](
    fge: fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind2[G, LG, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind2[G, LG, A]], 
    fpDashTsLib.libHKTMod.Kind2[F, LF, fpDashTsLib.libHKTMod.Kind2[G, LG, B]]
  ]
}

object CompactableComposition22 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    compact: fpDashTsLib.libHKTMod.Kind2[
      F, 
      js.Any, 
      fpDashTsLib.libHKTMod.Kind2[G, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]
    ] => fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, js.Any, js.Any]],
    map: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, js.Any, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, js.Any, js.Any]],
    separate: fpDashTsLib.libHKTMod.Kind2[
      F, 
      js.Any, 
      fpDashTsLib.libHKTMod.Kind2[G, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
    ] => Separated[
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Kind2[F, js.Any, fpDashTsLib.libHKTMod.Kind2[G, js.Any, js.Any]]
    ]
  ): CompactableComposition22[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[CompactableComposition22[F, G]]
  }
}

