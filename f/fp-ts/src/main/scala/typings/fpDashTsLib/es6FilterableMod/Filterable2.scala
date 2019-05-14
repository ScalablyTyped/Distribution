package typings
package fpDashTsLib.es6FilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filterable2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6FunctorMod.Functor2[F]
     with fpDashTsLib.es6CompactableMod.Compactable2[F] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filter[L, A](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6HKTMod.Type2[F, L, A] = js.native
  def filterMap[L, A, B](
    fa: fpDashTsLib.es6HKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Type2[F, L, B] = js.native
  @JSName("filter")
  def filter_LABA[L, A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]): fpDashTsLib.es6HKTMod.Type2[F, L, B] = js.native
  def partition[L, A](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type2[F, L, A], fpDashTsLib.es6HKTMod.Type2[F, L, A]] = js.native
  def partitionMap[RL, RR, L, A](
    fa: fpDashTsLib.es6HKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type2[F, L, RL], fpDashTsLib.es6HKTMod.Type2[F, L, RR]] = js.native
  @JSName("partition")
  def partition_LABA[L, A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type2[F, L, A], fpDashTsLib.es6HKTMod.Type2[F, L, B]] = js.native
}

