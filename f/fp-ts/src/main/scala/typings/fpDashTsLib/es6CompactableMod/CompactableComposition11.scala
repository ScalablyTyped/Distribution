package typings
package fpDashTsLib.es6CompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition11[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition11[F, G] {
  def compact[A](
    fga: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, fpDashTsLib.es6OptionMod.Option[A]]]
  ): fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, A]]
  def separate[A, B](
    fge: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, fpDashTsLib.es6EitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, A]], 
    fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, B]]
  ]
}

object CompactableComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS */](
    compact: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, fpDashTsLib.es6OptionMod.Option[js.Any]]] => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]],
    separate: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]] => Separated[
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]], 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]]
    ]
  ): CompactableComposition11[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[CompactableComposition11[F, G]]
  }
}

