package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableWithIndex[F, I]
  extends fpDashTsLib.libFilterableMod.Filterable[F]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex[F, I] {
  /* InferMemberOverrides */
  override val URI: F
  def filterMapWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.HKT[F, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.HKT[F, B]
  def filterWithIndex[A](fa: fpDashTsLib.libHKTMod.HKT[F, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libHKTMod.HKT[F, A]
  def partitionMapWithIndex[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.HKT[F, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, RL], fpDashTsLib.libHKTMod.HKT[F, RR]]
  def partitionWithIndex[A](fa: fpDashTsLib.libHKTMod.HKT[F, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libHKTMod.HKT[F, A]]
}

object FilterableWithIndex {
  @scala.inline
  def apply[F, I](
    URI: F,
    compact: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    filter: (fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libFunctionMod.Predicate[js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    filterMap: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    filterMapWithIndex: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function2[/* i */ I, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    filterWithIndex: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function2[/* i */ I, js.Any, scala.Boolean]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    mapWithIndex: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function2[I, js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    partition: (fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libFunctionMod.Predicate[js.Any]) => fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]],
    partitionMap: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]],
    partitionMapWithIndex: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function2[/* i */ I, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]],
    partitionWithIndex: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function2[/* i */ I, js.Any, scala.Boolean]) => fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]],
    separate: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]]
  ): FilterableWithIndex[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), filterMapWithIndex = js.Any.fromFunction2(filterMapWithIndex), filterWithIndex = js.Any.fromFunction2(filterWithIndex), map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), partitionMapWithIndex = js.Any.fromFunction2(partitionMapWithIndex), partitionWithIndex = js.Any.fromFunction2(partitionWithIndex), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[FilterableWithIndex[F, I]]
  }
}

