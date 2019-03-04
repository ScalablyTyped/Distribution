package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableWithIndex1[F /* <: fpDashTsLib.libHKTMod.URIS */, I]
  extends fpDashTsLib.libFilterableMod.Filterable1[F]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex1[F, I] {
  /* InferMemberOverrides */
  override val URI: F
  def filterMapWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type[F, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type[F, B]
  def filterWithIndex[A](fa: fpDashTsLib.libHKTMod.Type[F, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libHKTMod.Type[F, A]
  def partitionMapWithIndex[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Type[F, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type[F, RL], fpDashTsLib.libHKTMod.Type[F, RR]]
  def partitionWithIndex[A](fa: fpDashTsLib.libHKTMod.Type[F, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type[F, A], fpDashTsLib.libHKTMod.Type[F, A]]
}

object FilterableWithIndex1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, I](
    URI: F,
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    filter: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    filterMap: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    filterMapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function2[/* i */ I, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    filterWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function2[/* i */ I, js.Any, scala.Boolean], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function2[I, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    partition: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      fpDashTsLib.libFunctionMod.Predicate[js.Any], 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type[F, js.Any], fpDashTsLib.libHKTMod.Type[F, js.Any]]
    ],
    partitionMap: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type[F, js.Any], fpDashTsLib.libHKTMod.Type[F, js.Any]]
    ],
    partitionMapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function2[/* i */ I, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type[F, js.Any], fpDashTsLib.libHKTMod.Type[F, js.Any]]
    ],
    partitionWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function2[/* i */ I, js.Any, scala.Boolean], 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type[F, js.Any], fpDashTsLib.libHKTMod.Type[F, js.Any]]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type[F, js.Any], fpDashTsLib.libHKTMod.Type[F, js.Any]]
    ]
  ): FilterableWithIndex1[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = compact, filter = filter, filterMap = filterMap, filterMapWithIndex = filterMapWithIndex, filterWithIndex = filterWithIndex, map = map, mapWithIndex = mapWithIndex, partition = partition, partitionMap = partitionMap, partitionMapWithIndex = partitionMapWithIndex, partitionWithIndex = partitionWithIndex, separate = separate)
  
    __obj.asInstanceOf[FilterableWithIndex1[F, I]]
  }
}

