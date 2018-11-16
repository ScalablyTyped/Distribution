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

