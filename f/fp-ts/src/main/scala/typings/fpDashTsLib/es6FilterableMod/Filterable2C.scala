package typings
package fpDashTsLib.es6FilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filterable2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L]
  extends fpDashTsLib.es6FunctorMod.Functor2C[F, L]
     with fpDashTsLib.es6CompactableMod.Compactable2C[F, L] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  /* InferMemberOverrides */
  override val _L: L = js.native
  def filter[A](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6HKTMod.Type2[F, L, A] = js.native
  def filterMap[A, B](
    fa: fpDashTsLib.es6HKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Type2[F, L, B] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]): fpDashTsLib.es6HKTMod.Type2[F, L, B] = js.native
  def partition[A](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type2[F, L, A], fpDashTsLib.es6HKTMod.Type2[F, L, A]] = js.native
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.es6HKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type2[F, L, RL], fpDashTsLib.es6HKTMod.Type2[F, L, RR]] = js.native
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type2[F, L, A], fpDashTsLib.es6HKTMod.Type2[F, L, B]] = js.native
}

