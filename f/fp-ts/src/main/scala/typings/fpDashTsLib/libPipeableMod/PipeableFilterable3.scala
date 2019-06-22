package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeableFilterable3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends PipeableCompactable3[F] {
  def filter[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libHKTMod.Kind3[F, _, _, A]
  ] = js.native
  def filterMap[A, B](f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libHKTMod.Kind3[F, _, _, A]
  ] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libHKTMod.Kind3[F, _, _, B]
  ] = js.native
  def partition[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[F, _, _, A], fpDashTsLib.libHKTMod.Kind3[F, _, _, A]]
  ] = js.native
  def partitionMap[A, RL, RR](f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[F, _, _, RL], fpDashTsLib.libHKTMod.Kind3[F, _, _, RR]]
  ] = js.native
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[F, _, _, A], fpDashTsLib.libHKTMod.Kind3[F, _, _, B]]
  ] = js.native
}

