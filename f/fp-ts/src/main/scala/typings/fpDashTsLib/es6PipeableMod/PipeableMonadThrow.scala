package typings
package fpDashTsLib.es6PipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeableMonadThrow[F] extends js.Object {
  def filterOrElse[E, A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, A]] = js.native
  @JSName("filterOrElse")
  def filterOrElse_EABA[E, A, B /* <: A */](refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6HKTMod.HKT[F, B]] = js.native
  def fromEither[E, A](ma: fpDashTsLib.es6EitherMod.Either[E, A]): fpDashTsLib.es6HKTMod.HKT[F, A] = js.native
  def fromOption[E](onNone: js.Function0[E]): js.Function1[/* ma */ fpDashTsLib.es6OptionMod.Option[_], fpDashTsLib.es6HKTMod.HKT[F, _]] = js.native
  def fromPredicate[E, A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.HKT[F, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_EABA[E, A, B /* <: A */](refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.HKT[F, B]] = js.native
}

