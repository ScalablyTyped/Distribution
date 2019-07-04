package typings
package fpDashTsLib.libReaderTaskEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/ReaderTaskEither", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither = js.native
  val readerTaskEither: fpDashTsLib.libMonadMod.Monad3[URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[URI] with fpDashTsLib.libAltMod.Alt3[URI] with fpDashTsLib.libMonadIOMod.MonadIO3[URI] with fpDashTsLib.libMonadTaskMod.MonadTask3[URI] with fpDashTsLib.libMonadThrowMod.MonadThrow3[URI] = js.native
  val readerTaskEitherSeq: fpDashTsLib.libMonadMod.Monad3[URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[URI] with fpDashTsLib.libAltMod.Alt3[URI] with fpDashTsLib.libMonadIOMod.MonadIO3[URI] with fpDashTsLib.libMonadTaskMod.MonadTask3[URI] with fpDashTsLib.libMonadThrowMod.MonadThrow3[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, bimap, chain, chainFirst, flatten, map, mapLeft, fromOption, fromPredicate, filterOrElse) */ def alt[U, L, A](that: js.Function0[ReaderTaskEither[U, L, A]]): js.Function1[/* fa */ ReaderTaskEither[U, L, A], ReaderTaskEither[U, L, A]] = js.native
  def ask[E, L](): ReaderTaskEither[E, L, E] = js.native
  def asks[E, L, A](f: js.Function1[/* e */ E, A]): ReaderTaskEither[E, L, A] = js.native
  def fromEither[E, L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): ReaderTaskEither[E, L, A] = js.native
  def fromIO[E, L, A](fa: fpDashTsLib.libIOMod.IO[A]): ReaderTaskEither[E, L, A] = js.native
  def fromIOEither[E, L, A](fa: fpDashTsLib.libIOEitherMod.IOEither[L, A]): ReaderTaskEither[E, L, A] = js.native
  def fromLeft[E, L, A](l: L): ReaderTaskEither[E, L, A] = js.native
  def fromReader[E, L, A](fa: fpDashTsLib.libReaderMod.Reader[E, A]): ReaderTaskEither[E, L, A] = js.native
  def fromTaskEither[E, L, A](fa: fpDashTsLib.libTaskEitherMod.TaskEither[L, A]): ReaderTaskEither[E, L, A] = js.native
  def left[E, L, A](fa: fpDashTsLib.libTaskMod.Task[L]): ReaderTaskEither[E, L, A] = js.native
  def left2v[R, E, A](e: E): ReaderTaskEither[R, E, A] = js.native
  def leftTask[R, E, A](fa: fpDashTsLib.libTaskMod.Task[E]): ReaderTaskEither[R, E, A] = js.native
  def local[E, E2](f: js.Function1[/* e */ E2, E]): js.Function1[/* fa */ ReaderTaskEither[E, _, _], ReaderTaskEither[E2, _, _]] = js.native
  def right[E, L, A](fa: fpDashTsLib.libTaskMod.Task[A]): ReaderTaskEither[E, L, A] = js.native
  def right2v[R, E, A](a: A): ReaderTaskEither[R, E, A] = js.native
  def rightIO[R, E, A](ma: fpDashTsLib.libIOMod.IO[A]): ReaderTaskEither[R, E, A] = js.native
  def rightReader[R, E, A](ma: fpDashTsLib.libReaderMod.Reader[R, A]): ReaderTaskEither[R, E, A] = js.native
  def rightTask[R, E, A](fa: fpDashTsLib.libTaskMod.Task[A]): ReaderTaskEither[R, E, A] = js.native
  def tryCatch[E, L, A](
    f: js.Function1[/* e */ E, js.Promise[A]],
    onrejected: js.Function2[/* reason */ js.Any, /* e */ E, L]
  ): ReaderTaskEither[E, L, A] = js.native
}

