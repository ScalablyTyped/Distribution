package typings
package fpDashTsLib.es6CompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition22C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, LG]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition22C[F, G, LG] {
  def compact[LF, A](
    fga: fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, fpDashTsLib.es6OptionMod.Option[A]]]
  ): fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]]
  def separate[LF, A, B](
    fge: fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, fpDashTsLib.es6EitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]], 
    fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, B]]
  ]
}

object CompactableComposition22C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, LG](
    compact: fpDashTsLib.es6HKTMod.Kind2[
      F, 
      js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[G, LG, fpDashTsLib.es6OptionMod.Option[js.Any]]
    ] => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]],
    separate: fpDashTsLib.es6HKTMod.Kind2[
      F, 
      js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[G, LG, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ] => Separated[
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]], 
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, LG, js.Any]]
    ]
  ): CompactableComposition22C[F, G, LG] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[CompactableComposition22C[F, G, LG]]
  }
}

