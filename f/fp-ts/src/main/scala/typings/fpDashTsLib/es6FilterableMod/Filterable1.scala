package typings
package fpDashTsLib.es6FilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filterable1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6FunctorMod.Functor1[F]
     with fpDashTsLib.es6CompactableMod.Compactable1[F] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filter[A](fa: fpDashTsLib.es6HKTMod.Kind[F, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6HKTMod.Kind[F, A] = js.native
  def filterMap[A, B](
    fa: fpDashTsLib.es6HKTMod.Kind[F, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Kind[F, B] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Kind[F, A], refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]): fpDashTsLib.es6HKTMod.Kind[F, B] = js.native
  def partition[A](fa: fpDashTsLib.es6HKTMod.Kind[F, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind[F, A], fpDashTsLib.es6HKTMod.Kind[F, A]] = js.native
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.es6HKTMod.Kind[F, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind[F, RL], fpDashTsLib.es6HKTMod.Kind[F, RR]] = js.native
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](fa: fpDashTsLib.es6HKTMod.Kind[F, A], refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]): fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Kind[F, A], fpDashTsLib.es6HKTMod.Kind[F, B]] = js.native
}

