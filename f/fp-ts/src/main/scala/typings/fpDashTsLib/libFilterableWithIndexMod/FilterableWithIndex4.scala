package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableWithIndex4[F /* <: fpDashTsLib.libHKTMod.URIS4 */, I]
  extends fpDashTsLib.libFilterableMod.Filterable4[F]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex4[F, I] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filterMapWithIndex[X, U, L, A, B](
    fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B] = js.native
  def filterWithIndex[X, U, L, A](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_XULABA[X, U, L, A, B /* <: A */](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B] = js.native
  def partitionMapWithIndex[RL, RR, X, U, L, A](
    fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, RL], 
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, RR]
  ] = js.native
  def partitionWithIndex[X, U, L, A](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], predicateWithIndex: PredicateWithIndex[I, A]): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A]
  ] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_XULABA[X, U, L, A, B /* <: A */](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], refinementWithIndex: RefinementWithIndex[I, A, B]): fpDashTsLib.libCompactableMod.Separated[
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B]
  ] = js.native
}

