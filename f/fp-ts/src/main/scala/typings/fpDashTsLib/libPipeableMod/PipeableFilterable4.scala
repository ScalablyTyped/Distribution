package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeableFilterable4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends PipeableCompactable4[F] {
  def filter[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A], 
    fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A]
  ] = js.native
  def filterMap[A, B](f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A], 
    fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A]
  ] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A], 
    fpDashTsLib.libHKTMod.Kind4[F, _, _, _, B]
  ] = js.native
  def partition[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A], 
    fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A], 
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A]
    ]
  ] = js.native
  def partitionMap[A, RL, RR](f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A], 
    fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, RL], 
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, RR]
    ]
  ] = js.native
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A], 
    fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A], 
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, B]
    ]
  ] = js.native
}

