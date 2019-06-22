package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filterable4[F /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libFunctorMod.Functor4[F]
     with fpDashTsLib.libCompactableMod.Compactable4[F] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filter[X, U, L, A](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A] = js.native
  def filterMap[X, U, L, A, B](
    fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B] = js.native
  @JSName("filter")
  def filter_XULABA[X, U, L, A, B /* <: A */](
    fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A],
    refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B] = js.native
  def partition[X, U, L, A](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]
  ] = js.native
  def partitionMap[RL, RR, X, U, L, A](
    fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, RL], 
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, RR]
  ] = js.native
  @JSName("partition")
  def partition_XULABA[X, U, L, A, B /* <: A */](
    fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A],
    refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B]
  ] = js.native
}

