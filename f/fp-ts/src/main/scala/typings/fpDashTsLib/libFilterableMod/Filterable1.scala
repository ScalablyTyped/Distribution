package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filterable1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.Functor1[F]
     with fpDashTsLib.libCompactableMod.Compactable1[F] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filter[A](fa: fpDashTsLib.libHKTMod.Kind[F, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Kind[F, A] = js.native
  def filterMap[A, B](
    fa: fpDashTsLib.libHKTMod.Kind[F, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Kind[F, B] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](fa: fpDashTsLib.libHKTMod.Kind[F, A], refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libHKTMod.Kind[F, B] = js.native
  def partition[A](fa: fpDashTsLib.libHKTMod.Kind[F, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, A]] = js.native
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Kind[F, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind[F, RL], fpDashTsLib.libHKTMod.Kind[F, RR]] = js.native
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](fa: fpDashTsLib.libHKTMod.Kind[F, A], refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, B]] = js.native
}

