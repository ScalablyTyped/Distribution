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
  def bracket[L, A, B](
    acquire: TaskEither[L, A],
    use: js.Function1[/* a */ A, TaskEither[L, B]],
    release: js.Function2[/* a */ A, /* e */ fpDashTsLib.es6EitherMod.Either[L, B], TaskEither[L, scala.Unit]]
  ): TaskEither[L, B] = js.native
  def fromEither[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): TaskEither[L, A] = js.native
  def fromIO[L, A](fa: fpDashTsLib.es6IOMod.IO[A]): TaskEither[L, A] = js.native
  def fromIOEither[L, A](fa: fpDashTsLib.es6IOEitherMod.IOEither[L, A]): TaskEither[L, A] = js.native
  def fromLeft[L, A](l: L): TaskEither[L, A] = js.native
  def fromPredicate[L, A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, TaskEither[L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_LABA[L, A, B /* <: A */](predicate: fpDashTsLib.es6FunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, TaskEither[L, B]] = js.native
  def getApplyMonoid[L, A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[TaskEither[L, A]] = js.native
  def getApplySemigroup[L, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[TaskEither[L, A]] = js.native
  def getSemigroup[L, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[TaskEither[L, A]] = js.native
  def left[L, A](fl: fpDashTsLib.es6TaskMod.Task[L]): TaskEither[L, A] = js.native
  def right[L, A](fa: fpDashTsLib.es6TaskMod.Task[A]): TaskEither[L, A] = js.native
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

