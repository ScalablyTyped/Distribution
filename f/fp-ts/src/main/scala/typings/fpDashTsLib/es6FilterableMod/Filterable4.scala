package typings
package fpDashTsLib.es6FilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filterable4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */]
  extends fpDashTsLib.es6FunctorMod.Functor4[F]
     with fpDashTsLib.es6CompactableMod.Compactable4[F] {
  /* InferMemberOverrides */
  override val URI: F = js.native
  def filter[X, U, L, A](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A] = js.native
  def filterMap[X, U, L, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]]
  ): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B] = js.native
  @JSName("filter")
  def filter_XULABA[X, U, L, A, B /* <: A */](
    fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A],
    refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]
  ): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B] = js.native
  def partition[X, U, L, A](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A]
  ] = js.native
  def partitionMap[RL, RR, X, U, L, A](
    fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.es6EitherMod.Either[RL, RR]]
  ): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, RL], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, RR]
  ] = js.native
  @JSName("partition")
  def partition_XULABA[X, U, L, A, B /* <: A */](
    fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A],
    refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]
  ): fpDashTsLib.es6CompactableMod.Separated[
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], 
    fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]
  ] = js.native
}

