package typings
package fpDashTsLib.es6ReaderTaskEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/ReaderTaskEither", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither = js.native
  val readerTaskEither: fpDashTsLib.es6MonadMod.Monad3[URI] with fpDashTsLib.es6BifunctorMod.Bifunctor3[URI] with fpDashTsLib.es6AltMod.Alt3[URI] with fpDashTsLib.es6MonadIOMod.MonadIO3[URI] with fpDashTsLib.es6MonadTaskMod.MonadTask3[URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow3[URI] = js.native
  val readerTaskEitherSeq: fpDashTsLib.es6MonadMod.Monad3[URI] with fpDashTsLib.es6BifunctorMod.Bifunctor3[URI] with fpDashTsLib.es6AltMod.Alt3[URI] with fpDashTsLib.es6MonadIOMod.MonadIO3[URI] with fpDashTsLib.es6MonadTaskMod.MonadTask3[URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow3[URI] = js.native
  def ask[E, L](): ReaderTaskEither[E, L, E] = js.native
  def asks[E, L, A](f: js.Function1[/* e */ E, A]): ReaderTaskEither[E, L, A] = js.native
  def fromEither[E, L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): ReaderTaskEither[E, L, A] = js.native
  def fromIO[E, L, A](fa: fpDashTsLib.es6IOMod.IO[A]): ReaderTaskEither[E, L, A] = js.native
  def fromIOEither[E, L, A](fa: fpDashTsLib.es6IOEitherMod.IOEither[L, A]): ReaderTaskEither[E, L, A] = js.native
  def fromLeft[E, L, A](l: L): ReaderTaskEither[E, L, A] = js.native
  def fromPredicate[E, L, A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, ReaderTaskEither[E, L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_ELABA[E, L, A, B /* <: A */](predicate: fpDashTsLib.es6FunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, ReaderTaskEither[E, L, B]] = js.native
  def fromReader[E, L, A](fa: fpDashTsLib.es6ReaderMod.Reader[E, A]): ReaderTaskEither[E, L, A] = js.native
  def fromTaskEither[E, L, A](fa: fpDashTsLib.es6TaskEitherMod.TaskEither[L, A]): ReaderTaskEither[E, L, A] = js.native
  def left[E, L, A](fa: fpDashTsLib.es6TaskMod.Task[L]): ReaderTaskEither[E, L, A] = js.native
  def local[E, E2](f: js.Function1[/* e */ E2, E]): js.Function1[/* fa */ ReaderTaskEither[E, _, _], ReaderTaskEither[E2, _, _]] = js.native
  def right[E, L, A](fa: fpDashTsLib.es6TaskMod.Task[A]): ReaderTaskEither[E, L, A] = js.native
  def tryCatch[E, L, A](
    f: js.Function1[/* e */ E, js.Promise[A]],
    onrejected: js.Function2[/* reason */ js.Any, /* e */ E, L]
  ): ReaderTaskEither[E, L, A] = js.native
}

