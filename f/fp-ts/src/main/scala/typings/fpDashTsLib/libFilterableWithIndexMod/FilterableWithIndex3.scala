package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableWithIndex3[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I]
  extends fpDashTsLib.libFilterableMod.Filterable3[F]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex3[F, I] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filterMapWithIndex[U, L, A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B] = js.native
  def filterWithIndex[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libHKTMod.Type3[F, U, L, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_ULABA[U, L, A, B /* <: A */](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.libHKTMod.Type3[F, U, L, B] = js.native
  def partitionMapWithIndex[RL, RR, U, L, A](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, RL], fpDashTsLib.libHKTMod.Type3[F, U, L, RR]] = js.native
  def partitionWithIndex[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, A], fpDashTsLib.libHKTMod.Type3[F, U, L, A]] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_ULABA[U, L, A, B /* <: A */](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, A], fpDashTsLib.libHKTMod.Type3[F, U, L, B]] = js.native
}

