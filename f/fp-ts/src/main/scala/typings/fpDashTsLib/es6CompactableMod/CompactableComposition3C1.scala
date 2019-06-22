package typings
package fpDashTsLib.es6CompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition3C1[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, G /* <: fpDashTsLib.es6HKTMod.URIS */, UF, LF]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition3C1[F, G, UF, LF] {
  def compact[A](
    fga: fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, fpDashTsLib.es6OptionMod.Option[A]]]
  ): fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, A]]
  def separate[A, B](
    fge: fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, fpDashTsLib.es6EitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, A]], 
    fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, B]]
  ]
}

object CompactableComposition3C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, G /* <: fpDashTsLib.es6HKTMod.URIS */, UF, LF](
    compact: fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, fpDashTsLib.es6OptionMod.Option[js.Any]]] => fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]],
    separate: fpDashTsLib.es6HKTMod.Kind3[
      F, 
      UF, 
      LF, 
      fpDashTsLib.es6HKTMod.Kind[G, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ] => Separated[
      fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]], 
      fpDashTsLib.es6HKTMod.Kind3[F, UF, LF, fpDashTsLib.es6HKTMod.Kind[G, js.Any]]
    ]
  ): CompactableComposition3C1[F, G, UF, LF] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[CompactableComposition3C1[F, G, UF, LF]]
  }
}

