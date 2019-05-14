package typings
package fpDashTsLib.es6FilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableWithIndex[F, I]
  extends fpDashTsLib.es6FilterableMod.Filterable[F]
     with fpDashTsLib.es6FunctorWithIndexMod.FunctorWithIndex[F, I] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filterMapWithIndex[A, B](
    fa: fpDashTsLib.es6HKTMod.HKT[F, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.HKT[F, B] = js.native
  def filterWithIndex[A](fa: fpDashTsLib.es6HKTMod.HKT[F, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6HKTMod.HKT[F, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.HKT[F, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6HKTMod.HKT[F, B] = js.native
  def partitionMapWithIndex[RL, RR, A](
    fa: fpDashTsLib.es6HKTMod.HKT[F, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.HKT[F, RL], fpDashTsLib.es6HKTMod.HKT[F, RR]] = js.native
  def partitionWithIndex[A](fa: fpDashTsLib.es6HKTMod.HKT[F, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, A]] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.HKT[F, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, B]] = js.native
}

