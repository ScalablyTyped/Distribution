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
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    filter: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    filterMap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    filterMapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function2[/* i */ I, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    filterWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function2[/* i */ I, js.Any, scala.Boolean], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function2[I, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    partition: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
      ]
    ],
    partitionMap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
      ]
    ],
    partitionMapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function2[/* i */ I, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
      ]
    ],
    partitionWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function2[/* i */ I, js.Any, scala.Boolean], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
      ]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
      ]
    ]
  ): FilterableWithIndex3[F, I] = {
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
    __obj.asInstanceOf[FilterableWithIndex3[F, I]]
  }
}

