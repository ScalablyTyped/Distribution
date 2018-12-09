package typings
package fpDashTsLib.libTaskEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/TaskEither", JSImport.Namespace)
@js.native
object libTaskEitherModMembers extends js.Object {
  val URI: /* TaskEither */ java.lang.String = js.native
  val bracket: js.Function3[
    /* acquire */ TaskEither[js.Any, js.Any], 
    /* use */ js.Function1[/* a */ js.Any, TaskEither[js.Any, js.Any]], 
    /* release */ js.Function2[
      /* a */ js.Any, 
      /* e */ fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
      TaskEither[js.Any, scala.Unit]
    ], 
    TaskEither[js.Any, js.Any]
  ] = js.native
  val fromEither: js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
    TaskEither[js.Any, js.Any]
  ] = js.native
  val fromIO: js.Function1[/* fa */ fpDashTsLib.libIOMod.IO[js.Any], TaskEither[js.Any, js.Any]] = js.native
  val fromIOEither: js.Function1[
    /* fa */ fpDashTsLib.libIOEitherMod.IOEither[js.Any, js.Any], 
    TaskEither[js.Any, js.Any]
  ] = js.native
  val fromLeft: js.Function1[/* l */ js.Any, TaskEither[js.Any, js.Any]] = js.native
  val getApplyMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[TaskEither[js.Any, js.Any]]
  ] = js.native
  val getApplySemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[TaskEither[js.Any, js.Any]]
  ] = js.native
  val getSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[TaskEither[js.Any, js.Any]]
  ] = js.native
  val left: js.Function1[/* fa */ fpDashTsLib.libTaskMod.Task[js.Any], TaskEither[js.Any, js.Any]] = js.native
  val right: js.Function1[/* fa */ fpDashTsLib.libTaskMod.Task[js.Any], TaskEither[js.Any, js.Any]] = js.native
  val taskEither: fpDashTsLib.libMonadMod.Monad2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libAltMod.Alt2[URI] with fpDashTsLib.libMonadIOMod.MonadIO2[URI] with fpDashTsLib.libMonadTaskMod.MonadTask2[URI] = js.native
  val taskEitherSeq: fpDashTsLib.libMonadMod.Monad2[URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[URI] with fpDashTsLib.libAltMod.Alt2[URI] with fpDashTsLib.libMonadIOMod.MonadIO2[URI] with fpDashTsLib.libMonadTaskMod.MonadTask2[URI] = js.native
  val tryCatch: js.Function2[
    /* f */ fpDashTsLib.libFunctionMod.Lazy[js.Promise[js.Any]], 
    /* onrejected */ js.Function1[/* reason */ js.Any, js.Any], 
    TaskEither[js.Any, js.Any]
  ] = js.native
  def fromPredicate[L, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], whenFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, TaskEither[L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_LABA[L, A, B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B], whenFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, TaskEither[L, B]] = js.native
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
}

