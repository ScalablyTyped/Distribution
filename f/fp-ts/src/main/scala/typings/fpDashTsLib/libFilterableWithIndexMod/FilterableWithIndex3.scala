package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableWithIndex3[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I]
  extends fpDashTsLib.libFilterableMod.Filterable3[F]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex3[F, I] {
  /* InferMemberOverrides */
  override val URI: F
  def filterMapWithIndex[U, L, A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
  def filterWithIndex[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
  def partitionMapWithIndex[RL, RR, U, L, A](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, RL], fpDashTsLib.libHKTMod.Type3[F, U, L, RR]]
  def partitionWithIndex[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, A], fpDashTsLib.libHKTMod.Type3[F, U, L, A]]
}

object FilterableWithIndex3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I](
    URI: F,
    compact: fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    filter: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], fpDashTsLib.libFunctionMod.Predicate[js.Any]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    filterMap: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    filterMapWithIndex: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function2[/* i */ I, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    filterWithIndex: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function2[/* i */ I, js.Any, scala.Boolean]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    mapWithIndex: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function2[I, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    partition: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], fpDashTsLib.libFunctionMod.Predicate[js.Any]) => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    partitionMap: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    partitionMapWithIndex: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function2[/* i */ I, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    partitionWithIndex: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function2[/* i */ I, js.Any, scala.Boolean]) => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    separate: fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ]
  ): FilterableWithIndex3[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), filterMapWithIndex = js.Any.fromFunction2(filterMapWithIndex), filterWithIndex = js.Any.fromFunction2(filterWithIndex), map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), partitionMapWithIndex = js.Any.fromFunction2(partitionMapWithIndex), partitionWithIndex = js.Any.fromFunction2(partitionWithIndex), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[FilterableWithIndex3[F, I]]
  }
}

