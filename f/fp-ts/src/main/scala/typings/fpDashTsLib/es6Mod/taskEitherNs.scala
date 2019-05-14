package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "taskEither")
@js.native
object taskEitherNs extends js.Object {
  @js.native
  class TaskEither[L, A] protected ()
    extends fpDashTsLib.es6TaskEitherMod.TaskEither[L, A] {
    def this(value: fpDashTsLib.es6TaskMod.Task[fpDashTsLib.es6EitherMod.Either[L, A]]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.TaskEither = js.native
  val taskEither: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.es6TaskEitherMod.URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[fpDashTsLib.es6TaskEitherMod.URI] with fpDashTsLib.es6AltMod.Alt2[fpDashTsLib.es6TaskEitherMod.URI] with fpDashTsLib.es6MonadIOMod.MonadIO2[fpDashTsLib.es6TaskEitherMod.URI] with fpDashTsLib.es6MonadTaskMod.MonadTask2[fpDashTsLib.es6TaskEitherMod.URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow2[fpDashTsLib.es6TaskEitherMod.URI] = js.native
  val taskEitherSeq: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.es6TaskEitherMod.URI] with fpDashTsLib.es6BifunctorMod.Bifunctor2[fpDashTsLib.es6TaskEitherMod.URI] with fpDashTsLib.es6AltMod.Alt2[fpDashTsLib.es6TaskEitherMod.URI] with fpDashTsLib.es6MonadIOMod.MonadIO2[fpDashTsLib.es6TaskEitherMod.URI] with fpDashTsLib.es6MonadTaskMod.MonadTask2[fpDashTsLib.es6TaskEitherMod.URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow2[fpDashTsLib.es6TaskEitherMod.URI] = js.native
  def bracket[L, A, B](
    acquire: fpDashTsLib.es6TaskEitherMod.TaskEither[L, A],
    use: js.Function1[/* a */ A, fpDashTsLib.es6TaskEitherMod.TaskEither[L, B]],
    release: js.Function2[
      /* a */ A, 
      /* e */ fpDashTsLib.es6EitherMod.Either[L, B], 
      fpDashTsLib.es6TaskEitherMod.TaskEither[L, scala.Unit]
    ]
  ): fpDashTsLib.es6TaskEitherMod.TaskEither[L, B] = js.native
  def fromEither[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): fpDashTsLib.es6TaskEitherMod.TaskEither[L, A] = js.native
  def fromIO[L, A](fa: fpDashTsLib.es6IOMod.IO[A]): fpDashTsLib.es6TaskEitherMod.TaskEither[L, A] = js.native
  def fromIOEither[L, A](fa: fpDashTsLib.es6IOEitherMod.IOEither[L, A]): fpDashTsLib.es6TaskEitherMod.TaskEither[L, A] = js.native
  def fromLeft[L, A](l: L): fpDashTsLib.es6TaskEitherMod.TaskEither[L, A] = js.native
  def fromPredicate[L, A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, fpDashTsLib.es6TaskEitherMod.TaskEither[L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_LABA[L, A, B /* <: A */](predicate: fpDashTsLib.es6FunctionMod.Refinement[A, B], onFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, fpDashTsLib.es6TaskEitherMod.TaskEither[L, B]] = js.native
  def getApplyMonoid[L, A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6TaskEitherMod.TaskEither[L, A]] = js.native
  def getApplySemigroup[L, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6TaskEitherMod.TaskEither[L, A]] = js.native
  def getSemigroup[L, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6TaskEitherMod.TaskEither[L, A]] = js.native
  def left[L, A](fl: fpDashTsLib.es6TaskMod.Task[L]): fpDashTsLib.es6TaskEitherMod.TaskEither[L, A] = js.native
  def right[L, A](fa: fpDashTsLib.es6TaskMod.Task[A]): fpDashTsLib.es6TaskEitherMod.TaskEither[L, A] = js.native
  def taskify[L, R](
    f: js.Function1[
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function0[fpDashTsLib.es6TaskEitherMod.TaskEither[L, R]] = js.native
  def taskify[A, L, R](
    f: js.Function2[
      /* a */ A, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* a */ A, fpDashTsLib.es6TaskEitherMod.TaskEither[L, R]] = js.native
  def taskify[A, B, L, R](
    f: js.Function3[
      /* a */ A, 
      /* b */ B, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function2[/* a */ A, /* b */ B, fpDashTsLib.es6TaskEitherMod.TaskEither[L, R]] = js.native
  def taskify[A, B, C, L, R](
    f: js.Function4[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function3[/* a */ A, /* b */ B, /* c */ C, fpDashTsLib.es6TaskEitherMod.TaskEither[L, R]] = js.native
  def taskify[A, B, C, D, L, R](
    f: js.Function5[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function4[
    /* a */ A, 
    /* b */ B, 
    /* c */ C, 
    /* d */ D, 
    fpDashTsLib.es6TaskEitherMod.TaskEither[L, R]
  ] = js.native
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
  ): js.Function5[
    /* a */ A, 
    /* b */ B, 
    /* c */ C, 
    /* d */ D, 
    /* e */ E, 
    fpDashTsLib.es6TaskEitherMod.TaskEither[L, R]
  ] = js.native
  def tryCatch[L, A](
    f: fpDashTsLib.es6FunctionMod.Lazy[js.Promise[A]],
    onrejected: js.Function1[/* reason */ js.Any, L]
  ): fpDashTsLib.es6TaskEitherMod.TaskEither[L, A] = js.native
}

