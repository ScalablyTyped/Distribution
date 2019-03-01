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
    compact: js.Function1[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    filter: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    filterMap: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    filterMapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function2[/* i */ I, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    filterWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function2[/* i */ I, js.Any, scala.Boolean], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function2[I, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    partition: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]]
    ],
    partitionMap: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]]
    ],
    partitionMapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function2[/* i */ I, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]]
    ],
    partitionWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function2[/* i */ I, js.Any, scala.Boolean], 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]]
    ]
  ): FilterableWithIndex[F, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("compact")(compact)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("filterMap")(filterMap)
    __obj.updateDynamic("filterMapWithIndex")(filterMapWithIndex)
    __obj.updateDynamic("filterWithIndex")(filterWithIndex)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("mapWithIndex")(mapWithIndex)
    __obj.updateDynamic("partition")(partition)
    __obj.updateDynamic("partitionMap")(partitionMap)
    __obj.updateDynamic("partitionMapWithIndex")(partitionMapWithIndex)
    __obj.updateDynamic("partitionWithIndex")(partitionWithIndex)
    __obj.updateDynamic("separate")(separate)
    __obj.asInstanceOf[FilterableWithIndex[F, I]]
  }
}

