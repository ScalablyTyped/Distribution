package typings
package fpDashTsLib.es6FilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableWithIndex3C[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, I, U, L]
  extends fpDashTsLib.es6FilterableMod.Filterable3C[F, U, L]
     with fpDashTsLib.es6FunctorWithIndexMod.FunctorWithIndex3C[F, I, U, L] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  /* InferMemberOverrides */
  override val _L: L = js.native
  /* InferMemberOverrides */
  override val _U: U = js.native
  def filterMapWithIndex[A, B](
    fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Kind3[F, U, L, B] = js.native
  def filterWithIndex[A](fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6HKTMod.Kind3[F, U, L, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6HKTMod.Kind3[F, U, L, B] = js.native
  def partitionMapWithIndex[RL, RR, A](
    fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind3[F, U, L, RL], fpDashTsLib.es6HKTMod.Kind3[F, U, L, RR]] = js.native
  def partitionWithIndex[A](fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]] = js.native
}

