package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filterable1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.Functor1[F]
     with fpDashTsLib.libCompactableMod.Compactable1[F] {
  /* InferMemberOverrides */
  override val URI: F
  def filter[A](fa: fpDashTsLib.libHKTMod.Type[F, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Type[F, A]
  def filterMap[A, B](
    fa: fpDashTsLib.libHKTMod.Type[F, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type[F, B]
  def partition[A](fa: fpDashTsLib.libHKTMod.Type[F, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type[F, A], fpDashTsLib.libHKTMod.Type[F, A]]
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Type[F, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type[F, RL], fpDashTsLib.libHKTMod.Type[F, RR]]
}

object Filterable1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
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
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, js.Any], 
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
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type[F, js.Any], fpDashTsLib.libHKTMod.Type[F, js.Any]]
    ]
  ): Filterable1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = compact, filter = filter, filterMap = filterMap, map = map, partition = partition, partitionMap = partitionMap, separate = separate)
  
    __obj.asInstanceOf[Filterable1[F]]
  }
}

