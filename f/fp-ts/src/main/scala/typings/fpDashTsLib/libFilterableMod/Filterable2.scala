package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filterable2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.Functor2[F]
     with fpDashTsLib.libCompactableMod.Compactable2[F] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filter[L, A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Type2[F, L, A] = js.native
  def filterMap[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B] = js.native
  @JSName("filter")
  def filter_LABA[L, A, B /* <: A */](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libHKTMod.Type2[F, L, B] = js.native
  def partition[L, A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libHKTMod.Type2[F, L, A]] = js.native
  def partitionMap[RL, RR, L, A](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, RL], fpDashTsLib.libHKTMod.Type2[F, L, RR]] = js.native
  @JSName("partition")
  def partition_LABA[L, A, B /* <: A */](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libHKTMod.Type2[F, L, B]] = js.native
}

