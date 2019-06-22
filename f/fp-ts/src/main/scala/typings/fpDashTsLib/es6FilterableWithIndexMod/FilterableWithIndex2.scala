package typings
package fpDashTsLib.es6FilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableWithIndex2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, I]
  extends fpDashTsLib.es6FilterableMod.Filterable2[F]
     with fpDashTsLib.es6FunctorWithIndexMod.FunctorWithIndex2[F, I] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filterMapWithIndex[L, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Kind2[F, L, B] = js.native
  def filterWithIndex[L, A](fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6HKTMod.Kind2[F, L, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_LABA[L, A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6HKTMod.Kind2[F, L, B] = js.native
  def partitionMapWithIndex[RL, RR, L, A](
    fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind2[F, L, RL], fpDashTsLib.es6HKTMod.Kind2[F, L, RR]] = js.native
  def partitionWithIndex[L, A](fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind2[F, L, A], fpDashTsLib.es6HKTMod.Kind2[F, L, A]] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_LABA[L, A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind2[F, L, A], fpDashTsLib.es6HKTMod.Kind2[F, L, B]] = js.native
}

