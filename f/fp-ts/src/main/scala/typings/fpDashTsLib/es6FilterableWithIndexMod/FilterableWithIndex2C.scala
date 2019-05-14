package typings
package fpDashTsLib.es6FilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableWithIndex2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, I, L]
  extends fpDashTsLib.es6FilterableMod.Filterable2C[F, L]
     with fpDashTsLib.es6FunctorWithIndexMod.FunctorWithIndex2C[F, I, L] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  /* InferMemberOverrides */
  override val _L: L = js.native
  def filterMapWithIndex[A, B](
    fa: fpDashTsLib.es6HKTMod.Type2[F, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Type2[F, L, B] = js.native
  def filterWithIndex[A](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6HKTMod.Type2[F, L, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6HKTMod.Type2[F, L, B] = js.native
  def partitionMapWithIndex[RL, RR, A](
    fa: fpDashTsLib.es6HKTMod.Type2[F, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type2[F, L, RL], fpDashTsLib.es6HKTMod.Type2[F, L, RR]] = js.native
  def partitionWithIndex[A](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type2[F, L, A], fpDashTsLib.es6HKTMod.Type2[F, L, A]] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type2[F, L, A], fpDashTsLib.es6HKTMod.Type2[F, L, B]] = js.native
}

