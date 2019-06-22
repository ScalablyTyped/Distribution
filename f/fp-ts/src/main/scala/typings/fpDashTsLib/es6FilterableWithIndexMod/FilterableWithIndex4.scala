package typings
package fpDashTsLib.es6FilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableWithIndex4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */, I]
  extends fpDashTsLib.es6FilterableMod.Filterable4[F]
     with fpDashTsLib.es6FunctorWithIndexMod.FunctorWithIndex4[F, I] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filterMapWithIndex[X, U, L, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B] = js.native
  def filterWithIndex[X, U, L, A](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_XULABA[X, U, L, A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B] = js.native
  def partitionMapWithIndex[RL, RR, X, U, L, A](
    fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, RL], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, RR]
  ] = js.native
  def partitionWithIndex[X, U, L, A](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]
  ] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_XULABA[X, U, L, A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]
  ] = js.native
}

