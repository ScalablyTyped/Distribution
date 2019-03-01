package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableWithIndex3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I, U, L]
  extends fpDashTsLib.libFilterableMod.Filterable3C[F, U, L]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex3C[F, I, U, L] {
  /* InferMemberOverrides */
  override val URI: F
  /* InferMemberOverrides */
  override val _L: L
  /* InferMemberOverrides */
  override val _U: U
  def filterMapWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
  def filterWithIndex[A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
  def partitionMapWithIndex[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, RL], fpDashTsLib.libHKTMod.Type3[F, U, L, RR]]
  def partitionWithIndex[A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, A], fpDashTsLib.libHKTMod.Type3[F, U, L, A]]
}

object FilterableWithIndex3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I, U, L](
    URI: F,
    _L: L,
    _U: U,
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    filter: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    filterMap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    filterMapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function2[/* i */ I, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    filterWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function2[/* i */ I, js.Any, scala.Boolean], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function2[I, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    partition: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
        fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
      ]
    ],
    partitionMap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
        fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
      ]
    ],
    partitionMapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function2[/* i */ I, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
        fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
      ]
    ],
    partitionWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function2[/* i */ I, js.Any, scala.Boolean], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
        fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
      ]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
        fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
      ]
    ]
  ): FilterableWithIndex3C[F, I, U, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("_U")(_U.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[FilterableWithIndex3C[F, I, U, L]]
  }
}

