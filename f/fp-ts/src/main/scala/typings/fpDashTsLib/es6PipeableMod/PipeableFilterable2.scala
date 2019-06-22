package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeableFilterable2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends PipeableCompactable2[F] {
  def filter[A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, _, A]
  ] = js.native
  def filterMap[A, B](f: js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, _, B]
  ] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, _, B]
  ] = js.native
  def partition[A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, A], 
    fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind2[F, _, A], fpDashTsLib.es6HKTMod.Kind2[F, _, A]]
  ] = js.native
  def partitionMap[A, RL, RR](f: js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, A], 
    fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind2[F, _, RL], fpDashTsLib.es6HKTMod.Kind2[F, _, RR]]
  ] = js.native
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[F, _, A], 
    fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind2[F, _, A], fpDashTsLib.es6HKTMod.Kind2[F, _, B]]
  ] = js.native
}

