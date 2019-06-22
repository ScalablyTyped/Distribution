package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeableMonadThrow4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  def filterOrElse[E, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind4[F, _, _, E, A], 
    fpDashTsLib.libHKTMod.Kind4[F, _, _, E, A]
  ] = js.native
  @JSName("filterOrElse")
  def filterOrElse_EABA[E, A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind4[F, _, _, E, A], 
    fpDashTsLib.libHKTMod.Kind4[F, _, _, E, B]
  ] = js.native
  def fromEither[X, U, E, A](ma: fpDashTsLib.libEitherMod.Either[E, A]): fpDashTsLib.libHKTMod.Kind4[F, X, U, E, A] = js.native
  def fromOption[E](onNone: js.Function0[E]): js.Function1[
    /* ma */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind4[F, _, _, E, _]
  ] = js.native
  def fromPredicate[E, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind4[F, _, _, E, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_EABA[E, A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind4[F, _, _, E, B]] = js.native
}

