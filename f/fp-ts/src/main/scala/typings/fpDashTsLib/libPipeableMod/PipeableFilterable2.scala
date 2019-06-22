package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeableFilterable2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends PipeableCompactable2[F] {
  def filter[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libHKTMod.Kind2[F, _, A]
  ] = js.native
  def filterMap[A, B](f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libHKTMod.Kind2[F, _, B]
  ] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libHKTMod.Kind2[F, _, B]
  ] = js.native
  def partition[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, _, A], fpDashTsLib.libHKTMod.Kind2[F, _, A]]
  ] = js.native
  def partitionMap[A, RL, RR](f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, _, RL], fpDashTsLib.libHKTMod.Kind2[F, _, RR]]
  ] = js.native
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, _, A], fpDashTsLib.libHKTMod.Kind2[F, _, B]]
  ] = js.native
}

