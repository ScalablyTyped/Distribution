package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "readerTaskEither")
@js.native
object readerTaskEitherNs extends js.Object {
  @js.native
  class ReaderTaskEither[E, L, A] protected ()
    extends fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, L, A] {
    def this(value: js.Function1[/* e */ E, fpDashTsLib.es6TaskEitherMod.TaskEither[L, A]]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither = js.native
  val readerTaskEither: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.es6ReaderTaskEitherMod.URI] with fpDashTsLib.es6BifunctorMod.Bifunctor3[fpDashTsLib.es6ReaderTaskEitherMod.URI] with fpDashTsLib.es6AltMod.Alt3[fpDashTsLib.es6ReaderTaskEitherMod.URI] with fpDashTsLib.es6MonadIOMod.MonadIO3[fpDashTsLib.es6ReaderTaskEitherMod.URI] with fpDashTsLib.es6MonadTaskMod.MonadTask3[fpDashTsLib.es6ReaderTaskEitherMod.URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow3[fpDashTsLib.es6ReaderTaskEitherMod.URI] = js.native
  val readerTaskEitherSeq: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.es6ReaderTaskEitherMod.URI] with fpDashTsLib.es6BifunctorMod.Bifunctor3[fpDashTsLib.es6ReaderTaskEitherMod.URI] with fpDashTsLib.es6AltMod.Alt3[fpDashTsLib.es6ReaderTaskEitherMod.URI] with fpDashTsLib.es6MonadIOMod.MonadIO3[fpDashTsLib.es6ReaderTaskEitherMod.URI] with fpDashTsLib.es6MonadTaskMod.MonadTask3[fpDashTsLib.es6ReaderTaskEitherMod.URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow3[fpDashTsLib.es6ReaderTaskEitherMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, bimap, chain, chainFirst, flatten, map, mapLeft, fromOption, fromPredicate, filterOrElse) */ def alt[U, L, A](that: js.Function0[fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[U, L, A]]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[U, L, A], 
    fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[U, L, A]
  ] = js.native
  def ask[E, L](): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, L, E] = js.native
  def asks[E, L, A](f: js.Function1[/* e */ E, A]): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromEither[E, L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromIO[E, L, A](fa: fpDashTsLib.es6IOMod.IO[A]): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromIOEither[E, L, A](fa: fpDashTsLib.es6IOEitherMod.IOEither[L, A]): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromLeft[E, L, A](l: L): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromReader[E, L, A](fa: fpDashTsLib.es6ReaderMod.Reader[E, A]): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromTaskEither[E, L, A](fa: fpDashTsLib.es6TaskEitherMod.TaskEither[L, A]): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def left[E, L, A](fa: fpDashTsLib.es6TaskMod.Task[L]): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def left2v[R, E, A](e: E): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[R, E, A] = js.native
  def leftTask[R, E, A](fa: fpDashTsLib.es6TaskMod.Task[E]): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[R, E, A] = js.native
  def local[E, E2](f: js.Function1[/* e */ E2, E]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, _, _], 
    fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E2, _, _]
  ] = js.native
  def right[E, L, A](fa: fpDashTsLib.es6TaskMod.Task[A]): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def right2v[R, E, A](a: A): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[R, E, A] = js.native
  def rightIO[R, E, A](ma: fpDashTsLib.es6IOMod.IO[A]): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[R, E, A] = js.native
  def rightReader[R, E, A](ma: fpDashTsLib.es6ReaderMod.Reader[R, A]): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[R, E, A] = js.native
  def rightTask[R, E, A](fa: fpDashTsLib.es6TaskMod.Task[A]): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[R, E, A] = js.native
  def tryCatch[E, L, A](
    f: js.Function1[/* e */ E, js.Promise[A]],
    onrejected: js.Function2[/* reason */ js.Any, /* e */ E, L]
  ): fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
}

