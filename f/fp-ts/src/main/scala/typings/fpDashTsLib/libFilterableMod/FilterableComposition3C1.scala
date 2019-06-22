package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableComposition3C1[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF]
  extends fpDashTsLib.libCompactableMod.CompactableComposition3C1[F, G, UF, LF] {
  def filter[A](
    fa: fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, A]],
    predicate: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, A]]
  def filterMap[A, B](
    fa: fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, B]]
  def partition[A](
    fa: fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, A]],
    predicate: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, A]], 
    fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, A]]
  ]
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, RL]], 
    fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, RR]]
  ]
}

object FilterableComposition3C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF](
    compact: fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libOptionMod.Option[js.Any]]] => fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    filter: (fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]], fpDashTsLib.libFunctionMod.Predicate[js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    filterMap: (fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]) => fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    map: (fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    partition: (fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]], fpDashTsLib.libFunctionMod.Predicate[js.Any]) => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]], 
      fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]]
    ],
    partitionMap: (fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]], 
      fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]]
    ],
    separate: fpDashTsLib.libHKTMod.Kind3[
      F, 
      UF, 
      LF, 
      fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
    ] => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]], 
      fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]]
    ]
  ): FilterableComposition3C1[F, G, UF, LF] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), map = js.Any.fromFunction2(map), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[FilterableComposition3C1[F, G, UF, LF]]
  }
}

