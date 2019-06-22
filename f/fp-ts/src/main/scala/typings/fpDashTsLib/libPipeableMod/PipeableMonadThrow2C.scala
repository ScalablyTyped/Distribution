package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeableMonadThrow2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, E] extends js.Object {
  def filterOrElse[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind2[F, E, A], 
    fpDashTsLib.libHKTMod.Kind2[F, E, A]
  ] = js.native
  @JSName("filterOrElse")
  def filterOrElse_ABA[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* ma */ fpDashTsLib.libHKTMod.Kind2[F, E, A], 
    fpDashTsLib.libHKTMod.Kind2[F, E, B]
  ] = js.native
  def fromEither[A](ma: fpDashTsLib.libEitherMod.Either[E, A]): fpDashTsLib.libHKTMod.Kind2[F, E, A] = js.native
  def fromOption(onNone: js.Function0[E]): js.Function1[/* ma */ fpDashTsLib.libOptionMod.Option[_], fpDashTsLib.libHKTMod.Kind2[F, E, _]] = js.native
  def fromPredicate[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind2[F, E, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_ABA[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind2[F, E, B]] = js.native
}

