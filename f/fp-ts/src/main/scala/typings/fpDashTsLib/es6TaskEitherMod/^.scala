package typings
package fpDashTsLib.es6TaskEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/TaskEither", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.TaskEither = js.native
  val taskEither: fpDashTsLib.es6MonadMod.Monad2[URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[URI] with fpDashTsLib.es6AltMod.Alt2[URI] with fpDashTsLib.es6MonadIOMod.MonadIO2[URI] with fpDashTsLib.es6MonadTaskMod.MonadTask2[URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow2[URI] = js.native
  val taskEitherSeq: fpDashTsLib.es6MonadMod.Monad2[URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[URI] with fpDashTsLib.es6AltMod.Alt2[URI] with fpDashTsLib.es6MonadIOMod.MonadIO2[URI] with fpDashTsLib.es6MonadTaskMod.MonadTask2[URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow2[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, bimap, chain, chainFirst, flatten, map, mapLeft, fromOption, fromPredicate, filterOrElse) */ def alt[L, A](that: js.Function0[TaskEither[L, A]]): js.Function1[/* fa */ TaskEither[L, A], TaskEither[L, A]] = js.native
  def bracket[L, A, B](
    acquire: TaskEither[L, A],
    use: js.Function1[/* a */ A, TaskEither[L, B]],
    release: js.Function2[/* a */ A, /* e */ fpDashTsLib.es6EitherMod.Either[L, B], TaskEither[L, scala.Unit]]
  ): TaskEither[L, B] = js.native
  def fold[E, A, R](
    onLeft: js.Function1[/* e */ E, fpDashTsLib.es6TaskMod.Task[R]],
    onRight: js.Function1[/* a */ A, fpDashTsLib.es6TaskMod.Task[R]]
  ): js.Function1[/* ma */ TaskEither[E, A], fpDashTsLib.es6TaskMod.Task[R]] = js.native
  def fromEither[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): TaskEither[L, A] = js.native
  def fromIO[L, A](fa: fpDashTsLib.es6IOMod.IO[A]): TaskEither[L, A] = js.native
  def fromIOEither[L, A](fa: fpDashTsLib.es6IOEitherMod.IOEither[L, A]): TaskEither[L, A] = js.native
  def fromLeft[L, A](l: L): TaskEither[L, A] = js.native
  def getApplyMonoid[L, A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[TaskEither[L, A]] = js.native
  def getApplySemigroup[L, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[TaskEither[L, A]] = js.native
  def getOrElse[E, A](f: js.Function1[/* e */ E, fpDashTsLib.es6TaskMod.Task[A]]): js.Function1[/* ma */ TaskEither[E, A], fpDashTsLib.es6TaskMod.Task[A]] = js.native
  def getSemigroup[L, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[TaskEither[L, A]] = js.native
  def left[L, A](fl: fpDashTsLib.es6TaskMod.Task[L]): TaskEither[L, A] = js.native
  def left2v[E, A](e: E): TaskEither[E, A] = js.native
  def leftIO[E, A](me: fpDashTsLib.es6IOMod.IO[E]): TaskEither[E, A] = js.native
  def leftTask[E, A](me: fpDashTsLib.es6TaskMod.Task[E]): TaskEither[E, A] = js.native
  def orElse[E, A, M](f: js.Function1[/* e */ E, TaskEither[M, A]]): js.Function1[/* ma */ TaskEither[E, A], TaskEither[M, A]] = js.native
  def right[L, A](fa: fpDashTsLib.es6TaskMod.Task[A]): TaskEither[L, A] = js.native
  def right2v[E, A](a: A): TaskEither[E, A] = js.native
  def rightIO[E, A](ma: fpDashTsLib.es6IOMod.IO[A]): TaskEither[E, A] = js.native
  def rightTask[E, A](ma: fpDashTsLib.es6TaskMod.Task[A]): TaskEither[E, A] = js.native
  def taskify[L, R](
    f: js.Function1[
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function0[TaskEither[L, R]] = js.native
  def taskify[A, L, R](
    f: js.Function2[
      /* a */ A, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* a */ A, TaskEither[L, R]] = js.native
  def taskify[A, B, L, R](
    f: js.Function3[
      /* a */ A, 
      /* b */ B, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function2[/* a */ A, /* b */ B, TaskEither[L, R]] = js.native
  def taskify[A, B, C, L, R](
    f: js.Function4[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function3[/* a */ A, /* b */ B, /* c */ C, TaskEither[L, R]] = js.native
  def taskify[A, B, C, D, L, R](
    f: js.Function5[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, TaskEither[L, R]] = js.native
  def taskify[A, B, C, D, E, L, R](
    f: js.Function6[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, TaskEither[L, R]] = js.native
  def tryCatch[L, A](
    f: fpDashTsLib.es6FunctionMod.Lazy[js.Promise[A]],
    onrejected: js.Function1[/* reason */ js.Any, L]
  ): TaskEither[L, A] = js.native
}

