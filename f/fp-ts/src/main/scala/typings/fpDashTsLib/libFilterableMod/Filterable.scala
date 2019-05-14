package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filterable[F]
  extends fpDashTsLib.libFunctorMod.Functor[F]
     with fpDashTsLib.libCompactableMod.Compactable[F] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  /**
    * Filter a data structure based on a boolean predicate.
    */
  def filter[A](fa: fpDashTsLib.libHKTMod.HKT[F, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.HKT[F, A] = js.native
  /**
    * Map over a data structure and filter based on an option predicate.
    */
  def filterMap[A, B](
    fa: fpDashTsLib.libHKTMod.HKT[F, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.HKT[F, B] = js.native
  /**
    * Filter a data structure based on a boolean predicate.
    */
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](fa: fpDashTsLib.libHKTMod.HKT[F, A], refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libHKTMod.HKT[F, B] = js.native
  /**
    * Partition a data structure based on a boolean predicate.
    */
  def partition[A](fa: fpDashTsLib.libHKTMod.HKT[F, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libHKTMod.HKT[F, A]] = js.native
  /**
    * Partition a data structure based on an either predicate.
    */
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.HKT[F, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, RL], fpDashTsLib.libHKTMod.HKT[F, RR]] = js.native
  /**
    * Partition a data structure based on a boolean predicate.
    */
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](fa: fpDashTsLib.libHKTMod.HKT[F, A], refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libHKTMod.HKT[F, B]] = js.native
}

