package typings
package fpDashTsLib.es6FilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableComposition22[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6CompactableMod.CompactableComposition22[F, G] {
  def filter[LF, LG, A](
    fa: fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]]
  def filterMap[LF, LG, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, B]]
  def partition[LF, LG, A](
    fa: fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]], 
    fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]]
  ]
  def partitionMap[LF, LG, RL, RR, A](
    fa: fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, RL]], 
    fpDashTsLib.es6HKTMod.Kind2[F, LF, fpDashTsLib.es6HKTMod.Kind2[G, LG, RR]]
  ]
}

object FilterableComposition22 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    compact: fpDashTsLib.es6HKTMod.Kind2[
      F, 
      js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[G, js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]]
    ] => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]],
    filter: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], fpDashTsLib.es6FunctionMod.Predicate[js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]],
    filterMap: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Function1[js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]],
    partition: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], fpDashTsLib.es6FunctionMod.Predicate[js.Any]) => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], 
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]]
    ],
    partitionMap: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Function1[js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], 
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]]
    ],
    separate: fpDashTsLib.es6HKTMod.Kind2[
      F, 
      js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[G, js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ] => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], 
      fpDashTsLib.es6HKTMod.Kind2[F, js.Any, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]]
    ]
  ): FilterableComposition22[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), map = js.Any.fromFunction2(map), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[FilterableComposition22[F, G]]
  }
}

