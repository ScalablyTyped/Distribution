package typings
package fpDashTsLib.libReaderTaskEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/ReaderTaskEither", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* ReaderTaskEither */ java.lang.String = js.native
  val readerTaskEither: fpDashTsLib.libMonadMod.Monad3[URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[URI] with fpDashTsLib.libAltMod.Alt3[URI] with fpDashTsLib.libMonadIOMod.MonadIO3[URI] with fpDashTsLib.libMonadTaskMod.MonadTask3[URI] = js.native
  val readerTaskEitherSeq: fpDashTsLib.libMonadMod.Monad3[URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[URI] with fpDashTsLib.libAltMod.Alt3[URI] with fpDashTsLib.libMonadIOMod.MonadIO3[URI] with fpDashTsLib.libMonadTaskMod.MonadTask3[URI] = js.native
  def ask[E, L](): ReaderTaskEither[E, L, E] = js.native
  def asks[E, L, A](f: js.Function1[/* e */ E, A]): ReaderTaskEither[E, L, A] = js.native
  def fromEither[E, L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): ReaderTaskEither[E, L, A] = js.native
  def fromIO[E, L, A](fa: fpDashTsLib.libIOMod.IO[A]): ReaderTaskEither[E, L, A] = js.native
  def fromIOEither[E, L, A](fa: fpDashTsLib.libIOEitherMod.IOEither[L, A]): ReaderTaskEither[E, L, A] = js.native
  def fromLeft[E, L, A](l: L): ReaderTaskEither[E, L, A] = js.native
  def fromPredicate[E, L, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, ReaderTaskEither[E, L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_ELABA[E, L, A, B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, ReaderTaskEither[E, L, B]] = js.native
  def fromReader[E, L, A](fa: fpDashTsLib.libReaderMod.Reader[E, A]): ReaderTaskEither[E, L, A] = js.native
  def fromTaskEither[E, L, A](fa: fpDashTsLib.libTaskEitherMod.TaskEither[L, A]): ReaderTaskEither[E, L, A] = js.native
  def left[E, L, A](fa: fpDashTsLib.libTaskMod.Task[L]): ReaderTaskEither[E, L, A] = js.native
  def local[E, E2](f: js.Function1[/* e */ E2, E]): js.Function1[/* fa */ ReaderTaskEither[E, _, _], ReaderTaskEither[E2, _, _]] = js.native
  def right[E, L, A](fa: fpDashTsLib.libTaskMod.Task[A]): ReaderTaskEither[E, L, A] = js.native
  def tryCatch[E, L, A](
    f: js.Function1[/* e */ E, js.Promise[A]],
    onrejected: js.Function2[/* reason */ js.Any, /* e */ E, L]
  ): ReaderTaskEither[E, L, A] = js.native
}

