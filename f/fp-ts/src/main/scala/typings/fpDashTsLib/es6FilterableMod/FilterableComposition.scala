package typings
package fpDashTsLib.es6FilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableComposition[F, G]
  extends fpDashTsLib.es6CompactableMod.CompactableComposition[F, G] {
  def filter[A](
    fa: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, A]],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, A]]
  def filterMap[A, B](
    fa: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, B]]
  def partition[A](
    fa: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, A]],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, A]], 
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, A]]
  ]
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, RL]], 
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, RR]]
  ]
}

object FilterableComposition {
  @scala.inline
  def apply[F, G](
    compact: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, fpDashTsLib.es6OptionMod.Option[js.Any]]] => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]],
    filter: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], fpDashTsLib.es6FunctionMod.Predicate[js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]],
    filterMap: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Function1[js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]]) => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]],
    map: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]],
    partition: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], fpDashTsLib.es6FunctionMod.Predicate[js.Any]) => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], 
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]]
    ],
    partitionMap: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], js.Function1[js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], 
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]]
    ],
    separate: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]] => fpDashTsLib.es6CompactableMod.Separated[
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]], 
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[G, js.Any]]
    ]
  ): FilterableComposition[F, G] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), map = js.Any.fromFunction2(map), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[FilterableComposition[F, G]]
  }
}

