package typings
package fpDashTsLib.libReaderTaskEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/ReaderTaskEither", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* ReaderTaskEither */ java.lang.String = js.native
  val readerTaskEither: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libAltMod.Alt3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadIOMod.MonadIO3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadTaskMod.MonadTask3[fpDashTsLib.libReaderTaskEitherMod.URI] = js.native
  val readerTaskEitherSeq: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libAltMod.Alt3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadIOMod.MonadIO3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadTaskMod.MonadTask3[fpDashTsLib.libReaderTaskEitherMod.URI] = js.native
  def ask[E, L](): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, E] = js.native
  def asks[E, L, A](f: js.Function1[/* e */ E, A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromEither[E, L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromIO[E, L, A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromIOEither[E, L, A](fa: fpDashTsLib.libIOEitherMod.IOEither[L, A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromLeft[E, L, A](l: L): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromPredicate[E, L, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], whenFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_ELABA[E, L, A, B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B], whenFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, B]] = js.native
  def fromReader[E, L, A](fa: fpDashTsLib.libReaderMod.Reader[E, A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromTaskEither[E, L, A](fa: fpDashTsLib.libTaskEitherMod.TaskEither[L, A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def left[E, L, A](fa: fpDashTsLib.libTaskMod.Task[L]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def local[E, E2](f: js.Function1[/* e */ E2, E]): js.Function1[
    /* fa */ fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, _, _], 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E2, _, _]
  ] = js.native
  def right[E, L, A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def tryCatch[E, L, A](
    f: js.Function1[/* e */ E, js.Promise[A]],
    onrejected: js.Function2[/* reason */ js.Any, /* e */ E, L]
  ): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
}

