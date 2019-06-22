package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filterable3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libFunctorMod.Functor3[F]
     with fpDashTsLib.libCompactableMod.Compactable3[F] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filter[U, L, A](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Kind3[F, U, L, A] = js.native
  def filterMap[U, L, A, B](
    fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Kind3[F, U, L, B] = js.native
  @JSName("filter")
  def filter_ULABA[U, L, A, B /* <: A */](
    fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A],
    refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libHKTMod.Kind3[F, U, L, B] = js.native
  def partition[U, L, A](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[F, U, L, A], fpDashTsLib.libHKTMod.Kind3[F, U, L, A]] = js.native
  def partitionMap[RL, RR, U, L, A](
    fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[F, U, L, RL], fpDashTsLib.libHKTMod.Kind3[F, U, L, RR]] = js.native
  @JSName("partition")
  def partition_ULABA[U, L, A, B /* <: A */](
    fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A],
    refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[F, U, L, A], fpDashTsLib.libHKTMod.Kind3[F, U, L, B]] = js.native
}

