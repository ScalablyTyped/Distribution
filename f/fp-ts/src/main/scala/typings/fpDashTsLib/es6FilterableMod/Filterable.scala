package typings
package fpDashTsLib.es6FilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filterable[F]
  extends fpDashTsLib.es6FunctorMod.Functor[F]
     with fpDashTsLib.es6CompactableMod.Compactable[F] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  /**
    * Filter a data structure based on a boolean predicate.
    */
  def filter[A](fa: fpDashTsLib.es6HKTMod.HKT[F, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6HKTMod.HKT[F, A] = js.native
  /**
    * Map over a data structure and filter based on an option predicate.
    */
  def filterMap[A, B](
    fa: fpDashTsLib.es6HKTMod.HKT[F, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.HKT[F, B] = js.native
  /**
    * Filter a data structure based on a boolean predicate.
    */
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.HKT[F, A], refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]): fpDashTsLib.es6HKTMod.HKT[F, B] = js.native
  /**
    * Partition a data structure based on a boolean predicate.
    */
  def partition[A](fa: fpDashTsLib.es6HKTMod.HKT[F, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, A]] = js.native
  /**
    * Partition a data structure based on an either predicate.
    */
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.es6HKTMod.HKT[F, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.HKT[F, RL], fpDashTsLib.es6HKTMod.HKT[F, RR]] = js.native
  /**
    * Partition a data structure based on a boolean predicate.
    */
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.HKT[F, A], refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, B]] = js.native
}

