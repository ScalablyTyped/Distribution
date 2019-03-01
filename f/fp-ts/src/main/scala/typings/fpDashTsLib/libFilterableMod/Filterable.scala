package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filterable[F]
  extends fpDashTsLib.libFunctorMod.Functor[F]
     with fpDashTsLib.libCompactableMod.Compactable[F] {
  /* InferMemberOverrides */
  override val URI: F
  /**
    * Filter a data structure based on a boolean predicate.
    */
  def filter[A](fa: fpDashTsLib.libHKTMod.HKT[F, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.HKT[F, A]
  /**
    * Map over a data structure and filter based on an option predicate.
    */
  def filterMap[A, B](
    fa: fpDashTsLib.libHKTMod.HKT[F, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.HKT[F, B]
  /**
    * Partition a data structure based on a boolean predicate.
    */
  def partition[A](fa: fpDashTsLib.libHKTMod.HKT[F, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libHKTMod.HKT[F, A]]
  /**
    * Partition a data structure based on an either predicate.
    */
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.HKT[F, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, RL], fpDashTsLib.libHKTMod.HKT[F, RR]]
}

object Filterable {
  @scala.inline
  def apply[F](
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
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, js.Any], 
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
    separate: js.Function1[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, js.Any], fpDashTsLib.libHKTMod.HKT[F, js.Any]]
    ]
  ): Filterable[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("compact")(compact)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("filterMap")(filterMap)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("partition")(partition)
    __obj.updateDynamic("partitionMap")(partitionMap)
    __obj.updateDynamic("separate")(separate)
    __obj.asInstanceOf[Filterable[F]]
  }
}

