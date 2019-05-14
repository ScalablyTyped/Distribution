package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableWithIndex[F, I]
  extends fpDashTsLib.libFilterableMod.Filterable[F]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex[F, I] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filterMapWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.HKT[F, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.HKT[F, B] = js.native
  def filterWithIndex[A](fa: fpDashTsLib.libHKTMod.HKT[F, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libHKTMod.HKT[F, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_ABA[A, B /* <: A */](fa: fpDashTsLib.libHKTMod.HKT[F, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.libHKTMod.HKT[F, B] = js.native
  def partitionMapWithIndex[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.HKT[F, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, RL], fpDashTsLib.libHKTMod.HKT[F, RR]] = js.native
  def partitionWithIndex[A](fa: fpDashTsLib.libHKTMod.HKT[F, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libHKTMod.HKT[F, A]] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_ABA[A, B /* <: A */](fa: fpDashTsLib.libHKTMod.HKT[F, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libHKTMod.HKT[F, B]] = js.native
}

