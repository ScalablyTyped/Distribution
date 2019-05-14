package typings
package fpDashTsLib.es6FilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableWithIndex3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, I]
  extends fpDashTsLib.es6FilterableMod.Filterable3[F]
     with fpDashTsLib.es6FunctorWithIndexMod.FunctorWithIndex3[F, I] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filterMapWithIndex[U, L, A, B](
    fa: fpDashTsLib.es6HKTMod.Type3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Type3[F, U, L, B] = js.native
  def filterWithIndex[U, L, A](fa: fpDashTsLib.es6HKTMod.Type3[F, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6HKTMod.Type3[F, U, L, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_ULABA[U, L, A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Type3[F, U, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6HKTMod.Type3[F, U, L, B] = js.native
  def partitionMapWithIndex[RL, RR, U, L, A](
    fa: fpDashTsLib.es6HKTMod.Type3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type3[F, U, L, RL], fpDashTsLib.es6HKTMod.Type3[F, U, L, RR]] = js.native
  def partitionWithIndex[U, L, A](fa: fpDashTsLib.es6HKTMod.Type3[F, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type3[F, U, L, A], fpDashTsLib.es6HKTMod.Type3[F, U, L, A]] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_ULABA[U, L, A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Type3[F, U, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type3[F, U, L, A], fpDashTsLib.es6HKTMod.Type3[F, U, L, B]] = js.native
}

