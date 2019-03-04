package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableWithIndex2[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I]
  extends fpDashTsLib.libFilterableMod.Filterable2[F]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex2[F, I] {
  /* InferMemberOverrides */
  override val URI: F
  def filterMapWithIndex[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
  def filterWithIndex[L, A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libHKTMod.Type2[F, L, A]
  def partitionMapWithIndex[RL, RR, L, A](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, RL], fpDashTsLib.libHKTMod.Type2[F, L, RR]]
  def partitionWithIndex[L, A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libHKTMod.Type2[F, L, A]]
}

object FilterableWithIndex2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I](
    URI: F,
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    filter: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    filterMap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    filterMapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function2[/* i */ I, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    filterWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function2[/* i */ I, js.Any, scala.Boolean], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function2[I, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    partition: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
      ]
    ],
    partitionMap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
      ]
    ],
    partitionMapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function2[/* i */ I, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
      ]
    ],
    partitionWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function2[/* i */ I, js.Any, scala.Boolean], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
      ]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
      ]
    ]
  ): FilterableWithIndex2[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = compact, filter = filter, filterMap = filterMap, filterMapWithIndex = filterMapWithIndex, filterWithIndex = filterWithIndex, map = map, mapWithIndex = mapWithIndex, partition = partition, partitionMap = partitionMap, partitionMapWithIndex = partitionMapWithIndex, partitionWithIndex = partitionWithIndex, separate = separate)
  
    __obj.asInstanceOf[FilterableWithIndex2[F, I]]
  }
}

