package typings
package fpDashTsLib.es6CompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition[F, G]
  extends fpDashTsLib.es6FunctorMod.FunctorComposition[F, G] {
  def compact[A](
    fga: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, fpDashTsLib.es6OptionMod.Option[A]]]
  ): fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, A]]
  def separate[A, B](
    fge: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, fpDashTsLib.es6EitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, A]], 
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, B]]
  ]
}

object CompactableComposition {
  @scala.inline
  def apply[F, G](
    compact: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, fpDashTsLib.es6OptionMod.Option[js.Any]]] => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]],
    map: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]],
    separate: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]] => Separated[
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], 
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]]
    ]
  ): CompactableComposition[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[CompactableComposition[F, G]]
  }
}

