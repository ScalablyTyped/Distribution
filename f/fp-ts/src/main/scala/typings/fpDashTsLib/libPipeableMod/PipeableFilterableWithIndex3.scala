package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeableFilterableWithIndex3[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I] extends PipeableFilterable3[F] {
  def filterMapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libHKTMod.Kind3[F, _, _, A]
  ] = js.native
  def filterWithIndex[A](predicateWithIndex: fpDashTsLib.libFilterableWithIndexMod.PredicateWithIndex[I, A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libHKTMod.Kind3[F, _, _, A]
  ] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_ABA[A, B /* <: A */](refinementWithIndex: fpDashTsLib.libFilterableWithIndexMod.RefinementWithIndex[I, A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libHKTMod.Kind3[F, _, _, B]
  ] = js.native
  def partitionMapWithIndex[A, RL, RR](f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[F, _, _, RL], fpDashTsLib.libHKTMod.Kind3[F, _, _, RR]]
  ] = js.native
  def partitionWithIndex[A](predicateWithIndex: fpDashTsLib.libFilterableWithIndexMod.PredicateWithIndex[I, A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[F, _, _, A], fpDashTsLib.libHKTMod.Kind3[F, _, _, A]]
  ] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_ABA[A, B /* <: A */](refinementWithIndex: fpDashTsLib.libFilterableWithIndexMod.RefinementWithIndex[I, A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind3[F, _, _, A], fpDashTsLib.libHKTMod.Kind3[F, _, _, B]]
  ] = js.native
}

