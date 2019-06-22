package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "readerTaskEither")
@js.native
object readerTaskEitherNs extends js.Object {
  @js.native
  class ReaderTaskEither[E, L, A] protected ()
    extends fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] {
    def this(value: js.Function1[/* e */ E, fpDashTsLib.libTaskEitherMod.TaskEither[L, A]]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither = js.native
  val readerTaskEither: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libAltMod.Alt3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadIOMod.MonadIO3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadTaskMod.MonadTask3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadThrowMod.MonadThrow3[fpDashTsLib.libReaderTaskEitherMod.URI] = js.native
  val readerTaskEitherSeq: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libAltMod.Alt3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadIOMod.MonadIO3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadTaskMod.MonadTask3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadThrowMod.MonadThrow3[fpDashTsLib.libReaderTaskEitherMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, bimap, chain, chainFirst, flatten, map, mapLeft, fromOption, fromPredicate, filterOrElse) */ def alt[U, L, A](that: js.Function0[fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[U, L, A]]): js.Function1[
    /* fa */ fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[U, L, A], 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[U, L, A]
  ] = js.native
  def ask[E, L](): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, E] = js.native
  def asks[E, L, A](f: js.Function1[/* e */ E, A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromEither[E, L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromIO[E, L, A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromIOEither[E, L, A](fa: fpDashTsLib.libIOEitherMod.IOEither[L, A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromLeft[E, L, A](l: L): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromReader[E, L, A](fa: fpDashTsLib.libReaderMod.Reader[E, A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def fromTaskEither[E, L, A](fa: fpDashTsLib.libTaskEitherMod.TaskEither[L, A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def left[E, L, A](fa: fpDashTsLib.libTaskMod.Task[L]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def left2v[E, L](e: L): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, scala.Nothing] = js.native
  def leftTask[E, L, A](fa: fpDashTsLib.libTaskMod.Task[L]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def local[E, E2](f: js.Function1[/* e */ E2, E]): js.Function1[
    /* fa */ fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, _, _], 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E2, _, _]
  ] = js.native
  def right[E, L, A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def right2v[E, A](a: A): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, scala.Nothing, A] = js.native
  def rightIO[E, A](ma: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, scala.Nothing, A] = js.native
  def rightReader[E, A](ma: fpDashTsLib.libReaderMod.Reader[E, A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, scala.Nothing, A] = js.native
  def rightTask[E, L, A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
  def tryCatch[E, L, A](
    f: js.Function1[/* e */ E, js.Promise[A]],
    onrejected: js.Function2[/* reason */ js.Any, /* e */ E, L]
  ): fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] = js.native
}

