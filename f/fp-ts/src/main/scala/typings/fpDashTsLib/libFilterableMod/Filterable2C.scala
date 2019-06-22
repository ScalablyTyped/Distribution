package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filterable2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFunctorMod.Functor2C[F, L]
     with fpDashTsLib.libCompactableMod.Compactable2C[F, L] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  /* InferMemberOverrides */
  override val _L: L = js.native
  def filter[A](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Kind2[F, L, A] = js.native
  def filterMap[A, B](
    fa: fpDashTsLib.libHKTMod.Kind2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Kind2[F, L, B] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libHKTMod.Kind2[F, L, B] = js.native
  def partition[A](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, L, A], fpDashTsLib.libHKTMod.Kind2[F, L, A]] = js.native
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Kind2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, L, RL], fpDashTsLib.libHKTMod.Kind2[F, L, RR]] = js.native
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, L, A], fpDashTsLib.libHKTMod.Kind2[F, L, B]] = js.native
}

