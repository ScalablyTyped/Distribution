package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeableFilterableWithIndex3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, I] extends PipeableFilterable3[F] {
  def filterMapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6OptionMod.Option[B]]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.es6HKTMod.Kind3[F, _, _, A]
  ] = js.native
  def filterWithIndex[A](predicateWithIndex: fpDashTsLib.es6FilterableWithIndexMod.PredicateWithIndex[I, A]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.es6HKTMod.Kind3[F, _, _, A]
  ] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_ABA[A, B /* <: A */](refinementWithIndex: fpDashTsLib.es6FilterableWithIndexMod.RefinementWithIndex[I, A, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.es6HKTMod.Kind3[F, _, _, B]
  ] = js.native
  def partitionMapWithIndex[A, RL, RR](f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind3[F, _, _, RL], fpDashTsLib.es6HKTMod.Kind3[F, _, _, RR]]
  ] = js.native
  def partitionWithIndex[A](predicateWithIndex: fpDashTsLib.es6FilterableWithIndexMod.PredicateWithIndex[I, A]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind3[F, _, _, A], fpDashTsLib.es6HKTMod.Kind3[F, _, _, A]]
  ] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_ABA[A, B /* <: A */](refinementWithIndex: fpDashTsLib.es6FilterableWithIndexMod.RefinementWithIndex[I, A, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind3[F, _, _, A], fpDashTsLib.es6HKTMod.Kind3[F, _, _, B]]
  ] = js.native
}

