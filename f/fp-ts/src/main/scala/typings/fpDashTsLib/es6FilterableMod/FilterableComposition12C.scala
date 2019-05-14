package typings
package fpDashTsLib.es6FilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableComposition12C[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, LG]
  extends fpDashTsLib.es6CompactableMod.CompactableComposition12C[F, G, LG] {
  def filter[A](
    fa: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, A]],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, A]]
  def filterMap[A, B](
    fa: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, B]]
  def partition[A](
    fa: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, A]],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, A]], 
    fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, A]]
  ]
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, RL]], 
    fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, RR]]
  ]
}

object FilterableComposition12C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */, LG](
    compact: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, fpDashTsLib.es6OptionMod.Option[js.Any]]] => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]],
    filter: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]], fpDashTsLib.es6FunctionMod.Predicate[js.Any]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]],
    filterMap: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]], js.Function1[js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]],
    partition: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]], fpDashTsLib.es6FunctionMod.Predicate[js.Any]) => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]], 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]]
    ],
    partitionMap: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]], js.Function1[js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]], 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]]
    ],
    separate: fpDashTsLib.es6HKTMod.Type[
      F, 
      fpDashTsLib.es6HKTMod.Type2[G, LG, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ] => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]], 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[G, LG, js.Any]]
    ]
  ): FilterableComposition12C[F, G, LG] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), map = js.Any.fromFunction2(map), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[FilterableComposition12C[F, G, LG]]
  }
}

