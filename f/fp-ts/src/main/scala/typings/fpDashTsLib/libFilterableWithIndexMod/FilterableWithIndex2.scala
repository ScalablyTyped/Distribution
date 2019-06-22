package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableWithIndex2[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I]
  extends fpDashTsLib.libFilterableMod.Filterable2[F]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex2[F, I] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filterMapWithIndex[L, A, B](
    fa: fpDashTsLib.libHKTMod.Kind2[F, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Kind2[F, L, B] = js.native
  def filterWithIndex[L, A](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libHKTMod.Kind2[F, L, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_LABA[L, A, B /* <: A */](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.libHKTMod.Kind2[F, L, B] = js.native
  def partitionMapWithIndex[RL, RR, L, A](
    fa: fpDashTsLib.libHKTMod.Kind2[F, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, L, RL], fpDashTsLib.libHKTMod.Kind2[F, L, RR]] = js.native
  def partitionWithIndex[L, A](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, L, A], fpDashTsLib.libHKTMod.Kind2[F, L, A]] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_LABA[L, A, B /* <: A */](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, L, A], fpDashTsLib.libHKTMod.Kind2[F, L, B]] = js.native
}

