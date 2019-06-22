package typings
package fpDashTsLib.es6CompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition22[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition22[F, G] {
  def compact[LF, LG, A](
    fga: fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, fpDashTsLib.es6OptionMod.Option[A]]]
  ): fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]]
  def separate[LF, LG, A, B](
    fge: fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, fpDashTsLib.es6EitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]], 
    fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, B]]
  ]
}

object CompactableComposition22 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    compact: fpDashTsLib.es6HKTMod.Kind2[
      F, 
      js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[G, js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]]
    ] => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]],
    separate: fpDashTsLib.es6HKTMod.Kind2[
      F, 
      js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[G, js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ] => Separated[
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], 
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]]
    ]
  ): CompactableComposition22[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[CompactableComposition22[F, G]]
  }
}

