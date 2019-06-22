package typings
package fpDashTsLib.es6FilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filterable3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6FunctorMod.Functor3[F]
     with fpDashTsLib.es6CompactableMod.Compactable3[F] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filter[U, L, A](fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6HKTMod.Kind3[F, U, L, A] = js.native
  def filterMap[U, L, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Kind3[F, U, L, B] = js.native
  @JSName("filter")
  def filter_ULABA[U, L, A, B /* <: A */](
    fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A],
    refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]
  ): fpDashTsLib.es6HKTMod.Kind3[F, U, L, B] = js.native
  def partition[U, L, A](fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]] = js.native
  def partitionMap[RL, RR, U, L, A](
    fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind3[F, U, L, RL], fpDashTsLib.es6HKTMod.Kind3[F, U, L, RR]] = js.native
  @JSName("partition")
  def partition_ULABA[U, L, A, B /* <: A */](
    fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A],
    refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]
  ): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]] = js.native
}

