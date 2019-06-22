package typings
package fpDashTsLib.libTaskEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/TaskEither", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.TaskEither = js.native
  val taskEither: fpDashTsLib.libMonadMod.Monad2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libAltMod.Alt2[URI] with fpDashTsLib.libMonadIOMod.MonadIO2[URI] with fpDashTsLib.libMonadTaskMod.MonadTask2[URI] with fpDashTsLib.libMonadThrowMod.MonadThrow2[URI] = js.native
  val taskEitherSeq: fpDashTsLib.libMonadMod.Monad2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libAltMod.Alt2[URI] with fpDashTsLib.libMonadIOMod.MonadIO2[URI] with fpDashTsLib.libMonadTaskMod.MonadTask2[URI] with fpDashTsLib.libMonadThrowMod.MonadThrow2[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, bimap, chain, chainFirst, flatten, map, mapLeft, fromOption, fromPredicate, filterOrElse) */ def alt[L, A](that: js.Function0[TaskEither[L, A]]): js.Function1[/* fa */ TaskEither[L, A], TaskEither[L, A]] = js.native
  def bracket[L, A, B](
    acquire: TaskEither[L, A],
    use: js.Function1[/* a */ A, TaskEither[L, B]],
    release: js.Function2[/* a */ A, /* e */ fpDashTsLib.libEitherMod.Either[L, B], TaskEither[L, scala.Unit]]
  ): TaskEither[L, B] = js.native
  def fold[E, A, R](
    onLeft: js.Function1[/* e */ E, fpDashTsLib.libTaskMod.Task[R]],
    onRight: js.Function1[/* a */ A, fpDashTsLib.libTaskMod.Task[R]]
  ): js.Function1[/* ma */ TaskEither[E, A], fpDashTsLib.libTaskMod.Task[R]] = js.native
  def fromEither[L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): TaskEither[L, A] = js.native
  def fromIO[L, A](fa: fpDashTsLib.libIOMod.IO[A]): TaskEither[L, A] = js.native
  def fromIOEither[L, A](fa: fpDashTsLib.libIOEitherMod.IOEither[L, A]): TaskEither[L, A] = js.native
  def fromLeft[L, A](l: L): TaskEither[L, A] = js.native
  def getApplyMonoid[L, A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[TaskEither[L, A]] = js.native
  def getApplySemigroup[L, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[TaskEither[L, A]] = js.native
  def getOrElse[E, A](f: js.Function1[/* e */ E, fpDashTsLib.libTaskMod.Task[A]]): js.Function1[/* ma */ TaskEither[E, A], fpDashTsLib.libTaskMod.Task[A]] = js.native
  def getSemigroup[L, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[TaskEither[L, A]] = js.native
  def left[L, A](fl: fpDashTsLib.libTaskMod.Task[L]): TaskEither[L, A] = js.native
  def left2v[L](l: L): TaskEither[L, scala.Nothing] = js.native
  def leftIO[E](me: fpDashTsLib.libIOMod.IO[E]): TaskEither[E, scala.Nothing] = js.native
  def leftTask[E](me: fpDashTsLib.libTaskMod.Task[E]): TaskEither[E, scala.Nothing] = js.native
  def orElse[E, A, M](f: js.Function1[/* e */ E, TaskEither[M, A]]): js.Function1[/* ma */ TaskEither[E, A], TaskEither[M, A]] = js.native
  def right[L, A](fa: fpDashTsLib.libTaskMod.Task[A]): TaskEither[L, A] = js.native
  def right2v[A](a: A): TaskEither[scala.Nothing, A] = js.native
  def rightIO[A](ma: fpDashTsLib.libIOMod.IO[A]): TaskEither[scala.Nothing, A] = js.native
  def rightTask[A](ma: fpDashTsLib.libTaskMod.Task[A]): TaskEither[scala.Nothing, A] = js.native
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
    f: fpDashTsLib.libFunctionMod.Lazy[js.Promise[A]],
    onrejected: js.Function1[/* reason */ js.Any, L]
  ): TaskEither[L, A] = js.native
}

