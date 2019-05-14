package typings
package fpDashTsLib.es6FilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableWithIndex1[F /* <: fpDashTsLib.es6HKTMod.URIS */, I]
  extends fpDashTsLib.es6FilterableMod.Filterable1[F]
     with fpDashTsLib.es6FunctorWithIndexMod.FunctorWithIndex1[F, I] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filterMapWithIndex[A, B](
    fa: fpDashTsLib.es6HKTMod.Type[F, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Type[F, B] = js.native
  def filterWithIndex[A](fa: fpDashTsLib.es6HKTMod.Type[F, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6HKTMod.Type[F, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Type[F, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6HKTMod.Type[F, B] = js.native
  def partitionMapWithIndex[RL, RR, A](
    fa: fpDashTsLib.es6HKTMod.Type[F, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[F, RL], fpDashTsLib.es6HKTMod.Type[F, RR]] = js.native
  def partitionWithIndex[A](fa: fpDashTsLib.es6HKTMod.Type[F, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[F, A], fpDashTsLib.es6HKTMod.Type[F, A]] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Type[F, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[F, A], fpDashTsLib.es6HKTMod.Type[F, B]] = js.native
}

