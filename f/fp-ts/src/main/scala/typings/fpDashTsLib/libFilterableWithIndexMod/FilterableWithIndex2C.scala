package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableWithIndex2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I, L]
  extends fpDashTsLib.libFilterableMod.Filterable2C[F, L]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex2C[F, I, L] {
  /* InferMemberOverrides */
  override val URI: F
  /* InferMemberOverrides */
  override val _L: L
  def filterMapWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
  def filterWithIndex[A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libHKTMod.Type2[F, L, A]
  def partitionMapWithIndex[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, RL], fpDashTsLib.libHKTMod.Type2[F, L, RR]]
  def partitionWithIndex[A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libHKTMod.Type2[F, L, A]]
}

object FilterableWithIndex2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I, L](
    URI: F,
    _L: L,
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    filter: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    filterMap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    filterMapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function2[/* i */ I, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    filterWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function2[/* i */ I, js.Any, scala.Boolean], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function2[I, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    partition: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
      ]
    ],
    partitionMap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
      ]
    ],
    partitionMapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function2[/* i */ I, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
      ]
    ],
    partitionWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function2[/* i */ I, js.Any, scala.Boolean], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
      ]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
        fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
      ]
    ]
  ): FilterableWithIndex2C[F, I, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], compact = compact, filter = filter, filterMap = filterMap, filterMapWithIndex = filterMapWithIndex, filterWithIndex = filterWithIndex, map = map, mapWithIndex = mapWithIndex, partition = partition, partitionMap = partitionMap, partitionMapWithIndex = partitionMapWithIndex, partitionWithIndex = partitionWithIndex, separate = separate)
  
    __obj.asInstanceOf[FilterableWithIndex2C[F, I, L]]
  }
}

