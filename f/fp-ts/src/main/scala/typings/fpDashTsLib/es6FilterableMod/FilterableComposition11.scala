package typings
package fpDashTsLib.es6FilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableComposition11[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6CompactableMod.CompactableComposition11[F, G] {
  def filter[A](
    fa: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, A]],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, A]]
  def filterMap[A, B](
    fa: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, B]]
  def partition[A](
    fa: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, A]],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, A]], 
    fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, A]]
  ]
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, RL]], 
    fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, RR]]
  ]
}

object FilterableComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS */](
    compact: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, fpDashTsLib.es6OptionMod.Option[js.Any]]] => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]],
    filter: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]], fpDashTsLib.es6FunctionMod.Predicate[js.Any]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]],
    filterMap: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]], js.Function1[js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]],
    partition: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]], fpDashTsLib.es6FunctionMod.Predicate[js.Any]) => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]], 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]]
    ],
    partitionMap: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]], js.Function1[js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]], 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]]
    ],
    separate: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]] => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]], 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, js.Any]]
    ]
  ): FilterableComposition11[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), map = js.Any.fromFunction2(map), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[FilterableComposition11[F, G]]
  }
}

